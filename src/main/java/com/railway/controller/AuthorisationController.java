package com.railway.controller;

import com.railway.model.Station;
import com.railway.model.Train;
import com.railway.model.User;
import com.railway.model.UserA;
import com.railway.service.AuthorizationService;
import com.railway.service.RoleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ������������� on 24.10.2015.
 */
@Controller
public class AuthorisationController {

    @Autowired
    private AuthorizationService authorizationService;

    @Autowired
    RoleService roleService;

    private static final Logger log = Logger.getLogger(AuthorisationController.class);
  //  private static final Logger log2 = Logger.getLogger()
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model,  HttpServletRequest request, HttpServletResponse response) {
        log.info("Это информационное сообщение!");
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );
  //      model.addAttribute("train", new Train());
   //     model.addAttribute("user", new User());
        model.addAttribute("urlcont", request.getRequestURL());
        UserA userForm = new UserA();
        model.addAttribute("userForm", userForm);
     //   return new ModelAndView("user", "userForm", userForm);

        ApplicationContext context =
                new FileSystemXmlApplicationContext("C:/Users/Администратор/IdeaProjects/raylways/src/main/webapp/WEB-INF/spring-servlet.xml");
        return "home";
    }

    @RequestMapping(value = "/login_1", method = RequestMethod.GET)
    public String login(Model model, SecurityContextHolderAwareRequestWrapper request) {

        if (request.isUserInRole("ROLE_ADMIN")) {
            return "admin/adminhome";
        }
        if (request.isUserInRole("ROLE_USER")) {
            return "user/userhome";
        }
        return "login_1";
    }

    @RequestMapping(value = "user/buyTicket")
    public String buyTicket() {


        return "user/buyTicket";
    }


    @RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
    public String saveNewUser(@ModelAttribute("user") User user, Model model){
      //  stationService.addStation(station);
  //  public String hello(@RequestParam(value = "date") Date date){
    //    User user = new User();
      //  user.setBirth_date((java.util.Date) date);
        authorizationService.addUser(user);
        model.addAttribute("station", new Station());
        model.addAttribute("train", new Train());
        return "admin/addStation";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String saveUser(Model model){
        model.addAttribute("user", new User());
        return "user";
    }

    @RequestMapping(value = "/logout")
    public String logout (Model model){
        model.addAttribute("user", new User());
        return "logout";
    }


    @RequestMapping(value = "/error403.jsp", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {

        ModelAndView model = new ModelAndView();

        //check if user is login
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            User user = (User) auth.getPrincipal();
            model.addObject("username", user.getUsername());
        }

        model.setViewName("error403");
        return model;

    }

    @RequestMapping(value = "/admin/error403.jsp", method = RequestMethod.GET)
    public ModelAndView accesssDenied1() {

        ModelAndView model = new ModelAndView();

        //check if user is login
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            User user = (User) auth.getPrincipal();
            model.addObject("username", user.getUsername());
        }

        model.setViewName("error403");
        return model;

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
                              @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }
        model.setViewName("login");

        return model;

    }


}




/*

<form:form method="post" action="/addNewUser" commandName="user">
  <!--form:input path="username" /-->
  <form:input path="birth_date" type="date" placeholder="dd-mm-yyy" />
  <input type="submit" value="Registration" />
</form:form>*/