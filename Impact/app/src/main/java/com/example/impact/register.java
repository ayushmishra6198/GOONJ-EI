package com.example.impact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void reg(View v)
    {
        EditText t1=(EditText)findViewById(R.id.editText7);
        EditText t2=(EditText)findViewById(R.id.editText8);
        EditText t3=(EditText)findViewById(R.id.editText9);
        EditText t4=(EditText)findViewById(R.id.editText10);
    String a=(t1.getText()).toString();
        String b=(t2.getText()).toString();
        String c=(t3.getText()).toString();String d=(t4.getText()).toString();
        if(a.isEmpty()||b.isEmpty()||c.isEmpty()||d.isEmpty())
        {
            Toast.makeText(this,"Value Cannot be Empty",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent x=new Intent(register.this,adminlogin.class);
            startActivity(x);
        }
    }
}
