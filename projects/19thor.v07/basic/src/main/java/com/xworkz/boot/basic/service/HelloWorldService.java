package com.xworkz.boot.basic.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.boot.basic.entity.MessageEntity;
import com.xworkz.boot.basic.repository.MessageRepository;

@Service
public class HelloWorldService {
	//SessionFactory===EntityManagerFactory
	//Session==EntityManager
	@Autowired
	MessageRepository messageRepository;

	public HelloWorldService() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public void save(MessageEntity entity) {
		messageRepository.save(entity);
	}

}
