package com.clown.address.api;

import com.clown.address.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AddressController {

    List<Address> listOfAddresses = new ArrayList<>();

    @GetMapping("/addresses")
    public List<Address> getAllAddresss(){
        return listOfAddresses;
    }

    @GetMapping("/addressesinstring")
    public String getAllAddresssAsString(){
        return "Im Speitel, Karlsruhe 76229";
    }

    @GetMapping("/address/{id}")
    public Address getAddress(int empId){
        return new Address(empId, "Im speitel", 82399, "Munich");
    }

    @PostMapping("/addresses")
    public void createAddress() {
        listOfAddresses.add(new Address(1, "Im speitel", 82399, "Munich"));
        listOfAddresses.add(new Address(1, "Ludwig-thoma-str", 82004, "Munich"));
    }
}
