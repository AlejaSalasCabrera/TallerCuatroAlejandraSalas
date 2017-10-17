package com.i012114.tallercuatroalejandrasalas.Models;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class Comments {

    private int postid, id;
    private String email, body;


    private String[] arreglo;

    public String commentarreglo(){
        arreglo = new String[3];
        arreglo[0]="https://i.pinimg.com/originals/d6/46/b3/d646b370bf18b091281b1eb27743e161.jpg";
        arreglo[1]="http://bea.eduangi.com/LazaroTotem/Delirium/totem14.jpg";
        arreglo[2]="https://i.pinimg.com/originals/07/0e/14/070e14dc0b6684cbdc2e3692973df141.jpg";

        int aleatorio = (int) (Math.random()*3);
        return arreglo[aleatorio];
    }




    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
