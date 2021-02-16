package com.example.demo.controllers;


import com.example.demo.entities.Banner;
import com.example.demo.repos.BannerRepo;
import com.example.demo.repos.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/html/index.html")
public class MainController {


    @Autowired
    private BannerRepo bannerRepo;

    @Autowired
    private CategoryRepo categoryRepo;


    @GetMapping
    public List<Banner> banner(@RequestParam (required = false, defaultValue = "0") Integer id,
                               @RequestParam(required = false, defaultValue = "") String name){

        List<Banner> bannersFromDB;

        if (name.equals("") && name.isEmpty()) {

            if (id == 0)
                bannersFromDB = bannerRepo.findAll();
            else
                bannersFromDB = bannerRepo.findAllById(id);

        }
        else
        if (id == 0)
            bannersFromDB = bannerRepo.findAllByCategoryName(name);
        else
            bannersFromDB = bannerRepo.findAllByCategoryNameAndId(name, id);
        return bannersFromDB;
    }
    @PostMapping
    public void addBanner(Banner banner){
        bannerRepo.save(banner);
    }
}
