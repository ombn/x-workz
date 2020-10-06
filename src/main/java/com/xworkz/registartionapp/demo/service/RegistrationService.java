package com.xworkz.registartionapp.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.xworkz.registartionapp.demo.model.Response;
import com.xworkz.registartionapp.demo.model.SavedObjects;

@Service
public class RegistrationService {

	private static final String SUCCESS = "success";

	private static Map<Integer, Object> savedObjects = new HashMap<>();

	private static Map<String, List<Object>> v2SavedObjects = new HashMap<>();

	private static Integer count = 0;

	public Response registerUser(Object request) throws Exception {
		savedObjects.put(count, request);
		SavedObjects data = new SavedObjects();
		data.setId(count);
		data.setData(request);
		List<SavedObjects> dataList = new ArrayList<>();
		dataList.add(data);
		Response response = new Response();
		response.setMessage(SUCCESS);
		response.setDataList(dataList);
		count++;
		return response;
	}

	public Response fetchuser(int id) throws Exception {
		Response response = new Response();
		response.setMessage(SUCCESS);
		SavedObjects data = new SavedObjects();
		data.setId(id);
		data.setData(savedObjects.get(id));
		List<SavedObjects> dataList = new ArrayList<>();
		dataList.add(data);
		response.setDataList(dataList);
		return response;
	}

	public Response fetchalluser() throws Exception {
		Response response = new Response();
		response.setMessage(SUCCESS);
		List<SavedObjects> dataList = new ArrayList<>();
		for (Map.Entry<Integer, Object> entry : savedObjects.entrySet()) {
			SavedObjects data = new SavedObjects();
			data.setId(entry.getKey());
			data.setData(entry.getValue());
			dataList.add(data);
		}
		response.setDataList(dataList);
		return response;
	}

	public Response removeOne(int id) throws Exception {
		Response response = new Response();
		response.setMessage(SUCCESS);
		savedObjects.remove(id);
		return response;
	}

	public Response clear() throws Exception {
		savedObjects.clear();
		Response response = new Response();
		response.setMessage(SUCCESS);
		return response;
	}

	/**
	 * V2 methods
	 */
	public Response saveData(Object request) throws Exception {
		String jsonDataStr = JSONObject.toJSONString((Map<?, ?>) request);
		JSONObject jo = (JSONObject) new JSONParser().parse(jsonDataStr);
		for (Object entry : jo.keySet()) {
			String key = entry.toString();
			String value = jo.get(entry).toString();
			Object dataObj = new JSONParser().parse(value);
			if (v2SavedObjects.containsKey(key)) {
				List<Object> objList = v2SavedObjects.get(key);
				objList.add(dataObj);
			} else {
				List<Object> objList = new ArrayList<>();
				objList.add(dataObj);
				v2SavedObjects.put(key, objList);
			}
			System.out.println("key " + key + " and value " + value);
		}
		Response response = new Response();
		response.setMessage(SUCCESS);
		return response;
	}

	public Response fetchData(String category) throws Exception {
		Response response = new Response();
		List<Object> dataList = v2SavedObjects.get(category);
		if (dataList == null || dataList.size() == 0) {
			response.setMessage("Requested data not available.");
		} else {
			response.setMessage(SUCCESS);
			response.setStoredDataList(dataList);
		}
		return response;
	}

	public Response fetchAllData() throws Exception {
		Response response = new Response();
		response.setMessage(SUCCESS);
		List<Object> dataList = new ArrayList<>();
		for (Map.Entry<String, List<Object>> entry : v2SavedObjects.entrySet()) {
			JSONObject newObj = new JSONObject();
			newObj.put(entry.getKey(), entry.getValue());
			dataList.add(newObj);
		}
		response.setStoredDataList(dataList);
		return response;
	}

	public Response removeData(String category) throws Exception {
		Response response = new Response();
		response.setMessage(SUCCESS);
		v2SavedObjects.remove(category);
		return response;
	}

	public Response clearAllData() throws Exception {
		v2SavedObjects.clear();
		Response response = new Response();
		response.setMessage(SUCCESS);
		return response;
	}

}
