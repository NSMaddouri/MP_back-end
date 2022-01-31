package com.examplegroupe.interiorservice.repository;

import com.examplegroupe.interiorservice.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public  interface InfoRepository extends JpaRepository<Info,Long> {
    Info findByInfoId(Long id);
}
