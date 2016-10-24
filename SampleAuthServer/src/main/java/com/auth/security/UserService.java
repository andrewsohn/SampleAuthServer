package com.auth.security;

import java.util.Optional;

import com.auth.entity.User;

/**
 * 
 * @author andrewsohn
 *
 * Oct 24, 2016
 */
public interface UserService {
	public Optional<User> getByUsername(String username);
}