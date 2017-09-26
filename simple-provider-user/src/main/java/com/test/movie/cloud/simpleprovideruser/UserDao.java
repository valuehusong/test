package com.test.movie.cloud.simpleprovideruser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface  UserDao extends  JpaRepository<User, Long> {

}
