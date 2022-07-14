package com.cleo.blogAPI.users;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {


    User findByUsername(String username);
    User getById(Long id);
}
