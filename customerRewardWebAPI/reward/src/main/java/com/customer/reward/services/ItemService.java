package com.customer.reward.services;

import com.customer.reward.dto.ItemDto;

import java.util.List;

public interface ItemService {

    public ItemDto addItems(ItemDto itemDto);

    public List<ItemDto> getItems();


}
