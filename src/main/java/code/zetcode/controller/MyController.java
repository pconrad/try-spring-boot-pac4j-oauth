package com.zetcode.controller;

import com.zetcode.bean.City;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.zetcode.service.ICityService;

@Controller
public class MyController {

    @Autowired
    private ICityService cityService;

    @RequestMapping("/")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping("/showCities")
    public ModelAndView showCities() {

        List<City> cities = cityService.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("cities", cities);

        return new ModelAndView("showCities", params);
    }
}