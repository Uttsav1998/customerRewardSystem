package com.customer.reward.dto;

public class ItemDetail {
    public ItemDto itemDetails;

    public ItemDetail() {
    }

    public ItemDetail(ItemDto itemDetails) {
        this.itemDetails = itemDetails;
    }

    public ItemDto getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(ItemDto itemDetails) {
        this.itemDetails = itemDetails;
    }
}
