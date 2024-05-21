package com.portfolio.portfoliospring.controller;

import com.portfolio.portfoliospring.model.TechnicalSkills;
import com.portfolio.portfoliospring.model.WhoIsThisGuy;
import com.portfolio.portfoliospring.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    String index() {return "index";}
    @RequestMapping("/mywork")
    String portfolio() { return "portfolio"; }

    @GetMapping("/")
    String indexPage(Model model){
        List<TechnicalSkills> skills = techService.getAll();
        model.addAttribute("skills", skills);
        //List<WhoIsThisGuy> guys = whoService.getAll();
        //model.addAttribute("imgUrl", guys.get(0).getImageURL());
        return "index";
    }


}
