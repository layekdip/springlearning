package com.springtest.learning.springlearning.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDsoService {
    private static List<User> users = new ArrayList<>();
    private static int userCounter = 3;

    static {
        users.add(new User(1, "Dip", new Date()));
        users.add(new User(2, "Sayani", new Date()));
        users.add(new User(3, "Sanchari", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User saveUser(User userInfo){
        if(userInfo.getId() == null){
            userInfo.setId(++userCounter);
        }
        users.add(userInfo);
        return userInfo;
    }

    public User findOne(int id){
        for (User userInfo:users){
            if (userInfo.getId() == id){
                return userInfo;
            }
        }
        return null;
    }
}
