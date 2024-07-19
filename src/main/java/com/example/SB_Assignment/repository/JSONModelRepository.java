package com.example.SB_Assignment.repository;

import com.example.SB_Assignment.entity.JSONModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JSONModelRepository extends JpaRepository<JSONModel, Long> {

}
