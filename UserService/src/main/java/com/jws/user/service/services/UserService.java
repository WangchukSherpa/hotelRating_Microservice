package com.jws.user.service.services;

import com.jws.user.service.entities.User;
import java.util.List;

public interface UserService {
    //user operation
    //create user
    User saveUser(User user);
    //get all user
    List<User> getAllUser();
    //get String User of given userID
    User getUser(String userId);
    //TODO: delete
    //TODO: update

}
