package com.example.java_web_final_project.service;

import com.example.java_web_final_project.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    Item findByName(String name);
    List<Item> findByDescriptionContains(String search);
}
