package com.mayank.leapsclothesrentalapplication.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    public String extractUsername(String jwt) {
        return null;
    }

    public boolean isTokenValid(String jwt, UserDetails userDetails) {
        return true;
    }
}
