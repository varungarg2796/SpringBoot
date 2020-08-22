package com.varun.location.controller;

import com.varun.location.entities.Location;
import com.varun.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations") //comment this and uncomment others for alt way
public class LocationRESTController {

    @Autowired
    LocationRepository locationRepository;

    // @RequestMapping(value = "/locations", method = RequestMethod.GET)
    @GetMapping("")
    public List<Location> getLocation() {
        return locationRepository.findAll();
    }

    //@RequestMapping(value = "/locations", method = RequestMethod.POST)
    @PostMapping("")
    public Location createLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    @PutMapping("")
    //@RequestMapping(value = "/locations", method = RequestMethod.PUT)
    public Location updateLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    @DeleteMapping("/{id}")
    //@RequestMapping(value = "/locations/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable("id") int id) {
        locationRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    //@RequestMapping(value = "/locations/{id}", method = RequestMethod.GET)
    public Optional<Location> getLocation(@PathVariable("id") int id) {
        return locationRepository.findById(id);
    }
}
