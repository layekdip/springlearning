package com.springtest.learning.springlearning.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDsoService service;

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User findUser = service.findOne(id);
        if ( findUser == null )
            throw new UserNotFoundException("id = " + id + " Does not exist, please check!!!");
        return findUser;
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody User userDetails){
        User newUser = service.saveUser(userDetails);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
