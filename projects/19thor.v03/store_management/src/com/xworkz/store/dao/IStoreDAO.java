package com.xworkz.store.dao;

import com.xworkz.store.dto.StoreDTO;

public interface IStoreDAO {

	public Integer insert(StoreDTO dto);
	
	
	public StoreDTO getById(int id);

}
