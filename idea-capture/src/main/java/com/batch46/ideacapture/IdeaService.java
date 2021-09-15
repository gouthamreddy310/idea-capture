package com.batch46.ideacapture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdeaService {
    @Autowired
    private IdeaRepository ideaRepository;


    //create- addIdea(Idea idea)
    //read- allIdea(), ideaById
    //update- updateIdea(id,idea)
    //delete- deleteIdea(id)

    public List<Idea> allIdeas(){
        List<Idea> ideas= new ArrayList<>();    //iterable ite

        ideaRepository.findAll().forEach(ideas::add);
        return ideas;
    }

    public void addidea(Idea idea){
        ideaRepository.save(idea); //insert
    }

    public void updateIdea(Integer id, Idea idea){
        ideaRepository.save(idea); //update
    }
    public void deleteIdea(Integer id){
        ideaRepository.deleteById(id);

    }


}
