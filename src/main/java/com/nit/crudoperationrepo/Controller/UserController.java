package com.nit.crudoperationrepo.Controller;

import com.nit.crudoperationrepo.Entity.User;
import com.nit.crudoperationrepo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user) {

        User user1 = userService.insertUser(user);


        return new ResponseEntity<User>(user1, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User user1 = userService.UpdateUser(id, user);
        return new ResponseEntity<User>(user1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<String>("deleted successfully with id" + id, HttpStatus.OK);
    }


    @GetMapping("/getuser")
    public ResponseEntity<List<User>> getUser() {
        List<User> allUser = userService.getAllUser();
        return new ResponseEntity<List<User>>(HttpStatus.OK);

    }
}
