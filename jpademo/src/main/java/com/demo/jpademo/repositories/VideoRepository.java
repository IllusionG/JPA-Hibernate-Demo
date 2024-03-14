package com.demo.jpademo.repositories;

import com.demo.jpademo.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
