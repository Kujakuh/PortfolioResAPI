package com.portfolio.portfoliospring.repos;

import com.portfolio.portfoliospring.model.ExtrasImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtrasImgRepository extends JpaRepository<ExtrasImg, Long> {
}

