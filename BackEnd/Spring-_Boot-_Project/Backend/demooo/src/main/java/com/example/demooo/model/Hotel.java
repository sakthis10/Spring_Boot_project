package com.example.demooo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String user_name;
    private String password;
    private String email_id;
    private String mobile;
    private String HotelName;
    private String Location;
    private int days;
    public Hotel() {
    }
    public Hotel(int user_id, String user_name, String password, String email_id, String mobile, String hotelName,
            String location, int days) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.email_id = email_id;
        this.mobile = mobile;
        HotelName = hotelName;
        Location = location;
        this.days = days;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail_id() {
        return email_id;
    }
    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getHotelName() {
        return HotelName;
    }
    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    
}
