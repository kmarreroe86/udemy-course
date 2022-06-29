package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {

    private String name;

    private String lastname;

    public PersonV1() {
    }

    public PersonV1(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
