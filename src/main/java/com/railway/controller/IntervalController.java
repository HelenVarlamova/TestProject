package com.railway.controller;

import com.railway.model.Interval;
import com.railway.model.Station;
import com.railway.service.IntervalService;
import com.railway.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Time;
import java.util.List;

/**
 * Created by ������������� on 24.10.2015.
 */
@Controller
public class IntervalController {
    @Autowired
    private IntervalService intervalService;

    @Autowired
    private StationService stationService;

    @RequestMapping(value = "/admin/addInterval", method = RequestMethod.GET)
    public String addNewInterval(Model model){
        List<Station> listOfStations = stationService.getAllStations();
        model.addAttribute("interval", new Interval());
        model.addAttribute("listOfStations", listOfStations);
        return "admin/addInterval";
    }

    @RequestMapping(value = "/admin/addInterval", method = RequestMethod.POST)
    public String saveNewInterval (@ModelAttribute("interval") Interval interval, Model model){
        intervalService.addInterval(interval);
        model.addAttribute("interval", new Interval());
        return "admin/addInterval";
    }
}
