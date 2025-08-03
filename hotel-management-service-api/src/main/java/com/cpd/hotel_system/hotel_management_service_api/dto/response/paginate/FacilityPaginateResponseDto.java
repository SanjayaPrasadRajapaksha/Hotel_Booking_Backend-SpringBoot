package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacilityPaginateResponseDto {
    private List<RoomPaginateResponseDto> dataList;
    private long dataCount;
}
