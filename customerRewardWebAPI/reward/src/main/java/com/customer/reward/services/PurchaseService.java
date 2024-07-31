package com.customer.reward.services;

import com.customer.reward.dto.PurchaseOrderDto;
import com.customer.reward.entities.PurchaseOrder;

public interface PurchaseService {

    public PurchaseOrderDto purchaseItems(PurchaseOrderDto purchaseOrderDto);

}
