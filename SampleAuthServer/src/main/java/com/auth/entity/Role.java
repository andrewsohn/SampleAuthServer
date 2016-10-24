package com.auth.entity;

/**
 * Enumerated {@link User} roles.
 * 
 * @author andrewsohn
 *
 * Oct 24, 2016
 */
public enum Role {
	ADMIN, PREMIUM_MEMBER, MEMBER;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}