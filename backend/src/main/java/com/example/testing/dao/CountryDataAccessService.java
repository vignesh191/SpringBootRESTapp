package com.example.testing.dao;

import java.util.ArrayList;

import com.example.testing.model.Country;
import com.orientechnologies.orient.core.db.ODatabaseSession;
import com.orientechnologies.orient.core.db.OrientDB;
import com.orientechnologies.orient.core.db.OrientDBConfig;
import com.orientechnologies.orient.core.sql.executor.OResult;
import com.orientechnologies.orient.core.sql.executor.OResultSet;
import org.springframework.stereotype.Repository;

@Repository("orientDao")
public class CountryDataAccessService implements CountryDao {

    private static OrientDB orient = new OrientDB("remote:localhost", OrientDBConfig.defaultConfig());

    @Override
    public Country getCountryByCode(String code) {
        ODatabaseSession db = orient.open("demodb", "admin", "admin");

        String query = "SELECT from Countries where Code = ?";
        OResultSet rs = db.query(query, code);

        Country output = null;

        if (rs.hasNext()) {
            OResult item = rs.next();
            output = new Country(item.getProperty("Id"), item.getProperty("Name"), item.getProperty("Code"));
        }

        rs.close();
        db.close();
        //orient.close();
        return output;
    }

    @Override
    public ArrayList<Country> getAllCountries() {
        ODatabaseSession db = orient.open("demodb", "admin", "admin");

        String query = "SELECT from Countries";
        OResultSet rs = db.query(query);

        ArrayList<Country> countries = new ArrayList<Country>();

        while (rs.hasNext()) {
            OResult item = rs.next();
            countries.add(new Country(item.getProperty("Id"), item.getProperty("Name"), item.getProperty("Code")));
        }

        rs.close();
        db.close();
        //orient.close();
        return countries;
    }


}
