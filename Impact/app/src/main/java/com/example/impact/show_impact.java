package com.example.impact;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class show_impact extends AppCompatActivity {
    ConstraintLayout r1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_impact);
        Intent intent = getIntent();
        String user_name = intent.getStringExtra("USER_NAME");
        //TextView tv=(TextView)findViewById(R.id.textView10);
        r1=(ConstraintLayout)findViewById(R.id.cl2);
        GridView gv=(GridView) findViewById(R.id.gv1);
        if(user_name.equals("0")==true)
        {
            try{
                String sql="select material from t_impacts where id=1";
                ConnectionClass c=new ConnectionClass();
                Connection conn=c.CONN();
                Statement stat=conn.createStatement();
                ResultSet rs=stat.executeQuery(sql);
                ArrayList data=new ArrayList();
                data.add("Impacts");
                while(rs.next())
                {
                    data.add(rs.getString(1));

                }
                r1.setBackgroundResource(R.drawable.books);
                gv.setNumColumns(1);
                ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
                gv.setAdapter(adapter);
                Toast.makeText(this,"Table Created",Toast.LENGTH_SHORT).show();

            }
            catch(Exception e)
            {
                Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
            }
        }
        if(user_name.equals("1")==true)
        {
            try{
                String sql="select material from t_impacts where id=2";
                ConnectionClass c=new ConnectionClass();
                Connection conn=c.CONN();
                Statement stat=conn.createStatement();
                ResultSet rs=stat.executeQuery(sql);
                ArrayList data=new ArrayList();
                data.add("Impacts");
                while(rs.next())
                {
                    data.add(rs.getString(1));

                }
                gv.setNumColumns(1);
                r1.setBackgroundResource(R.drawable.elec);

                ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
                gv.setAdapter(adapter);
                Toast.makeText(this,"Table Created",Toast.LENGTH_SHORT).show();

            }
            catch(Exception e)
            {
                Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
            }

        }
        if(user_name.equals("2")==true) {
            try {
                String sql = "select material from t_impacts where id=3";
                ConnectionClass c = new ConnectionClass();
                Connection conn = c.CONN();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                ArrayList data = new ArrayList();
                data.add("Impacts");
                while (rs.next()) {
                    data.add(rs.getString(1));

                }
                gv.setNumColumns(1);
                r1.setBackgroundResource(R.drawable.rubber);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
                gv.setAdapter(adapter);
                 

            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        if(user_name.equals("3")==true) {
            try {
                String sql = "select material from t_impacts where id=4";
                ConnectionClass c = new ConnectionClass();
                Connection conn = c.CONN();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                ArrayList data = new ArrayList();
                data.add("Impacts");
                while (rs.next()) {
                    data.add(rs.getString(1));

                }
                r1.setBackgroundResource(R.drawable.kitchen);
                gv.setNumColumns(1);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
                gv.setAdapter(adapter);
                 

            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        if(user_name.equals("4")==true) {
            try {
                String sql = "select material from t_impacts where id=5";
                ConnectionClass c = new ConnectionClass();
                Connection conn = c.CONN();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                ArrayList data = new ArrayList();
                data.add("Impacts");
                while (rs.next()) {
                    data.add(rs.getString(1));

                }
                r1.setBackgroundResource(R.drawable.footwear);
                gv.setNumColumns(1);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
                gv.setAdapter(adapter);
                 

            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        if(user_name.equals("5")==true) {
            try {
                String sql = "select material from t_impacts where id=6";
                ConnectionClass c = new ConnectionClass();
                Connection conn = c.CONN();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                ArrayList data = new ArrayList();
                data.add("Impacts");
                while (rs.next()) {
                    data.add(rs.getString(1));

                }
                r1.setBackgroundResource(R.drawable.clothes);
                gv.setNumColumns(1);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
                gv.setAdapter(adapter);
                 

            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        if(user_name.equals("6")==true) {
            try {
                String sql = "select material from t_impacts where id=7";
                ConnectionClass c = new ConnectionClass();
                Connection conn = c.CONN();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                ArrayList data = new ArrayList();
                data.add("Impacts");
                while (rs.next()) {
                    data.add(rs.getString(1));

                }
                r1.setBackgroundResource(R.drawable.furniture);
                gv.setNumColumns(1);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
                gv.setAdapter(adapter);
                 

            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        if(user_name.equals("7")==true) {
            try {
                String sql = "select material from t_impacts where id=8";
                ConnectionClass c = new ConnectionClass();
                Connection conn = c.CONN();
                Statement stat = conn.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                ArrayList data = new ArrayList();
                data.add("Impacts");
                while (rs.next()) {
                    data.add(rs.getString(1));

                }
                r1.setBackgroundResource(R.drawable.toys);
                gv.setNumColumns(1);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
                gv.setAdapter(adapter);
                 

            } catch (Exception e) {
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        }
}
