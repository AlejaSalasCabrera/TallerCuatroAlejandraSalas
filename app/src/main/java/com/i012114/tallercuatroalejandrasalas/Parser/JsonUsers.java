package com.i012114.tallercuatroalejandrasalas.Parser;

import com.i012114.tallercuatroalejandrasalas.Models.Users;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class JsonUsers {

    public static List<Users> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Users> userslist = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            Users user = new Users  ();

            user.setId(item.getInt("id"));
            user.setName(item.getString("name"));
            user.setUsername(item.getString("username"));

            JSONObject address = item.getJSONObject("address");
            user.setAddress(address.getString("city"));

            JSONObject company = item.getJSONObject("company");
            user.setCompany(company.getString("name"));

            userslist.add(user);
        }
        return userslist;
    }

}


