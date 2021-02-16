package com.example.demo.repos;

import com.example.demo.entities.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerRepo extends JpaRepository<Banner, Integer> {

    @Override
    List<Banner> findAll();
    List<Banner> findAllByCategoryName(String name);
    List<Banner> findAllById(Integer id);
    List<Banner> findAllByCategoryNameAndId(String name, Integer id);
}
