package com.example.ghome.projectdz.Classwork.classwork6;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ghome.projectdz.R;

import java.util.ArrayList;

/**
 * Created by GHome on 04.08.2017.
 */
 public  class ClassWork6Adapter extends RecyclerView.Adapter<ClassWork6Adapter.Holder> {
    private ArrayList<String> items;

    public ClassWork6Adapter(ArrayList<String> items)
    {
        this.items=items;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view_class_work6,parent,false);
        Log.e("ClassWork6Adapter","onCreateViewHolder");
        return new Holder(root);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Log.e("ClassWork6Adapter","onBindViewHolder");

        String item = items.get(position);
        holder.textView.setText(item);
    }

    @Override
    public int getItemCount() {
        return items ==null ? 0 :items.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {
        ImageView  imageView;
        TextView textView;


        public Holder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.imageViewCL6);
            textView=(TextView)itemView.findViewById(R.id.textViewCL6);


        }
    }


}