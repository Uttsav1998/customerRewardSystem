package com.customer.reward.services.impl;

import com.customer.reward.dao.PurchaseRespository;
import com.customer.reward.dto.PurchaseOrderDto;
import com.customer.reward.entities.PurchaseOrder;
import com.customer.reward.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRespository purchaseRespository;

    @Override
    public PurchaseOrderDto purchaseItems(PurchaseOrderDto purchaseOrderDto) {
        PurchaseOrder purchaseOrder = dtoToPurchasrOrder(purchaseOrderDto);
        purchaseOrder = purchaseRespository.save(purchaseOrder);
        return purchasrOrderToDto(purchaseOrder);
    }

    private PurchaseOrder dtoToPurchasrOrder(PurchaseOrderDto purchaseOrderDto)
    {
        return new PurchaseOrder(purchaseOrderDto.getPoId(),purchaseOrderDto.getItems(),purchaseOrderDto.getTotalAmount(),purchaseOrderDto.getCustomer());
    }
    private PurchaseOrderDto purchasrOrderToDto(PurchaseOrder purchaseOrder)
    {
        return new PurchaseOrderDto(purchaseOrder.getPoId(),purchaseOrder.getItems(),purchaseOrder.getTotalAmount(),purchaseOrder.getCustomer());
    }
}
