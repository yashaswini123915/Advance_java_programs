package com.nipuna;

import java.util.List;

public class Student {

    private String firstName;

    private String lastName;

    private List<String> course;

    private String fees;

    private String place;

    private List<String> qualification;

    private String address;

    // Getters & Setters

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public List<String> getCourse() { return course; }

    public void setCourse(List<String> course) { this.course = course; }

    public String getFees() { return fees; }

    public void setFees(String fees) { this.fees = fees; }

    public String getPlace() { return place; }

    public void setPlace(String place) { this.place = place; }

    public List<String> getQualification() { return qualification; }

    public void setQualification(List<String> qualification) { this.qualification = qualification; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

}