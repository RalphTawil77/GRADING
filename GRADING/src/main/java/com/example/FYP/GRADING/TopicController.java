package com.example.FYP.GRADING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/topic")
public class TopicController {
    @Autowired
    private final TopicService service;

    public TopicController(TopicService service){
        this.service=service;
    }

    @GetMapping
    public List<Topic> gettopics(){
        return service.gettopics();
    }
    @GetMapping(path="/{TopicId}")
    public Optional<Topic> getopics(@PathVariable("teacherId") long topic_Id)
    {
        return service.gettopic(topic_Id);
    }

    @PostMapping("/addTopic")
    public String registerTopic( @RequestBody Topic std){
        TopicService.addTopic(std);
        return "topic added successfully";
    }
    @DeleteMapping(path="/{topicId}")
    public void deleteTopic(@PathVariable("teacherId") Long topic_Id){
        TopicService.deleteTopic(topic_Id);

    }

}


