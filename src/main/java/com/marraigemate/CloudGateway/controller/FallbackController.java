package com.marraigemate.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/vendorServiceFallback")
    public String vendorServiceFallback() {
        return "Vendor Service is taking too long to respond or is down. Please try again later";
    }

    @GetMapping("/vendorSearchServiceFallback")
    public String vendorSearchServiceFallback() {
        return "Vendor Search Service is taking too long to respond or is down. Please try again later";
    }
}
