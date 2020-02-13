package com.elm.tjseer.tjseer.Services;

import com.elm.tjseer.tjseer.Models.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserServices {

    public User addUser(User user);

    public List<User> getAllUsers();

    public User getUser (int userID);

    public User updateUsers (User user,int userID);

    public void delete(int userID);

    public String deleteAllUsers();

}
