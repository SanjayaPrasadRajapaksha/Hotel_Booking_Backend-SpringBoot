package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseHotelDto {
    private String hotelId;
    private String activeStatus;
    private LocalDateTime cratedAt;
    private LocalDateTime updatedAt;
    private String description;
    private String hotelName;
    private int startRating;
    private BigDecimal startingFrom;
    private List<ResponseBranchDto> branches;

}
