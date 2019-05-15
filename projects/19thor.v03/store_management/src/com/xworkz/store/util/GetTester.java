package com.xworkz.store.util;

import com.xworkz.store.dao.IStoreDAO;
import com.xworkz.store.dao.StoreDAO;
import com.xworkz.store.dto.StoreDTO;

public class GetTester {

	public static void main(String[] args) {

		IStoreDAO dao = new StoreDAO();
		StoreDTO obj = dao.getById(50);
		//System.out.println(obj != null ? obj.getName() : "dto not there");
		if (obj != null) {
			System.out.println(obj.getName());
		} else {
			System.out.println("dto not there");
		}

	}

}
