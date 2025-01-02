package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Supplier")
public class Supplier {
    @Id
    private String suppId;
    private String firstName;
    private String lastName;
    private String email;
    private String telNo;
    private String addressLine;
    private String city;
    private String postalCode;
    private String country;


    public String getsuppId(){
        return suppId;
    }

    public void setsuppId(String suppId){
        this.suppId = suppId;
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

    public String gettelNo(){
        return telNo;
    }

    public void settelNo(String telNo){
        this.telNo = telNo;
    }

    public String getaddressLine(){
        return addressLine;
    }

    public void setaddressLine(String addressLine){
        this.addressLine = addressLine;
    }

    public String getcity(){
        return city;
    }

    public void setcity(String city){
        this.city = city;
    }

    public String getpostalCode(){
        return postalCode;
    }

    public void setpostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getcountry(){
        return country;
    }

    public void setcountry(String country){
        this.country = country;
    }
}
