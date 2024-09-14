package com.chandra.controller;

import com.chandra.util.ServiceUtils;
import com.chandra.vo.Customer;
import com.chandra.vo.CustomerResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @GetMapping("/hello")
    public String sayHello(String name) {
        return "Hello from Springboot " + name;

    }

    @PostMapping(path = "/send",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<CustomerResponse> sendMessage(@RequestBody Customer customer)
            throws JsonProcessingException {

        String jsonStr = ServiceUtils.toJsonFromObject(customer);
        ServiceUtils.toXmlFromJson(jsonStr);

        CustomerResponse response = new CustomerResponse();
        response.setCustomer(customer);
        response.setXmlCustomer(jsonStr);

        return ResponseEntity.ok().body(response);
    }
}
