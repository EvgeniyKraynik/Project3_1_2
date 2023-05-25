package com.kraynikevgeniy.karaprojects.dao;



import com.kraynikevgeniy.karaprojects.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(int id);

    void saveUser(User user);

    void updateUser(User updatedUser);

    void removeUser(int id);
}
