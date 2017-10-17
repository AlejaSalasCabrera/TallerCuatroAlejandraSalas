package com.i012114.tallercuatroalejandrasalas.Models;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class Users {

    private int id;
    private String name, username, address, company;

    private String[] arreglo;

    public String userarreglo(){
        arreglo = new String[6];
        arreglo[0]="https://cdn4.iconfinder.com/data/icons/avatars-21/512/avatar-circle-human-male-5-512.png";
        arreglo[1]="https://cdn4.iconfinder.com/data/icons/avatars-21/512/avatar-circle-human-male-4-512.png";
        arreglo[2]="https://cdn4.iconfinder.com/data/icons/people-of-service/512/People_Services_photographer_man-512.png";
        arreglo[3]="https://cdn3.iconfinder.com/data/icons/avatar-set/512/Avatar10-512.png";
        arreglo[4]="https://cdn0.iconfinder.com/data/icons/avatars-8/128/avatar-22-2-512.png";
        arreglo[5]="https://cdn2.iconfinder.com/data/icons/female-users/512/female_avatar15-512.png";

        int aleatorio = (int) (Math.random()*6);
        return arreglo[aleatorio];
    }


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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
