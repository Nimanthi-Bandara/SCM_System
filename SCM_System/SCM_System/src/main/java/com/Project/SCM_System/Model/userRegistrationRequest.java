package com.Project.SCM_System.Model;

public class userRegistrationRequest {
    private String email;
    private String firstName;

    public String getEmail(){
        return email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
}
