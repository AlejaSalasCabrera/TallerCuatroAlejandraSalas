package com.i012114.tallercuatroalejandrasalas.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.i012114.tallercuatroalejandrasalas.Models.Users;
import com.i012114.tallercuatroalejandrasalas.PostsActivity;
import com.i012114.tallercuatroalejandrasalas.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandra Salas on 16/10/2017.
 */

public class AdapterUsers extends RecyclerView.Adapter<AdapterUsers.ViewHolder> {

    List<Users> usersList = new ArrayList<>();
    Context context;
    // Constructor de la clase
    public AdapterUsers(List<Users> usersList, Context context) {
        this.usersList = usersList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemusers, parent, false);
// Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes

        holder.textViewid.setText(Integer.toString(usersList.get(position).getId()));
        holder.textViewName.setText(usersList.get(position).getName());
        holder.textViewusername.setText(usersList.get(position).getUsername());
        holder.textViewaddress.setText(usersList.get(position).getAddress());
        holder.textViewcompany.setText(usersList.get(position).getCompany());
        Picasso.with(context).load(usersList.get(position).userarreglo()).into(holder.imageView);

    }
    @Override
    public int getItemCount() {

        return usersList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textViewid;
        TextView textViewName;
        TextView textViewusername;
        TextView textViewaddress;
        TextView textViewcompany;
        ImageView imageView;

        public ViewHolder(View item) {
            super(item);

            item.setOnClickListener(this);

            imageView = (ImageView) item.findViewById(R.id.img1);
            textViewid = (TextView) item.findViewById(R.id.id_tv_id);
            textViewName = (TextView) item.findViewById(R.id.id_tv_item_nameuser);
            textViewusername = (TextView) item.findViewById(R.id.id_tv_item_username);
            textViewaddress = (TextView) item.findViewById(R.id.id_tv_item_ubicacion);
            textViewcompany = (TextView) item.findViewById(R.id.id_tv_item_company);

        }

        @Override
        public void onClick(View view) {
            Context context = view.getContext();
            Intent intent = new Intent(context, PostsActivity.class);
            intent.putExtra("idUser", usersList.get(getLayoutPosition()).getId());
            context.startActivity(intent);

        }
    }
}
