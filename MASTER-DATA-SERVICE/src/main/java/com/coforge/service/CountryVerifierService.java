package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.CountryRepository;
import com.coforge.entity.Country;
import com.coforge.exception.CountryNotAvailableException;

@Service
public class CountryVerifierService {
	
	@Autowired
	CountryRepository countryRepository;
	
	public Country addCountryDetail(Country country) {
		return countryRepository.save(country);
	}
	
	public List<Country> getCountryList(){
		
		return countryRepository.findAll();
	}
	
	public Country getCountryDetailBasisOnCountryName(String countryName) {
		Country object = countryRepository.findAll().stream().filter(s->s.getCountryName().equals(countryName))
				.findFirst().orElse(null);
		if(object== null)
			throw new CountryNotAvailableException("Country is not available for admission of requested country name");
		else
			return object;
	}

}
