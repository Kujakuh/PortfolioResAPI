package com.portfolio.portfoliospring.services;

import com.portfolio.portfoliospring.repos.ContactMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMeService {
    @Autowired
    private ContactMeRepository repos;

}
