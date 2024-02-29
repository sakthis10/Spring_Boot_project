package com.example.onetomany.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String customerName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "des_id")
    private List<Booking> book;

    public int getPlantId() {
        return customerId;
    }

    public void setPlantId(int customerId) {
        this.customerId = customerId;
    }

    public String getPlantName() {
        return customerName;
    }

    public void setPlantName(String customerName) {
        this.customerName = customerName;
    }

    public List<Booking> getBookings() {
        return book;
    }

    public void setDes(List<Booking> book) {
        this.book = book;
    }

}