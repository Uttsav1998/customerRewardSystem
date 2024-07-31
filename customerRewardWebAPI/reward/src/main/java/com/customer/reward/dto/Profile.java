package com.customer.reward.dto;

public class Profile {
    public CustomerDto customerDetails;

    public Profile() {
    }

    public Profile(CustomerDto customerDetails) {
        this.customerDetails = customerDetails;
    }

    public CustomerDto getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDto customerDetails) {
        this.customerDetails = customerDetails;
    }
}
