package com.vikram.persistence.repository;

import com.vikram.persistence.entity.OrderJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderJpaEntity, Integer> {
}
