package com.REST.Lazareva;

import java.time.LocalDate;

public class User {
    public final String login;
    public final String password;

    public LocalDate currentDate;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        currentDate = LocalDate.now();
    }

    public User(){
        login = "boba";
        password = "biba";
        currentDate = LocalDate.now();
    }

    public String Login() {
        return login;
    }

    public String Password() {
        return password;
    }
   // public LocalDate CurrentDate() {return currentDate;}


}
