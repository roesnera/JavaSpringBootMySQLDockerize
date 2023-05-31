package com.example.java_web_final_project.controller;

import com.example.java_web_final_project.model.Item;
import com.example.java_web_final_project.model.ItemDTO;
import com.example.java_web_final_project.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/items")
public class DockerizeController {

    private final ItemService service;

    @GetMapping
    public List<Item> getAllItems(){
        return service.findAll();
    }

    @PostMapping
    public void saveNewItem(@RequestBody ItemDTO item){
        service.saveItem(item);
    }
}
