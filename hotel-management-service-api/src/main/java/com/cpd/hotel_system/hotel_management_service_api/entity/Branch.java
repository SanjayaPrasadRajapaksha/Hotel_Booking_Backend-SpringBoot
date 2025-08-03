package com.cpd.hotel_system.hotel_management_service_api.entity;

import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "branch")
public class Branch {
    @Id
    @Column(name = "branch_id", length = 80)
    private String branchId;

    @Column(name = "room_count")
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch-type", nullable = false)
    private BranchType branchType;

    @Column(name = "branch-name", nullable = false)
    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id") //can use any name because column name to mapping data
    private Hotel hotel; //hotel name same for mapped by name on hotel

    @OneToOne(mappedBy = "branch", cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Room> rooms;

}