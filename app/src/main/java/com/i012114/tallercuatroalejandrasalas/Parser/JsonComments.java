package com.i012114.tallercuatroalejandrasalas.Parser;

import com.i012114.tallercuatroalejandrasalas.Models.Comments;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class JsonComments {

    public static List<Comments> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Comments> commentsList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            Comments comments = new Comments();

            comments.setPostid(item.getInt("postId"));
            comments.setId(item.getInt("id"));
            comments.setEmail(item.getString("email"));
            comments.setBody(item.getString("body"));
            commentsList.add(comments);
        }
        return commentsList;
    }


}
