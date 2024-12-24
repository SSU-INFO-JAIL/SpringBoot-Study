package com.example.demo.repository;

import com.example.demo.entity.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalariesRepository extends JpaRepository<Salaries, Integer> {

    // 랜덤으로 N개의 데이터를 가져오는 쿼리
    @Query(value = "SELECT * FROM salaries ORDER BY RAND() LIMIT :count", nativeQuery = true)
    List<Salaries> findRandomSalaries(@Param("count") int count);
}