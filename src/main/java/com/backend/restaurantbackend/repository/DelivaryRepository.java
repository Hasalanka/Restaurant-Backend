package com.backend.restaurantbackend.repository;

import com.backend.restaurantbackend.model.DelivaryDeets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DelivaryRepository extends JpaRepository<DelivaryDeets, Long> {
}
