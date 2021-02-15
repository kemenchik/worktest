package com.example.demo.controllers;


import com.example.demo.entities.Banner;
import com.example.demo.repos.BannerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    BannerRepo bannerRepo;



    @GetMapping
    public String checkBanners(Model model){
        Iterable<Banner> banners = bannerRepo.findAll();
        model.addAttribute("banners", banners);

        return "banners";
    }

}
