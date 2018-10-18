package com.zetcode.service;

import com.zetcode.bean.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<City> findAll() {

        String sql = "SELECT * FROM CITIES";

        List<City> cities = jtm.query(sql, new BeanPropertyRowMapper(City.class));

        return cities;
    }
}