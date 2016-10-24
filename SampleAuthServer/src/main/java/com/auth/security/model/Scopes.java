package com.auth.security.model;

/**
 * Scopes
 * 
 * @author andrewsohn
 *
 * Oct 24, 2016
 */
public enum Scopes {
    REFRESH_TOKEN;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}