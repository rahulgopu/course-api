package io.rahulbrains.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {
        List<Topic> courses = new ArrayList<>();
        topicRepository.findAll()
                .forEach(courses::add);
        return courses;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic course) {
        topicRepository.save(course);
    }

    public void updateTopic(Topic course, String id) {
        topicRepository.save(course);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
