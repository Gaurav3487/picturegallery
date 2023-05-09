package com.picturegallery.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.picturegallery.model.Landscapes;

@Repository
public interface LandscapeGalleryRepository extends JpaRepository<Landscapes, Serializable> {

}
