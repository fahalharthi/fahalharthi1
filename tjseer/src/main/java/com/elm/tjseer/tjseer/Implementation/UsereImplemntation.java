package com.elm.tjseer.tjseer.Implementation;

import com.elm.tjseer.tjseer.Models.User;
import com.elm.tjseer.tjseer.Repository.UserRepository;
import com.elm.tjseer.tjseer.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsereImplemntation implements UserServices {

    @Autowired
  public UserRepository repo;

    @Override
    public User addUser(User user) {
        return repo.save(user) ;
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUser(int userID) {
        return repo.findById(userID).get();
    }

    @Override
    public User updateUsers(User user, int userID) {
        user.setUserid(userID);
        return repo.save(user);
    }

    @Override
    public void delete(int userID) {
        repo.deleteById(userID);
    }

    @Override
    public String deleteAllUsers() {
        repo.deleteAll();
        return "All users deleted";
    }
}

