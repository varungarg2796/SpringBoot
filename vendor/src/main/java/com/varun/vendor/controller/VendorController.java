package com.varun.vendor.controller;

import com.varun.vendor.entity.Vendor;
import com.varun.vendor.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VendorController {

    @Autowired
    VendorService service;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createVendor";
    }

    @RequestMapping("/saveVendor")
    public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
        Vendor vendorSaved = service.saveVendor(vendor);
        String msg = "Vendor saved with id: " + vendorSaved.getId();
        modelMap.addAttribute("message", msg);
        return "createVendor";
    }

    // /displayVendor
    @RequestMapping("/displayVendor")
    public String displayVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendor";
    }

    // /deleteVendor
    @RequestMapping("/deleteVendor")
    public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
        Vendor vendor = new Vendor();
        vendor.setId(id);
        service.deleteVendor(vendor);
        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendor";
    }

    // /showUpdate
    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
        Vendor vendor = service.getVendorById(id);
        modelMap.addAttribute("vendor",vendor);
        return "updateVendor";
    }


    // /updateVendor
    @RequestMapping("/updateVendor")
    public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
        service.updateVendor(vendor);
        List<Vendor> vendors = service.getAllVendors();
        modelMap.addAttribute("vendors", vendors);
        return "displayVendor";
    }
}
