package com.example.demooo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demooo.model.Hotel;
@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer>{
    
}
