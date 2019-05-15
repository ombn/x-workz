package com.xworkz.tourism.service.addplace;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.tourism.dao.addplace.AddPlaceDAO;
import com.xworkz.tourism.dto.addplace.AddPlaceDTO;
import com.xworkz.tourism.entity.addpalce.AddPlaceEntity;
import com.xworkz.tourism.exception.DAOException;

@Service
public class AddPlaceServiceImpl implements AddPlaceService {
	
	
	@Autowired
	private AddPlaceDAO addPlaceDAO;

	public AddPlaceServiceImpl() {
		System.out.println("Created\t" + this.getClass().getSimpleName());
	}

	@Override
	public Integer save(AddPlaceDTO dto) {
		System.out.println("invoked save from service");
		if (dto != null) {// dto is not null
			System.out.println("dto is found , will start validation");
			boolean valid = false;//start validation, this should be true to save into DB
			String place = dto.getPlace();//validate place
			if (place != null && !place.isEmpty() && place.length() > 3
					&& place.length() < 15) {
				System.out.println("place is valid");
				valid = true;
			} else {
				System.out.println("palce is invalid");
				valid = false;
			}

			System.out.println("End of validation , data is valid :\t" + valid);
			if (valid) {
				System.out.println("save into db");
				
				AddPlaceEntity addPlaceEntity=new AddPlaceEntity();
				BeanUtils.copyProperties(dto, addPlaceEntity);
				try {
					addPlaceDAO.save(addPlaceEntity);
				} catch (DAOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("dint not save into DB");
			}

		}
		return null;
	}

}
