package com.batch46.ideacapture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IdeaController {
    @Autowired
    private IdeaService ideaService;   // http://localhost:8080/delete/{id}

    @GetMapping("/all")
    public List<Idea> allIdeas(){
        return ideaService.allIdeas();
    }
    @PostMapping("/add")
    public void addIdea(@RequestBody Idea idea){
        ideaService.addidea(idea);
    }
    @PutMapping("/update/{id}")
    public void updateIdea(@PathVariable Integer id,@RequestBody Idea idea){
        ideaService.updateIdea(id,idea);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteIdea(@PathVariable Integer id){
        ideaService.deleteIdea(id);
    }
}
