package com.rpf.inventory.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "RPF_INVENTORY")
@Data
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private Long record_id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

}
