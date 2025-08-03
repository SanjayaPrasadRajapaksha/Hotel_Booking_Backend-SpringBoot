package com.cpd.hotel_system.hotel_management_service_api.dto.response.paginate;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BranchPaginateResponseDto {
    private List<BranchPaginateResponseDto> dataList;
    private long dataCount;
}
