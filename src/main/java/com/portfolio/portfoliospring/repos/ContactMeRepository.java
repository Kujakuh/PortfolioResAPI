package com.portfolio.portfoliospring.repos;

import com.portfolio.portfoliospring.model.ContactMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactMeRepository extends JpaRepository<ContactMe, Long> {
}
