package com.cpd.hotel_system.hotel_management_service_api.service;

import com.cpd.hotel_system.hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomImagePaginateResponseDto;
import com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate.RoomPaginateResponseDto;

public interface RoomImageService {
    public void create(ResponseRoomImageDto dto);
    public void update(ResponseRoomImageDto dto, String roomImageId);
    public void delete(String roomImageId);
    public ResponseRoomImageDto findById(String roomImageId);
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId);
}
