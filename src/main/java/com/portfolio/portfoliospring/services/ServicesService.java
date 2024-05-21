package com.portfolio.portfoliospring.services;

import com.portfolio.portfoliospring.model.ExtrasImg;
import com.portfolio.portfoliospring.model.Services;
import com.portfolio.portfoliospring.repos.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {
    @Autowired
    private ServicesRepository repos;

    public List<Services> getAll(){
        return repos.findAll();
    }
}
