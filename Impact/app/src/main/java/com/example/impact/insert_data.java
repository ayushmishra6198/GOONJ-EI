package com.example.impact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.Statement;

public class insert_data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);
    }
    public void regclick(View v)
    {
        EditText t1=(EditText)findViewById(R.id.editText2);
        EditText t2=(EditText)findViewById(R.id.editText3);
        EditText t3=(EditText)findViewById(R.id.editText4);
        EditText t=(EditText)findViewById(R.id.editText);
        Spinner s1=(Spinner)findViewById(R.id.spinner);


        String qty=t1.getText().toString();
        String loc=t2.getText().toString();
        String pin=t3.getText().toString();
        String name=t.getText().toString();
        String material=s1.getSelectedItem().toString();

        if(qty.length()==0 || loc.length()==0||pin.length()==0||name.length()==0)
        {
            Toast.makeText(this,"Value Cannot Be Empty",Toast.LENGTH_SHORT).show();
        }
        try{
            String sql="insert into t_input1 values('"+material+"','"+qty+"','"+loc+"','"+pin+"','"+name+"','getdate()')";
            ConnectionClass c=new ConnectionClass();
            Connection conn=c.CONN();
            Statement stat=conn.createStatement();
            stat.execute(sql);
            conn.close();
            Toast.makeText(this,"Record Saved",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {

            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
        String user_name = name;
        String location=loc;
        String quantity=qty;
        String pincode=pin;
        String m=material;

        Intent x=new Intent(insert_data.this,calc.class);
        x.putExtra("USER_NAME", user_name);
        x.putExtra("material",m);
        x.putExtra("pin",pincode);
        x.putExtra("loc",location);
        x.putExtra("qty",quantity);
        startActivity(x);
    }
}
