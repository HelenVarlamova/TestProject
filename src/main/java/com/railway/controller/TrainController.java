package com.railway.controller;

import com.railway.model.Train;
import com.railway.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Администратор on 19.10.2015.
 */
@Controller
public class TrainController {

    @Autowired
    private TrainService trainService;

    @RequestMapping(value = "/alltrains", method = RequestMethod.GET)
    public String welcome(Model model)
    {

        List<Train> listOfTrains = trainService.getAllTrains();

        model.addAttribute("listOfTrains", listOfTrains);
        model.addAttribute("train", new Train());
        return "listEmployeeView";
    }

    @RequestMapping(value = "/admin/addTrain", method = RequestMethod.GET)
    public String addTrain(Model model)
    {
        model.addAttribute("train", new Train());
        return "admin/addTrain";
    }


    @RequestMapping(value = "/admin/addTrain", method = RequestMethod.POST)
       public String hello(@ModelAttribute("train") Train train){
        	trainService.addTrain(train);
        return "admin/addTrain";
    }
}
