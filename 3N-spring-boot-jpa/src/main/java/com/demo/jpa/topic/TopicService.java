package com.demo.jpa.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService implements TopicInterface {

	@Autowired
	private TopicRepository topicRepository;
	
	/**
	 * CRUD -> Get all topics from database
	 * @return
	 */
	public List<Topic> getAllTopics() {
		List<Topic> topicList = new ArrayList<>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	
	/**
	 * CRUD -> Save single topic in database
	 */
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	/**
	 * CRUD -> Get single topic from DB
	 * 
	 * @param id
	 * @return
	 */
	public Topic getTopic(int id) {
		return topicRepository.findById(id).get();
	}

	/**
	 * CRUD -> Update topic. Is the same as add, because it knows the id
	 * 
	 * @param id
	 * @param topic
	 */
	public void updateTopic(int id, Topic topic) {
		topicRepository.save(topic);
	}

	/**
	 * CRUD -> Delete repository
	 * 
	 * @param id
	 * @param topic
	 */
	public void deleteTopic(int id, Topic topic) {
		topicRepository.delete(topic);
	}
}