package com.varun.vendor.service;


import com.varun.vendor.entity.Vendor;

import java.util.List;

public interface VendorService {
    Vendor saveVendor(Vendor vendor);
    Vendor updateVendor(Vendor vendor);
    void deleteVendor(Vendor vendor);
    Vendor getVendorById(int id);
    List<Vendor> getAllVendors();

}
