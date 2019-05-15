package com.xworkz.store.util;

import java.util.Date;

import com.xworkz.store.dao.IStoreDAO;
import com.xworkz.store.dao.StoreDAO;
import com.xworkz.store.dto.StoreDTO;

public class Tester {

	public static void main(String[] args) {

		StoreDTO storeDTO = new StoreDTO();
		storeDTO.setName("Max");
		storeDTO.setNoOfEmps(100);
		//storeDTO.setSid(20);
		storeDTO.setStoreType("Textiles");

		IStoreDAO dao = new StoreDAO();
		Integer idSavedInDb=dao.insert(storeDTO);
		System.out.println("idSavedInDb"+idSavedInDb);

		System.out.println(new Date());
	}

}
