package com.example.demooo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demooo.model.Hotel;
import com.example.demooo.service.HotelService;

@RequestMapping("/Hotel")
@RestController
public class HotelController {
    private final HotelService HS;
    @Autowired
    public HotelController(HotelService HS){
        this.HS=HS;
    }
    @PostMapping("/add")
    public Hotel AddItem(@RequestBody Hotel H){
        Hotel H1=HS.AddtoMyCart(H);
            return H1;
    }



    @GetMapping("/Details")
    public ResponseEntity<List<Hotel>> getAll(){
        List<Hotel> items=HS.HotelList();
        return new ResponseEntity<>(items,HttpStatus.CREATED);
    }
    @GetMapping("/Detailss/{user_id}")
    public ResponseEntity<Hotel> getById(@PathVariable int user_id){
        Hotel H=HS.Find(user_id);
        if(H!=null){
            return new ResponseEntity<>(H,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/update/{user_id}")
    public ResponseEntity<Hotel> updateData(@PathVariable int user_id,@RequestBody Hotel H){
        return new ResponseEntity<>(HS.update(user_id,H),HttpStatus.OK);
    }



    @DeleteMapping("/delete/{user_id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable int user_id){
        return new ResponseEntity<>(HS.deleteById(user_id),HttpStatus.OK);
    }
}