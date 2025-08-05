package com.cpd.hotel_system.hotel_management_service_api.service;

import java.sql.SQLException;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.HotelPaginateResponseDto;

public interface HotelService {
    public void create(RequestHotelDto dto);
    public void update(RequestHotelDto dto, String hotelId)throws SQLException;
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId)throws SQLException;
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);
}
