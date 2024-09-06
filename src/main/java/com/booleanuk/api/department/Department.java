package com.booleanuk.api.department;

public class Department {
    private long id;
    private String name;
    private String location;

    public Department(long id, String name, String location) {
       this.id = id;
       this.name = name;
       this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String result = "";
        result += this.id + " - ";
        result += this.name + " - ";
        result +=  this.location;
        return  result;
    }
}
