package com.example.datarestdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // to generate the table automatically
public class Customers {
    @Id
    @GeneratedValue // identifying cid is primary key
    private int cid;
    private String cname;
    private String coursename;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", coursename='" + coursename + '\'' +
                '}';
    }



}

//To get - http://localhost:8085/customers
//To delete - http://localhost:8085/customers/{cid}
//To update - http://localhost:8085/customers/{cid} and data in json
//To post/insert- http://localhost:8085/customers and data in json