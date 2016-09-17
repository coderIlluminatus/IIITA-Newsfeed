package com.geekhaven.iiitanewsfeed.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.geekhaven.iiitanewsfeed.R;

/**
 * Created by better_clever on 17/9/16.
 */
public class NewsfeedViewHolder extends RecyclerView.ViewHolder {

    public TextView newsTitle;
    public TextView description;
    public TextView society;
    public TextView dateTextView;
    public TextView timeTextView;
    public ImageView imageView;

    public NewsfeedViewHolder(View itemView) {
        super(itemView);
        newsTitle = (TextView) itemView.findViewById(R.id.news_title);
        description = (TextView) itemView.findViewById(R.id.news_description);
        dateTextView = (TextView) itemView.findViewById(R.id.news_date);
        timeTextView = (TextView) itemView.findViewById(R.id.news_time);
        imageView = (ImageView) itemView.findViewById(R.id.news_image);
        society = (TextView) itemView.findViewById(R.id.news_society);

    }
}
