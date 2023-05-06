package com.nit.crudoperationrepo.Service;

import com.nit.crudoperationrepo.Entity.User;
import com.nit.crudoperationrepo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public User insertUser(User user) {
        User save = userRepo.save(user);
        return save;
    }

    @Override
    public User UpdateUser(Long Id, User user) {

        User existingUser = userRepo.findById(Id).get();

        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setAddress(user.getAddress());
        User save = userRepo.save(existingUser);

        return save;
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepo.findById(id).get();

        userRepo.delete(user);
    }

    @Override
    public List<User> getAllUser() {
        List<User> all = userRepo.findAll();
        return all;
    }
}
