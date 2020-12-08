package com.ebunk.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="daily sales")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class dailySale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String typeOfOil;
    private BigDecimal meterReading;
    private BigDecimal quantity;
    private BigDecimal saleAmount;
    private BigDecimal price;
    private Date date;
    private String operator;
    private String manager;
    private BigDecimal beginingReading;
    private BigDecimal amountCollected;
    private String meterReadingImage;
    private String collectionProofImage;
    private String month;

}
