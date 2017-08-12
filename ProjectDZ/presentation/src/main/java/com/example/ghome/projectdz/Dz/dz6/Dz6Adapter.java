package com.example.ghome.projectdz.Dz.dz6;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ghome.projectdz.Classwork.classwork6.ClassWork6Adapter;
import com.example.ghome.projectdz.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


/**
 * Created by GHome on 06.08.2017.
 */

public  class Dz6Adapter extends RecyclerView.Adapter<Dz6Adapter.Holder> {
    private ArrayList<MyImage> myImageUrl;
    Context context;
//    private  OnItemClickListener listener;

//    public void setListener(OnItemClickListener listener) {
//        this.listener = listener;
//    }

    public Dz6Adapter(Context context, ArrayList<MyImage> myImageUrl)
    {
        this.context=context;
        this.myImageUrl=myImageUrl;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler_view_dz6,parent,false);
        Log.e("Dz6Adapter","onCreateViewHolder");
        return new Holder(root);
    }

    @Override
    public void onBindViewHolder(Holder holder, int i) {
//                Log.e("onBind",String.valueOf(myImageUrl.get(i).getImage_url()));
//        final String item = String.valueOf(myImageUrl.get(i));
             Glide
                     .with(context)
                     .load(Uri.parse(myImageUrl.get(i).getImage_url()))
                     .into(holder.imageView);
//        holder.imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (listener !=null)
//                {
//                    listener.onItemClick(item);
//
//                }
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return myImageUrl ==null ? 0 :myImageUrl.size();
    }


    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public static class Holder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public Holder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageViewDZ6_1);

    }
    }
//interface OnItemClickListener{
//    public void onItemClick (String item);
//
//}

}