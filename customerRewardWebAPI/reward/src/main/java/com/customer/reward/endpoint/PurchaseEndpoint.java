package com.customer.reward.endpoint;

import com.customer.reward.dto.PurchaseOrderDto;
import com.customer.reward.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseEndpoint {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/buyItems")
    public ResponseEntity<PurchaseOrderDto> buyItems(@RequestBody PurchaseOrderDto purchaseOrderDto)
    {
        ResponseEntity<PurchaseOrderDto> responseEntity = null;
        try{
            purchaseOrderDto = purchaseService.purchaseItems(purchaseOrderDto);
            responseEntity = ResponseEntity.ok(purchaseOrderDto);
        }
        catch(Exception e)
        {
            responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return responseEntity;
    }
}
