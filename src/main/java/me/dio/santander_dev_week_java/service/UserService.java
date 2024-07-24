package me.dio.santander_dev_week_java.service;

import me.dio.santander_dev_week_java.model.User;

public interface UserService {

    User findById(Long id);

    User create (User userToCreate);

}
