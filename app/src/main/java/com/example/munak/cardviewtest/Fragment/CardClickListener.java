package com.example.munak.cardviewtest.Fragment;

/**
 * Created by Munak on 2017. 10. 4..
 */

public interface CardClickListener {
    /**
     * Called when a kitten is clicked
     * @param holder The ViewHolder for the clicked Card
     * @param position The position in the grid of the Card that was clicked
     */
    void onCardClicked(CardViewHolder holder, int position);
}
