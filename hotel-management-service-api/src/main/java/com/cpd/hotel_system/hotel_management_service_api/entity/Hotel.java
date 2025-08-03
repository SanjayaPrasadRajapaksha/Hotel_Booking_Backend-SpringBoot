package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "hotel_id", length=80)
    private String hotelId;

    @Column(name = "hotel_name", nullable = false, length = 100)
    private String hotelName;

    @Column(name = "start_rating", nullable = false)
    private int startRating;

    @Column(nullable = false)
    @Lob
    private Blob description;

    @Column(name = "created_at", nullable = false)
    private LocalTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalTime updatedAt;

    @Column(name = "active_status")
    private Boolean activeStatus;

    @Column(name = "starting_from")
    private BigDecimal startingFrom;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Branch> branches;
}
