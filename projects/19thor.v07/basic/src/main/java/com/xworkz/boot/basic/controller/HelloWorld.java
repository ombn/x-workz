package com.xworkz.boot.basic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.boot.basic.entity.MessageEntity;
import com.xworkz.boot.basic.service.HelloWorldService;

@RestController
public class HelloWorld {
	
	@Autowired
	private HelloWorldService helloWorldService;

	public HelloWorld() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/message")
	public Map<String,Object> getMessage() {
		Map<String,Object> map=new HashMap();
		map.put("name", "om");
		map.put("email", "om.bn@outlook.com");
		return map;
	}
	
	
	@RequestMapping("/save")
	public String save()
	{
		MessageEntity entity=new MessageEntity();
		entity.setFrom("om");
		entity.setTo("Kishore");
		entity.setMessage("Saving data");
		entity.setMid(1);
		helloWorldService.save(entity);
		return "saved";
	}
}
