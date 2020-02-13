package com.elm.tjseer.tjseer.Controllers;


import com.elm.tjseer.tjseer.Models.User;
import com.elm.tjseer.tjseer.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
public class UserController {


    @Autowired
    private UserServices userServices;

    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user){
        return userServices.addUser(user);
    }

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUsers(){
        return userServices.getAllUsers();
    }

    @GetMapping(value = "/getUser")
    public User getUser(@PathVariable("userID") int userID){
        return userServices.getUser(userID);

    }

    @PutMapping("/updetUser/{id}")
    public User updateUsers(@RequestBody User user,@PathVariable("id") int userID){

        return userServices.updateUsers(user,userID) ;
    }


    @DeleteMapping(value = "/deleteUser")
    public void deleteUser(@PathVariable("userID") int userID){
        userServices.delete(userID);

    }

    @DeleteMapping(value = "/deleteAll")
    public String deleteAllUser(){
        return userServices.deleteAllUsers();
    }

}
