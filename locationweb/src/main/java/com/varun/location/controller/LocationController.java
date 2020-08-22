package com.varun.location.controller;

import com.varun.location.entities.Location;
import com.varun.location.service.LocationService;
import com.varun.location.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @Autowired
    EmailUtil emailUtil;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc") //Map this to the form action of jsp
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) { // will map and expose 'location' as a bean

        Location locationSaved = service.saveLocation(location);
        String message = "Location saved with id" + locationSaved.getId();
        modelMap.addAttribute("message", message);
        // emailUtil.sendEmail("springxyz@gmail.com", "Hey There","Returning a response"); need to configure password and email for this. also enable lesssecureapps
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap) {
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";
    }

    @RequestMapping("deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
        // Location location = service.getLocationById(id); reduce this database call by below
        Location location = new Location();
        location.setId(id);
        service.deleteLocation(location);

        // send the updated list back
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = service.getLocationById(id);
        modelMap.addAttribute("location", location);
        return "updateLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        service.updateLocation(location);

        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

}
