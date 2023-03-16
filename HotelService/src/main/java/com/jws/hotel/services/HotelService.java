package com.jws.hotel.services;

import com.jws.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {
//create
   Hotel create(Hotel hotel);
    //getall
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}
