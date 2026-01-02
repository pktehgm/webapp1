package com.mg.webapp1.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {
        // Hardcoded username and password for demonstration
        boolean isValidUser = "admin".equalsIgnoreCase(username);
        boolean isValidPassword = "gigi123".equals(password);
        return isValidPassword && isValidUser;
    }

}
