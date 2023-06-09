package com.coforge.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.coforge.entity.Country;

@Repository
public interface CountryRepository extends MongoRepository<Country, String>{

}
