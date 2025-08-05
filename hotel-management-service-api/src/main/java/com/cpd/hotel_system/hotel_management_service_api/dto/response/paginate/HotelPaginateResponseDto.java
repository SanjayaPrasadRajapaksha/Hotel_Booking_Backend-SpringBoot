package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import lombok.*;

import java.util.List;

import com.cpd.hotel_system.hotel_management_service_api.dto.response.ResponseHotelDto;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelPaginateResponseDto {
    private List<ResponseHotelDto> dataList;
    private long dataCount;
}
