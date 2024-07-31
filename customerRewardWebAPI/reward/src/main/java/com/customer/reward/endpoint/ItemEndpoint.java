package com.customer.reward.endpoint;

import com.customer.reward.dto.ItemDto;
import com.customer.reward.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemEndpoint {

    @Autowired
    private ItemService itemService;

    @PostMapping("/addItem")
    public ResponseEntity<ItemDto> addItem (@RequestBody ItemDto itemDto)
    {
        ResponseEntity<ItemDto> responseEntity = null;
        try{
            itemDto = itemService.addItems(itemDto);
            responseEntity = ResponseEntity.ok(itemDto);
        }
        catch(Exception e)
        {
            responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return responseEntity;
    }

    @PostMapping("/getItem")
    public ResponseEntity<List<ItemDto>> getItems()
    {
        ResponseEntity<List<ItemDto>> responseEntity = null;
        try{
            List<ItemDto> itemDtos = itemService.getItems();
            responseEntity = ResponseEntity.ok(itemDtos);
        }
        catch(Exception e)
        {
            responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return responseEntity;
    }
}
