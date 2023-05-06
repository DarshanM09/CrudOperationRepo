package com.nit.crudoperationrepo.Service;

import com.nit.crudoperationrepo.Entity.User;

import java.util.List;

public interface UserService {

    User insertUser(User user);

    User UpdateUser(Long Id,User user);

    void deleteUser(Long id);

    List<User> getAllUser();


}
