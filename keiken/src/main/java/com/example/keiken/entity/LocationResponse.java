package com.example.keiken.entity;

public class LocationResponse {

    private String address;

    // Constructeurs, getters et setters

    public LocationResponse() {
    }

    public LocationResponse(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
