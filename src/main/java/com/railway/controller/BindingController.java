package com.railway.controller;

import com.railway.model.StationBinding;
import com.railway.service.BindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Администратор on 29.10.2015.
 */
@Controller
public class BindingController {

    @Autowired
    private BindingService bindingService;

    @RequestMapping(value = "/admin/addBinding", method = RequestMethod.GET)
    public String addBinding(Model model)
    {
        //model.addAttribute("urlcont", request.getRequestURL());
        model.addAttribute("stationBinding", new StationBinding());
        return "admin/addBinding";
    }


    @RequestMapping(value = "/admin/addBinding", method = RequestMethod.POST)
    public String addNewBinding(@ModelAttribute("stationBinding") StationBinding stationBinding){
        bindingService.addBinding(stationBinding);
        return "admin/addBinding";
    }

}
