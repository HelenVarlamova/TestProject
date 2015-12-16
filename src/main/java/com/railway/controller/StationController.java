package com.railway.controller;

import com.railway.model.Station;
import com.railway.model.StationBinding;
import com.railway.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ������������� on 24.10.2015.
 */
@Controller
public class StationController {
    @Autowired
    private StationService stationService;

    @RequestMapping(value = "/admin/addStation", method = RequestMethod.GET)
    public String addNewStation(Model model){

        model.addAttribute("station", new Station());
       // model.addAttribute("stationBinding", new StationBinding());
        return "admin/addStation";
    }

    @RequestMapping(value = "/admin/addStation", method = RequestMethod.POST)
    public String saveNewStation(@ModelAttribute("station") Station station){

        stationService.addStation(station);
        return "admin/addStation";
    }

}
