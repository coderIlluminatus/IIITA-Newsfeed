package com.geekhaven.iiitanewsfeed;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.geekhaven.iiitanewsfeed.Models.NewsItem;
import com.geekhaven.iiitanewsfeed.ViewHolders.NewsfeedViewHolder;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsfeedFragment extends Fragment {

    private int mPage;
    DatabaseReference ref;

    public static NewsfeedFragment newInstance(int page){
        Bundle args = new Bundle();
        args.putInt("ARG_PAGE", page);
        NewsfeedFragment fragment = new NewsfeedFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt("ARG_PAGE");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_newsfeed, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.newsfeed_recyclerview);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ref = FirebaseDatabase.getInstance().getReference();
        ref = ref.child("newslist");

        FirebaseRecyclerAdapter<NewsItem,NewsfeedViewHolder> adapter =
                new FirebaseRecyclerAdapter<NewsItem, NewsfeedViewHolder>(
                        NewsItem.class,
                        R.layout.news_item_card,
                        NewsfeedViewHolder.class,
                        ref
                ) {
                    @Override
                    protected void populateViewHolder(NewsfeedViewHolder viewHolder, NewsItem model, int position) {
                        viewHolder.newsTitle.setText(model.getTitle());
                        viewHolder.description.setText(model.getDescription());
                        viewHolder.timeTextView.setText(model.getTime());
                        viewHolder.dateTextView.setText(model.getDate());
                        viewHolder.society.setText(model.getSociety());
                    }
                };

        recyclerView.setAdapter(adapter);
        return view;
    }
}
