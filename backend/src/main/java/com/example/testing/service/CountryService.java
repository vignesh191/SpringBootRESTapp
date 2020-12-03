package com.example.testing.service;

import java.util.ArrayList;

import com.example.testing.dao.CountryDao;
import com.example.testing.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    private final CountryDao countryDao;

    @Autowired
    public CountryService(@Qualifier("orientDao") CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public Country getCountry(String code) {
        return countryDao.getCountryByCode(code);
    }

    public ArrayList<Country> getAllCountries() {
        return countryDao.getAllCountries();
    }
}
