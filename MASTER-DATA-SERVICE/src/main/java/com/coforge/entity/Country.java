package com.coforge.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "country")
public class Country {
	
	@Id
	private int _id;
	
	@Field(name = "country_code")
	private String countryCode;
	
	@Field(name = "country_name")
	private String countryName;

}
