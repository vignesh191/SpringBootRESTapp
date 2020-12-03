package com.example.testing.dao;

import java.util.ArrayList;

import com.example.testing.model.Country;

public interface CountryDao {

    Country getCountryByCode(String code);

    ArrayList<Country> getAllCountries();


}
