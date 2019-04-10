package com.example.impact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class adminlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
    }
    public void login(View v)
    {
        EditText t1=(EditText)findViewById(R.id.editText5);
        EditText t2=(EditText)findViewById(R.id.editText6);
        String a=(t1.getText()).toString();
        String b=(t2.getText()).toString();
        if(a.equals("admin")&&b.equals("admin"))
        {
            Intent x=new Intent(adminlogin.this,insert_data.class);
            startActivity(x);
        }
        else
        {
            Toast.makeText(this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
        }
    }
    public void register(View v)
    {
        Intent x=new Intent(adminlogin.this,register.class);
        startActivity(x);
    }
}
