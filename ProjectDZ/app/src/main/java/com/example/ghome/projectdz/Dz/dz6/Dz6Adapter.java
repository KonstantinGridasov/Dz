package com.example.ghome.projectdz.Dz.dz6;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ghome.projectdz.R;

import java.util.ArrayList;

/**
 * Created by GHome on 06.08.2017.
 */

public  class Dz6Adapter extends RecyclerView.Adapter<Dz6Adapter.Holder> {
    private ArrayList<String> items;

    public Dz6Adapter(ArrayList<String> items)
    {
        this.items=items;
    }

    @Override
    public Dz6Adapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rececler_view_dz6,parent,false);
        Log.e("ClassWork6Adapter","onCreateViewHolder");
        return new Dz6Adapter.Holder(root);
    }

    @Override
    public void onBindViewHolder(Dz6Adapter.Holder holder, int position) {
        Log.e("ClassWork6Adapter","onBindViewHolder");
        String item = items.get(position);
    }

    @Override
    public int getItemCount() {
        return items ==null ? 0 :items.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public Holder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.imageViewDZ6_1);




        }
    }


}