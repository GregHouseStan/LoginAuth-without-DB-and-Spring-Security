package com.example.LoginAuth.without.DB.and.Spring.Security;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LogInProcessor {
    private final LoggedUserManagementService loggedUserManagementService;

    private String username;
    private String password;

    public LogInProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }


    public boolean login() {
        String username = this.getUsername();
        String password = this.getPassword();

        boolean loginResult = false;

        if ("natalie".equals(username) && "password".equals(password)) {
            loginResult = true;
       loggedUserManagementService.setUsername(username);
    }
    return loginResult;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
