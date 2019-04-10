package com.example.impact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import android.view.View;

public class aboutus extends AppCompatActivity {
    ViewFlipper v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Button b=(Button)findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(aboutus.this,MainPage.class);
                startActivity(i);
            }
        });
        TextView textView = (TextView) findViewById(R.id.textView44);
        textView.setMovementMethod(new ScrollingMovementMethod());
        int images[]={R.drawable.bb,R.drawable.gg,R.drawable.cc};
        v=findViewById(R.id.flipper);
        for(int image:images)
        {
            flipperImages(image);
        }


    }
    public void flipperImages(int image)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        v.addView(imageView);
        v.setFlipInterval(4000);
        v.setAutoStart(true);
        v.setInAnimation(this,android.R.anim.slide_in_left);
        v.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
