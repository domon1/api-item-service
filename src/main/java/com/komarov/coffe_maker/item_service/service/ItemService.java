package com.komarov.coffe_maker.item_service.service;

import com.komarov.coffe_maker.item_service.model.Item;
import com.komarov.coffe_maker.item_service.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item findById(Long id) {
        return itemRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Item> findByCategoryId(Long id) {
        return itemRepository.findAllByCategory_Id(id);
    }

    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}
