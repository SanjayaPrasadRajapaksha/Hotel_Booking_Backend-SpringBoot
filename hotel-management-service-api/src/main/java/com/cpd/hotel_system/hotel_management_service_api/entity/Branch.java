package com.cpd.hotel_system.hotel_management_service_api.entity;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Branch {
    @Id
    @Column(name="branch_id")
    private String branchId;

    @Column(name="room_count")
    private String roomCount;

    @Column(name="branch-type", nullable=false)
    private BranchType branchType;

    @Column(name="branch-name", nullable=false)
    private BranchType branchName;








}
