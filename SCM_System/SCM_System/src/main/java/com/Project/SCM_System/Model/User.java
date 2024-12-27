package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")

public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public String getuserId(){
        return userId;
    }

    public void setuserId(String userId){
        this.userId = userId;
    }

    public String getfirstName(){
        return firstName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getemail(){
        return email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String getpassword(){
        return password;
    }

    public void setpassword(String password){
        this.password = password;
    }
}
