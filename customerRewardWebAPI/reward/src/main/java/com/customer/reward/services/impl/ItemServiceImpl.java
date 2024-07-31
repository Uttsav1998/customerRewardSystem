package com.customer.reward.services.impl;

import com.customer.reward.dao.ItemRepository;
import com.customer.reward.dto.ItemDto;
import com.customer.reward.entities.Item;
import com.customer.reward.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;


    @Override
    public ItemDto addItems(ItemDto itemDto) {
        Item item = dtoToItem(itemDto);
        item = itemRepository.save(item);
        return itemToDto(item);
    }

    @Override
    public List<ItemDto> getItems() {
        Iterable<Item> items = itemRepository.findAll();
        List<ItemDto> itemDtos = new ArrayList<>();
        items.forEach(item -> itemDtos.add(itemToDto(item)));
        return itemDtos;
    }


    private ItemDto itemToDto (Item item)
    {
        return new ItemDto(item.getItemId(),item.getName(),item.getPrice(),item.getPurchaseOrder());
    }
    private Item dtoToItem(ItemDto itemDto)
    {
        return new Item(itemDto.getItemId(),itemDto.getName(), itemDto.getPrice(),itemDto.getPurchaseOrder());
    }
}
