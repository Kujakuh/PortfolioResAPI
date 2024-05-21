package com.portfolio.portfoliospring.services;

import com.portfolio.portfoliospring.model.ExtrasImg;
import com.portfolio.portfoliospring.repos.ExtrasImgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtrasImgService {
    @Autowired
    private ExtrasImgRepository repos;

    public List<ExtrasImg> getAll(){
        return repos.findAll();
    }
}
