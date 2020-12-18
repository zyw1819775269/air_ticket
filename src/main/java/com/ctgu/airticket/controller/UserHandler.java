package com.ctgu.airticket.controller;

import com.ctgu.airticket.entity.TUser;
import com.ctgu.airticket.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<TUser> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return userRepository.findAll(request);
    }
//
//    @GetMapping("/findById/{user_id}")
//    public User findById(@PathVariable("user_id") Integer id){
//        return userRepository.findById(id).get();
//    }
//
//    @PostMapping("/save")
//    public String save(@RequestBody User user){
//        User result = userRepository.save(user);
//        if(result != null){
//            return "success";
//        }else{
//            return "error";
//        }
//    }
//    @PutMapping("/update")
//    public String update(@RequestBody User user){
//        User result = userRepository.save(user);
//        if(result != null){
//            return "success";
//        }else{
//            return "error";
//        }
//    }
//
//    @DeleteMapping("/deleteById/{user_id}")
//    public void deleteById(@PathVariable("user_id") Integer id){
//        userRepository.deleteById(id);
//    }

}
