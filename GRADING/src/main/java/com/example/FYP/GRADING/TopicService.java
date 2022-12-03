package com.example.FYP.GRADING;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    private static TopicRepository repository=null;
    @Autowired
    public TopicService(TopicRepository repository){
        this.repository=repository;

    }

    public static void addTopic(Topic std) {
        repository.save(std);

    }

    public static void deleteTopic(long TopicId) {
        boolean exists=repository.existsById(TopicId);
        if(!exists){
            throw new IllegalStateException("agent with id"+TopicId+"does not exists");
        }
        repository.deleteById(TopicId);
    }


    @GetMapping
    public List<Topic> gettopics() {
        return repository.findAll();

    }
    public Optional<Topic> gettopic(long topic_Id)
    {
        return repository.findById(topic_Id);

    }
}