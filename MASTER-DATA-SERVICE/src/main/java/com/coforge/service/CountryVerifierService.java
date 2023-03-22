package com.coforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.CountryRepository;
import com.coforge.entity.Country;

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
	
	public Optional<Country> getCountryDetailBasisOnCountryName(String countryName) {
		return countryRepository.findAll().stream().filter(s->s.getCountryName().equals(countryName)).findFirst();
	}

}
