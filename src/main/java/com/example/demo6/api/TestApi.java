package com.example.demo6.api;

import com.example.demo6.service.VendorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("test")
@RestController
//@RequiredArgsConstructor
public class TestApi {
    private final VendorService vendorService;

    public TestApi(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping("123")
    public ResponseEntity test123() {
        return ResponseEntity.ok("hello world!");
    }
    @PostMapping("demo")
    public ResponseEntity demo11(){
        return  ResponseEntity.ok("hello");
    }
}
