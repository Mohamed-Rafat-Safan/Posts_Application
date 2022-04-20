package com.example.postsapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PostAdapter extends BaseAdapter {

    Context context ;
    int resource ;
    ArrayList<Post> data_posts ;

    public PostAdapter(Context context, int resource, ArrayList<Post> data_posts) {
        this.context = context;
        this.resource = resource;
        this.data_posts = data_posts;
    }

    public void addItem(Post p){
        data_posts.add(p);
    }

    @Override
    public int getCount() {
        return data_posts.size() ;
    }

    @Override
    public Post getItem(int i) {
        return data_posts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view ;
        if(v == null){
            v = LayoutInflater.from(context).inflate(resource, null,false);
        }

        TextView date = v.findViewById(R.id.tv_date);
        TextView posts = v.findViewById(R.id.tv_value_posts);
        TextView following = v.findViewById(R.id.tv_value_following);
        TextView follower = v.findViewById(R.id.tv_value_followers);
        TextView body = v.findViewById(R.id.tv_body);
        TextView name = v.findViewById(R.id.tv_userName);

        Post p = getItem(i) ;

        date.setText(p.getDate());
        posts.setText(p.getPosts()+"");
        following.setText(p.getFollowing()+"");
        follower.setText(p.getFollowers()+"");
        body.setText(p.getMessage_user());
        name.setText(p.getName());


        return v;
    }
}
