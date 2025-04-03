package com.mongkhonapi.crud.controllers;

import com.mongkhonapi.crud.entity.User;
import com.mongkhonapi.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User request){
        request.setId(0);
        return userService.save(request);
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User res = userService.findById(id);

        if (res == null){
            throw new RuntimeException("ไม่มีผู้ใช้ "+id);
        }
        return res;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        User user = userService.findById(id);
        if (user == null){
            throw new RuntimeException("ไม่มีผู้ใช้ "+id);
        }
        userService.deleteUserById(id);
        return "ลบข้อมูลผู้ใช้ "+id ;
    }


    @PutMapping("/users")
    public User updateUsers(@RequestBody User request){
        return userService.save(request);
    }
}
