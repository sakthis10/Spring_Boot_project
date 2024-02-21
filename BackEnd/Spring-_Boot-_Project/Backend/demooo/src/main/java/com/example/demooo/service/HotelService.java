package com.example.demooo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demooo.model.Hotel;
import com.example.demooo.repository.HotelRepo;


@Service
public class HotelService {
    private final HotelRepo HR;
    @Autowired
    public HotelService(HotelRepo HR){
        this.HR=HR;
    }


    //Post
    public Hotel AddtoMyCart(Hotel H){
        return HR.save(H);
    }


    //Get
    public List<Hotel> HotelList(){
        return HR.findAll();
    }
    public Hotel Find(int id){
        return HR.findById(id).orElse(null);
    }
    


    //Delete
    public boolean deleteById(int user_id){
        HR.deleteById(user_id);
        return true;
    }
    


    //Update
    public Hotel update(int id,Hotel H){
        Hotel H1=HR.findById(id).orElse(null);
        if(H1!=null){
            H1.setUser_name(H.getUser_name());
            H1.setPassword(H.getPassword());
            H1.setLocation(H.getLocation());
            H1.setDays(H.getDays());
            return HR.save(H1);
        }
        else{
            return HR.save(H);
        }
    }
}