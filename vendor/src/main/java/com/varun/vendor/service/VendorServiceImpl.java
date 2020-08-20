package com.varun.vendor.service;

import com.varun.vendor.entity.Vendor;
import com.varun.vendor.repos.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository repository;

    @Override
    public Vendor saveVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public void deleteVendor(Vendor vendor) {
         repository.delete(vendor);
    }

    @Override
    public Vendor getVendorById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Vendor> getAllVendors() {
        return repository.findAll();
    }

    public VendorRepository getRepository() {
        return repository;
    }

    public void setRepository(VendorRepository repository) {
        this.repository = repository;
    }
}
