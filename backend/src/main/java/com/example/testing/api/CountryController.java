package com.example.testing.api;


import java.util.ArrayList;

import com.example.testing.model.Country;
import com.example.testing.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/country")
@RestController
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path = "{code}")
    public Country getCountry(@PathVariable("code") String code) {
        return countryService.getCountry(code);
    }

    @GetMapping(path = "/")
    public ArrayList<Country> getAllCountries() {
        return countryService.getAllCountries();
    }


}
