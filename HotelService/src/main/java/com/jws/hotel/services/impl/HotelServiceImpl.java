package com.jws.hotel.services.impl;
import com.jws.hotel.entites.Hotel;
import com.jws.hotel.exceptions.ResourceNotFoundException;
import com.jws.hotel.repositories.HotelRepository;
import com.jws.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
 @Autowired
   private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
       String hotelId= UUID.randomUUID().toString();
       hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with Given ID not found!!"));
    }
}
