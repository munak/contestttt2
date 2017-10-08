package com.example.munak.cardviewtest.Fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.munak.cardviewtest.R;

import java.util.List;

/**
 * Created by Munak on 2017. 9. 24..
 */

public class RecyclerAdapter extends RecyclerView.Adapter<CardViewHolder> {

    Context context;
    List<RecyclerItem> items;
    int item_layout;
    CardClickListener mListener;

    public RecyclerAdapter(Context context, List<RecyclerItem> items, CardClickListener mListener) {
        this.context = context;
        this.items = items;
        this.mListener = mListener;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent,false);

        return new CardViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final CardViewHolder holder, final int position) {

        final RecyclerItem item = items.get(position);
        //Drawable drawable = context.getResources().getDrawable(item.getImage());
        //holder.image.setBackground(drawable);
        holder.title.setText(item.getTitle());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,item.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onCardClicked(holder, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }
}
