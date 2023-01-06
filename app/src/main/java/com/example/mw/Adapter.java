package com.example.mw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>{
Context context;
ArrayList<Items> itemsArrayList;

    public Adapter(Context context, ArrayList<Items> itemsArrayList) {
        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {

        Items items=itemsArrayList.get(position);
holder.cardView.startAnimation(AnimationUtils.loadAnimation(context,R.anim.recycler_animation));
        holder.textView1.setText(items.getName());
        holder.textView2.setText(items.getEmail());

    }

    @Override
    public int getItemCount() {
        return itemsArrayList.size();
    }

    class AdapterViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textView1,textView2;
        Button button;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardview);
            textView1=itemView.findViewById(R.id.textname);
            textView2=itemView.findViewById(R.id.textemail);
            button=itemView.findViewById(R.id.buttonMore);
        }
    }
}
