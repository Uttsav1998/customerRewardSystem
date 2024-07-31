package com.customer.reward.endpoint;

import com.customer.reward.dto.Profile;
import com.customer.reward.services.CustomerService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class CustomerEndpoint {
    @Autowired
    private CustomerService customerService;


    @PostMapping("/register")
    public ResponseEntity<Profile> registerCustomer(@RequestBody Profile profile)
    {
        ResponseEntity<Profile> responseEntity = null;
        try {
            profile = customerService.saveOrUpdateCustomer(profile);
            responseEntity = ResponseEntity.ok(profile);

        }
        catch (Exception e)
        {
            responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return responseEntity;
    }
    @PutMapping("/update")
    public ResponseEntity<Profile> updateCustomer(@RequestBody Profile profile)
    {
        ResponseEntity<Profile> responseEntity = null;
        try {
            profile = customerService.saveOrUpdateCustomer(profile);
            responseEntity = ResponseEntity.ok(profile);

        }
        catch (Exception e)
        {
            responseEntity = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return responseEntity;
    }
}
