package com.portfolio.portfoliospring.controller;

import com.portfolio.portfoliospring.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mapping {
    @Autowired
    private ContactMeService contactService;
    @Autowired
    private ExtrasImgService extService;
    @Autowired
    private HeaderService headerService;
    @Autowired
    private ProjectsService projectService;
    @Autowired
    private ServicesService sService;
    @Autowired
    private TechnicalSkillsService techService;
    @Autowired
    private WhoIsThisGuyService whoService;

    @RequestMapping("/")
    String index() {

        return "index";
    }
    @RequestMapping("/mywork")
    String portfolio() { return "portfolio"; }
}
