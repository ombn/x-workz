package com.xworkz.boot.basic.repository;

import org.springframework.data.repository.CrudRepository;

import com.xworkz.boot.basic.entity.MessageEntity;

public interface MessageRepository extends CrudRepository<MessageEntity, Integer> {

}
