package com.i012114.tallercuatroalejandrasalas.Parser;

import com.i012114.tallercuatroalejandrasalas.Models.Posts;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class JsonPosts {
    public static List<Posts> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Posts> postsList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            Posts posts = new Posts();

            posts.setUserid(item.getInt("userId"));
            posts.setId(item.getInt("id"));
            posts.setTitle(item.getString("title"));
            posts.setBody(item.getString("body"));
            postsList.add(posts);
        }
        return postsList;
    }
}
