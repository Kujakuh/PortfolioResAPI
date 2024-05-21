package com.portfolio.portfoliospring.services;

import com.portfolio.portfoliospring.model.ExtrasImg;
import com.portfolio.portfoliospring.model.WhoIsThisGuy;
import com.portfolio.portfoliospring.repos.WhoIsThisGuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhoIsThisGuyService {
    @Autowired
    private WhoIsThisGuyRepository repos;

    public List<WhoIsThisGuy> getAll(){
        return repos.findAll();
    }
    public WhoIsThisGuy getAt(Long id){ return repos.findById(id).orElse(null);}
}
