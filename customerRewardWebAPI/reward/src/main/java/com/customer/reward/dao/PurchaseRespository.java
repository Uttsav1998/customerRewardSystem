package com.customer.reward.dao;

import com.customer.reward.entities.PurchaseOrder;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRespository extends CrudRepository<PurchaseOrder,Integer> {
}
