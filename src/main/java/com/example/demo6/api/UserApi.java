package com.example.demo6.api;

import com.example.demo6.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserApi {
    private final UserService userService;
    @GetMapping("")
    public ResponseEntity getList(){
        try {
            return ResponseEntity.ok(userService.getList());
        }catch ( Exception ex){
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }
    @GetMapping("/{id}")
    public  ResponseEntity getDetail(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(userService.getDetail(id));
        }catch ( Exception ex){
            return (ResponseEntity) ResponseEntity.badRequest();
        }
    }
    @PostMapping("")
    public ResponseEntity postCreate(@RequestBody Object payload){
        return  ResponseEntity.ok("Hello");
    }
    @PutMapping("/{id}")
    public ResponseEntity putUpdate(@PathVariable Integer id){
        return  ResponseEntity.ok("Hello");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delRemove(@PathVariable Integer id){
        return  ResponseEntity.ok("Hello");
    }

}
