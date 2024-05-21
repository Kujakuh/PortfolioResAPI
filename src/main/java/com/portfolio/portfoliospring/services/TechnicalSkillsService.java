package com.portfolio.portfoliospring.services;

import com.portfolio.portfoliospring.model.ExtrasImg;
import com.portfolio.portfoliospring.model.TechnicalSkills;
import com.portfolio.portfoliospring.repos.TechnicalSkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicalSkillsService {
    @Autowired
    private TechnicalSkillsRepository repos;

    public List<TechnicalSkills> getAll(){
        return repos.findAll();
    }
}
