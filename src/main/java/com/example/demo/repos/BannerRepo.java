package com.example.demo.repos;

import com.example.demo.entities.Banner;
import org.springframework.data.repository.CrudRepository;


public interface BannerRepo extends CrudRepository<Banner, Long> {
}
