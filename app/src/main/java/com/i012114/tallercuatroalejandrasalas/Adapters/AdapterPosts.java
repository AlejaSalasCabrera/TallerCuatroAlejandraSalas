package com.i012114.tallercuatroalejandrasalas.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.i012114.tallercuatroalejandrasalas.CommentsActivity;
import com.i012114.tallercuatroalejandrasalas.Models.Posts;
import com.i012114.tallercuatroalejandrasalas.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class AdapterPosts extends RecyclerView.Adapter<AdapterPosts.ViewHolder> {

    List<Posts> postsList = new ArrayList<>();
    Context context;
    // Constructor de la clase
    public AdapterPosts(List<Posts> postsList, Context context) {
        this.postsList = postsList;
        this.context = context;
    }
    @Override
    public AdapterPosts.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemposts, parent, false);
// Pasar la vista (item.xml) al ViewHolder
        AdapterPosts.ViewHolder viewHolder = new AdapterPosts.ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterPosts.ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes


        holder.textViewuserid.setText(Integer.toString(postsList.get(position).getUserid()));
        holder.textViewid.setText(Integer.toString(postsList.get(position).getId()));
        holder.textViewtitle.setText(postsList.get(position).getTitle());
        holder.textViewbody.setText(postsList.get(position).getBody());
        Picasso.with(context).load(postsList.get(position).postarreglo()).into(holder.imageView);
    }
    @Override
    public int getItemCount() {
        return postsList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewuserid;
        TextView textViewid;
        TextView textViewtitle;
        TextView textViewbody;
        ImageView imageView;


        public ViewHolder(View item) {
            super(item);
            item.setOnClickListener(this);
            textViewuserid = (TextView) item.findViewById(R.id.id_tv_userid);
            textViewid = (TextView) item.findViewById(R.id.id_tv_item_id2);
            textViewtitle = (TextView) item.findViewById(R.id.id_tv_item_title1);
            textViewbody = (TextView) item.findViewById(R.id.id_tv_item_body1);
            imageView = (ImageView) item.findViewById(R.id.id_img_item_cardview);

        }

        @Override
        public void onClick(View view) {
            Context context = view.getContext();
            Intent intent = new Intent(context, CommentsActivity.class);
            intent.putExtra("principalid2", postsList.get(getLayoutPosition()).getId());
            context.startActivity(intent);

        }
    }

}
