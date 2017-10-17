package com.i012114.tallercuatroalejandrasalas.Models;

import android.graphics.Color;
import android.support.annotation.ColorRes;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class Posts {

    private int userid, id;
    private String title, body;

    private String[] arreglo;

    public String postarreglo(){
        arreglo = new String[6];
        arreglo[0]="http://www.manukleart.com/wp-content/uploads/2013/08/manukleart-disen%CC%83o-colores.jpg";
        arreglo[1]="https://d3mrnpbbo94dn5.cloudfront.net/uploads/article_gallery_item/image/436/gallery_detail_Fimo-colores.png";
        arreglo[2]="http://www.anoesisdesign.com/Container/wp-content/uploads/2016/10/kupka-colores-1200x700.jpg";
        arreglo[3]="http://cdn5.upsocl.com/wp-content/uploads/2013/06/zok-11.jpg";
        arreglo[4]="http://cdn2.upsocl.com/wp-content/uploads/2016/06/glaseadoportada.jpg";
        arreglo[5]="http://www.lyra-arte.mx/images/Home_2a.png";

        int aleatorio = (int) (Math.random()*6);
        return arreglo[aleatorio];
    }


    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
