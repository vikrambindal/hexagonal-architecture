package com.vikram.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "product_order")
public class OrderJpaEntity {

    private static final String PRODUCT_ID_COLUMN = "product_id";

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer amount;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = PRODUCT_ID_COLUMN)
    private ProductJpaEntity product;
}
