package com.dmitry.borodin.ccp.controller;


import com.dmitry.borodin.ccp.entity.Interaction;
import com.dmitry.borodin.ccp.repository.CapturePointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/interactions", produces = "application/json")
public class InteractionController {

    @Autowired
    private CapturePointRepository repository;

    @GetMapping
    private List<Interaction> getInteractions(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    private Interaction getInteraction(@PathVariable("id") Integer id){
        return repository.findOne(id);
    }

    @PostMapping
    private Interaction saveInteraction(@RequestBody Interaction inx){
         return repository.save(inx);
    }

    @PutMapping("/{id}")
    private Interaction updateInteraction(@PathVariable("id") Integer id, @RequestBody Interaction inx){
        inx.setId(id);
        return repository.save(inx);
    }
}
