package com.demo.jpa.topic;

import java.util.List;

public interface TopicInterface {
	public List<Topic> getAllTopics();
	public Topic getTopic(int id);
	public void addTopic(Topic topic);
	public void updateTopic(int id, Topic topic);
}
