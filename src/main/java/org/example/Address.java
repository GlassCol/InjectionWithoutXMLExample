package org.example;

import org.springframework.stereotype.Component;

public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address() {
    }
    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
