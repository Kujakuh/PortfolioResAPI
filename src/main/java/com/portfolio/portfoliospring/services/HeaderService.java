package com.portfolio.portfoliospring.services;

import com.portfolio.portfoliospring.model.ExtrasImg;
import com.portfolio.portfoliospring.model.Header;
import com.portfolio.portfoliospring.repos.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeaderService {
    @Autowired
    private HeaderRepository repos;

    public List<Header> getAll(){
        return repos.findAll();
    }
}
