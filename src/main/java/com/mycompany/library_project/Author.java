
package com.mycompany.library_project;


public class Author {
    private int id;
    private String name;
    private String address;
    private String birthDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Author(int id, String name, String address, String birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name;
    }
    public String getInfo() {
        return String.format("Author Information:%nName: %s", name);
    }

    
}
