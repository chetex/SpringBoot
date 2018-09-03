package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService implements TopicInterface {

	/**
	 * Create mock topic list
	 */
	private List<Topic> listTopic = new ArrayList<>(Arrays.asList(
			new Topic(0, "nacho", "Creador"), 
			new Topic(1, "pepe", "ddd")));
	
	/**
	 * Return all list topics
	 * @return
	 */
	public List<Topic> getAllTopics() {
		return listTopic;
	}
	
	/**
	 * Get all topic list which match with sended id
	 * @param id
	 * @return
	 */
	public Topic getTopic(int id) {
		return listTopic.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		listTopic.add(topic);
	}

	/**
	 * Iterate over all topics, and search for id topic. 
	 * Then update current topic object 2
	 * 
	 * @param id
	 * @param topic
	 */
	public void updateTopic(int id, Topic topic) {
		for (int i=0; i < listTopic.size(); i++) {
			Topic t = listTopic.get(i);
			if (t.getId() == id) {
				listTopic.set(i, topic);
			}
		}
	}

	/**
	 * Delete topic
	 * 
	 * @param id
	 * @param topic
	 */
	public void deleteTopic(int id, Topic topic) {
		listTopic.removeIf(response -> response.getId() == id);
	}
}