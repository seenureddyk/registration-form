package com.example.registrationform;


import javax.persistence.*;

@Entity
@Table
    public class User {
        @Id
        private Long eid;
        private String email;
        private String phonenum;
        private String password;
        private String firstname;
        private String lastname;

    public User() {

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public User(Long eid,String email, String phonenum, String password, String firstname,String lastname) {
        this.eid=eid;
        this.email = email;
        this.phonenum = phonenum;
        this.password = password;
        this.firstname = firstname;
        this.lastname=lastname;
    }

    public Long getEid() {
        return eid;
    }

    public void setEid(Long eid) {
        this.eid = eid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
