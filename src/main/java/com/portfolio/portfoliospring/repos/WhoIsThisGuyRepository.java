package com.portfolio.portfoliospring.repos;

import com.portfolio.portfoliospring.model.WhoIsThisGuy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WhoIsThisGuyRepository extends JpaRepository<WhoIsThisGuy, Long> {
}

