package com.picturegallery.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picturegallery.model.Landscapes;
import com.picturegallery.repository.LandscapeGalleryRepository;
import com.picturegallery.service.LandscapesGalleryService;

@Service
public class LandscapeGalleryServiceImpl implements LandscapesGalleryService {

	@Autowired
	private LandscapeGalleryRepository landscapeGalleryRepository;
	
	
	
	@Override
	public Landscapes addLandscapes(Landscapes landscapes) {
		Landscapes addlandscape=landscapeGalleryRepository.save(landscapes);
		return addlandscape;
	}

	@Override
	public void deleteLandscape(Integer id) {
		landscapeGalleryRepository.deleteById(id);
		
	}

	@Override
	public List<Landscapes> getLandscapesList() {
		List<Landscapes> landscapeslist= landscapeGalleryRepository.findAll();
		return landscapeslist;
	}

	@Override
	public Optional<Landscapes> getLandscapeById(Integer id) {
		Optional<Landscapes> landscape =landscapeGalleryRepository.findById(id);
		return landscape;
	}

	@Override
	public Landscapes updateLandscapeById(Landscapes landscapes) {
		
		return landscapeGalleryRepository.save(landscapes);
	}

}
