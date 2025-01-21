package com.Project.SCM_System.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")

public class Customer {
    @Id
    private String custId;
    private String firstName;
    private String lastName;
    private String email;
    private String telephoneNo;
    private String addressLine;
    private String city;
    private String country;
    private String postalCode;
    
    public String getcustId(){
        return custId;
    }

    public void setcustId(String custId){
        this.custId = custId;
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

    public String gettelephoneNo(){
        return telephoneNo;
    }

    public void settelephoneNo(String telephoneNo){
        this.telephoneNo = telephoneNo;
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

    public String getcountry(){
        return country;
    }

    public void setcountry(String country){
        this.country = country;
    }

    public String getpostalCode(){
        return postalCode;
    }

    public void setpostalCode(String postalCode){
        this.postalCode = postalCode;
    }
}
