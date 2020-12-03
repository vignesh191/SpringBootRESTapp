package com.example.testing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
    private final long id;
    private final String name;
    private final String code;

    public Country(@JsonProperty("Id") long id, @JsonProperty("Name") String name, @JsonProperty("Code") String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public long getId() {
        return id;
    }
}

