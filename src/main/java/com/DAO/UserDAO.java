package com.DAO;

import com.entity.User;
import org.springframework.context.annotation.Bean;


import java.util.List;


public interface UserDAO {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(Long id);

    public void deleteUser(Long id);
}