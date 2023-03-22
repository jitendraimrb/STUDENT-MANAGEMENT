package com.coforge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entity.Country;
import com.coforge.exception.CountryNotAvailableException;
import com.coforge.service.CountryVerifierService;

@RestController
@RequestMapping("/student/country")
public class CountryVerifierController {
	
	@Autowired
	CountryVerifierService contryService;
	
	@PostMapping("/addCountry")
	public Country addCountry(@RequestBody Country country) {
		return contryService.addCountryDetail(country);
	}
	
	@GetMapping("/countryList")
	public List<Country> getCountryList(){
		return contryService.getCountryList();
	}
	
	@GetMapping("/countryByCountryName/{countryName}")
	public Country getCountryList(@PathVariable("countryName") String countryName) throws CountryNotAvailableException{
		return contryService.getCountryDetailBasisOnCountryName(countryName);
	}
}
