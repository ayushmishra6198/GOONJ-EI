package com.example.impact;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.*;
import java.sql.*;
import java.util.ArrayList;
import android.view.*;
import com.example.impact.ConnectionClass;

public class view_data extends AppCompatActivity {
    ConstraintLayout rl;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

    }
    public void searchclick(View v)
    {
        rl=(ConstraintLayout)findViewById(R.id.relativeLayout2);
        Spinner s1=(Spinner)findViewById(R.id.spinner3);
        GridView gv=(GridView)findViewById(R.id.abc);
        String material =s1.getSelectedItem().toString();
        try
        {
            if(material.equals("Books")==true)
            {
                rl.setBackgroundResource(R.drawable.books);
            }
            else
            if(material.equals("Electronics Items")==true)
            {
                rl.setBackgroundResource(R.drawable.elec);
            }
            else
            if(material.equals("Plastics")==true)
            {
                rl.setBackgroundResource(R.drawable.rubber);
            }
            else
            if(material.equals("Kitchen Utensils")==true)
            {
                rl.setBackgroundResource(R.drawable.kitchen);
            }
            else
            if(material.equals("Footwear")==true)
            {
                rl.setBackgroundResource(R.drawable.footwear);
            }
            else
            if(material.equals("Clothes")==true)
            {
                rl.setBackgroundResource(R.drawable.clothes);
            }
            else
            if(material.equals("Furniture")==true)
            {
                rl.setBackgroundResource(R.drawable.furniture);
            }
            else
            if(material.equals("Toys")==true)
            {
                rl.setBackgroundResource(R.drawable.toys);
            }

            String sql="select * from t_input1 where material = '"+material+"'";
            ConnectionClass c=new ConnectionClass();
            Connection conn=c.CONN();
            Statement stat=conn.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            ArrayList data=new ArrayList();

            data.add("Material");
            data.add("Quantity");

            data.add("Location");
            data.add("Pincode");
            data.add("Name");
            while(rs.next())
            {
                data.add(rs.getString(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getString(4));
                data.add(rs.getString(5));
            }
            gv.setNumColumns(5);
            ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
            gv.setAdapter(adapter);
        }
        catch(Exception e)
        {
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }

    }

}