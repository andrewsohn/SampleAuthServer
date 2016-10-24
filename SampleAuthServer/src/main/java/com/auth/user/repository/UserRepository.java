package com.auth.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.auth.entity.User;

/**
 * UserRepository
 * 
 * @author andrewsohn
 *
 * Oct 24, 2016
 */
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select u from User u left join fetch u.roles r where u.username=:username")
    public Optional<User> findByUsername(@Param("username") String username);
}