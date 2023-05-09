package com.picturegallery.service;

import java.util.List;
import java.util.Optional;

import com.picturegallery.model.Landscapes;

public interface LandscapesGalleryService {

	public Landscapes addLandscapes(Landscapes landscapes);
	
	public void deleteLandscape(Integer id);
	
	public List<Landscapes> getLandscapesList();
	
	public Optional<Landscapes> getLandscapeById(Integer id);
	
	public Landscapes updateLandscapeById(Landscapes landscapes);
	
}
