package com.android.recyclercustom;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kumar on 4/1/17.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.DataViewHolder> {

    ArrayList<Data> arrayList = new ArrayList<>();

    Context ctx;
    Adapter(ArrayList<Data> arrayList, Context ctx){
        this.arrayList=arrayList;
        this.ctx=ctx;
    }
    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        DataViewHolder dataViewHolder = new DataViewHolder(view,ctx,arrayList);
        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        Data data = arrayList.get(position);
        holder.image.setImageResource(data.getImage());
        holder.textView.setText(data.getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView image;
        TextView textView;
        ArrayList<Data> arrayList = new ArrayList<Data>();
        Context ctx;
        public DataViewHolder(View itemView,Context ctx,ArrayList<Data> arrayList   ) {
            super(itemView);
            this.arrayList= arrayList;
            this.ctx =ctx;
            itemView.setOnClickListener(this);
            image = (ImageView) itemView.findViewById(R.id.image_view);
            textView = (TextView )itemView.findViewById(R.id.text);
        }


        @Override
        public void onClick(View v) {
         int position = getAdapterPosition();
            Data data = this.arrayList.get(position);

            Intent intent = new Intent(this.ctx,ImageDetails.class);
            intent.putExtra("image",data.getImage());
            intent.putExtra("name",data.getName());
            this.ctx.startActivity(intent);
        }
    }
}
