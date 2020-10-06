//package com.xworkz.registartionapp.demo.service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//public class Test {
//
//	private static Map<String, Object> v2JsonStringList = new HashMap<>();
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String json = "{\"movie\":{\"name\":\"1\",\"trdt\":\"\",\"address\":\"hghg\"}}";
//		String json1 = "{\"movie\":{\"name\":\"2\",\"trdt\":\"\",\"address\":\"hghg\"}}";
//		String json2 = "{\"movie\":{\"name\":\"3\",\"trdt\":\"\",\"address\":\"hghg\"}}";
//		String json3 = "{\"movie\":{\"name\":\"4\",\"trdt\":\"\",\"address\":\"hghg\"}}";
//		String json4 = "{\"movie\":{\"name\":\"5\",\"trdt\":\"\",\"address\":\"hghg\"}}";
//		try {
//			Object obj = new JSONParser().parse(json.trim());
//			JSONObject jo = (JSONObject) obj;
//			for (Object entry : jo.keySet()) {
//				String key = entry.toString();
//				String value = jo.get(entry).toString();
//				System.out.println("key " + key + " and value " + value);
//			}
//			// getting firstName and lastName
//			JSONObject jsonValue = (JSONObject) jo.get("movie");
////        System.out.println(jsonValue + " and " );
//
////		v2JsonStringList.put("", "");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
