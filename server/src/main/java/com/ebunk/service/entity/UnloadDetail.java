package com.ebunk.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="unload_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnloadDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String typeOfOil;
    private Date dateOfUnload;
    private BigDecimal price;
    private Integer unloadQuantity;
    private BigDecimal amountPaid;
    private String vehicleNo;
    private String otherDetails;
    private String unloadImage;
    
}