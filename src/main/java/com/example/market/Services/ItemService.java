package com.example.market.Services;

import com.example.market.Models.Item;
import com.example.market.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {

        return itemRepository.findAll();
    }
}
