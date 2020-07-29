package com.example.submissionform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class FormController {
    @Autowired
    CustomerRepo repo;

    @RequestMapping("/")
    public String details() {
        return "app";
    }

    @RequestMapping("/details")
    public String details(Customers customers) {
        repo.save(customers);
        return "app";
    }

    @RequestMapping("/getdetails")
    public String getDetails() {
        return "ViewCustomers";
    }


    @PostMapping("/getdetails")
    public ModelAndView getdetails(@RequestParam int cid) {
        ModelAndView mv = new ModelAndView("retrieve");
        Customers customers = repo.findById(cid).orElse(null);
        mv.addObject(customers);
        return mv;
    }


    @RequestMapping("/customers")
    @ResponseBody
    public List<Customers> getCustomers() {
        return repo.findAll();
    }

    @PostMapping("/customers")
    public Customers insertCustomers(@RequestBody Customers customers) {
        repo.save(customers);
        return customers;
    }

    @DeleteMapping("/customers/{cid}")
    public Customers deleteCustomer(@PathVariable("cid") int cid) {
        Customers cust = repo.getOne(cid);
        repo.delete(cust);
        return cust;
    }

    @PutMapping(path = "/customers", consumes = {"application/json"})
    public Customers updateCustomer(@RequestBody Customers customers) {
        repo.save(customers);
        return customers;
    }

    @RequestMapping("/customers/{cid}")
    @ResponseBody
    public Optional<Customers> getCustomers(@PathVariable("cid") int cid) {
        return repo.findById(cid);
    }
}
