package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.Item;
import com.example.java_web_final_project.model.ItemDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository repository;

    public List<Item> findAll(){
        return repository.findAll();
    }

    public void saveItem(ItemDTO itemDTO){
        Item itemToSave = Item.builder()
                .name(itemDTO.name())
                .description(itemDTO.description())
                .price(itemDTO.price())
                .build();
        repository.save(itemToSave);
    }
}
