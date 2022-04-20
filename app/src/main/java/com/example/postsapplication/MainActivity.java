package com.example.postsapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_post ;
    Button addPost ;

    PostAdapter adapter ;

    final  int req_code = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_post = findViewById(R.id.lv_posts) ;
        addPost = findViewById(R.id.btn_addPost);

        ArrayList<Post> list_posts = new ArrayList<>();

        adapter = new PostAdapter(this,R.layout.custom_post_layout,list_posts);

        lv_post.setAdapter(adapter);


        addPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddPostActivity.class);

                startActivityForResult(intent,req_code);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==req_code && resultCode==RESULT_OK){
            Post p = (Post)data.getSerializableExtra(AddPostActivity.post_const_value) ;
            adapter.addItem(p);
            adapter.notifyDataSetChanged();
        }
    }
}