package com.example.studentdal.entities;

import javax.persistence.*;

@Entity
@Table(name="studenttab")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // it will take care of generating the value
    private long id;

    @Column(name="sname") // since the name in table is different
    private String name;

    @Column(name="scourse") // since the name in table is different
    private String course;

    @Column(name="sfees") // since the name in table is different
    private double fees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fees=" + fees +
                '}';
    }



}
