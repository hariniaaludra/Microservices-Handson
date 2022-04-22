package com.module.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.module.sales.entity.SalesOrder;

public interface SalesRepository extends JpaRepository<SalesOrder, Long> {

}
