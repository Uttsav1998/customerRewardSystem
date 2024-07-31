package com.customer.reward.services.impl;

import com.customer.reward.dao.CustomerRepository;
import com.customer.reward.dto.CustomerDto;
import com.customer.reward.dto.Profile;
import com.customer.reward.entities.Customer;
import com.customer.reward.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Profile saveOrUpdateCustomer(Profile profile) {
        Customer customer=dtoToCust(profile.getCustomerDetails());
        customer = customerRepository.save(customer);
        CustomerDto customerDto = custToDto(customer);
        profile.setCustomerDetails(customerDto);
        return profile;
    }


    private Customer dtoToCust (CustomerDto customerDto)
    {
        return new Customer(customerDto.getCustomerId(),customerDto.getName(),customerDto.getAge(),customerDto.getNumber(),customerDto.getRewardPoint(),customerDto.getPurchaseOrders());
    }
    private CustomerDto custToDto (Customer customer)
    {
        return new CustomerDto(customer.getCustomerId(),customer.getName(),customer.getAge(),customer.getNumber(),customer.getRewardPoint(),customer.getPurchaseOrders());
    }
}
