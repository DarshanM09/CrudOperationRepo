package com.nit.crudoperationrepo.Repository;

import com.nit.crudoperationrepo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
