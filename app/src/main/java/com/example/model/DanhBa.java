package com.example.model;

import java.io.Serializable;

public class DanhBa implements Serializable {
    private String id;
    private String namecty;
    private String name;
    private String numberPhone;

    public DanhBa(){

    }

    public DanhBa(String id, String namecty, String name, String numberPhone) {
        this.id = id;
        this.namecty = namecty;
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamecty() {
        return namecty;
    }

    public void setNamecty(String namecty) {
        this.namecty = namecty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

}
