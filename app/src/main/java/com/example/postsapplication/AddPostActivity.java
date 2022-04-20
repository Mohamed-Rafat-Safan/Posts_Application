package com.example.postsapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddPostActivity extends AppCompatActivity {

    EditText name, date, body, following, followers, posts ;
    Button send_data  ;

    static final String post_const_value = "post" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        name = findViewById(R.id.et_name) ;
        date = findViewById(R.id.et_date) ;
        body = findViewById(R.id.et_body) ;
        following = findViewById(R.id.et_following) ;
        followers = findViewById(R.id.et_followers) ;
        posts = findViewById(R.id.et_posts) ;
        send_data = findViewById(R.id.btn_send_data) ;



        send_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String v_name = name.getText().toString() ;
                String v_date = date.getText().toString() ;
                String v_body = body.getText().toString() ;

                int v_following = Integer.parseInt(following.getText().toString());
                int v_followers = Integer.parseInt(followers.getText().toString());
                int v_posts = Integer.parseInt(posts.getText().toString());

                Post p = new Post(v_date,v_name,v_body,v_following,v_posts,v_followers);

                Intent intent = new Intent();
                intent.putExtra(post_const_value,p) ;

                setResult(RESULT_OK, intent);
                finish();

            }
        });
    }

}