package com.vikram.persistence.repository;

import com.vikram.persistence.entity.ProductJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductJpaEntity, Integer> {
}
