package com.varun.location.service;

import com.varun.location.entities.Location;
import com.varun.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository repository; // as it depends on that

    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) { // Different than save as the location object here will have updated info
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocations() {
        return repository.findAll(); // importing JpaRepository returns a list instead of iterables
    }

    public LocationRepository getRepository() {
        return repository;
    }

    public void setRepository(LocationRepository repository) {
        this.repository = repository;
    }
}
