package com.example.demo6.service;

import com.example.demo6.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private  final UserRepository userRepository;
    public Object getList(){
        return userRepository.findAll();
    }
    public Object postCreate(Object payload){
        return  null;
    }
    public Object putUpdate(Integer id, Object payload){
        return  null;
    }
    public Object delRemove(Integer id){
        return  null;
    }
    public Object getDetail(Integer id){
        return  userRepository.findAllById(id);
    }
}
