package com.auth.security.auth.jwt.verifier;

/**
 * 
 * @author andrewsohn
 *
 * Oct 24, 2016
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
