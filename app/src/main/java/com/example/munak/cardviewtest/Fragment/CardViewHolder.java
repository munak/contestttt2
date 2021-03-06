package com.example.munak.cardviewtest.Fragment;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.munak.cardviewtest.R;

/**
 * Created by Munak on 2017. 10. 4..
 */

public class CardViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView title;
    CardView cardview;

    public CardViewHolder(View itemView) {
        super(itemView);

        image = (ImageView)itemView.findViewById(R.id.image);
        title = (TextView)itemView.findViewById(R.id.title);
        cardview = (CardView)itemView.findViewById(R.id.cardview);
    }

}
