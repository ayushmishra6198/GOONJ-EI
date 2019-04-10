package com.example.impact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.Statement;

public class calc extends AppCompatActivity {
    double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        Intent intent = getIntent();
        String user_name = intent.getStringExtra("USER_NAME");
        String mat = intent.getStringExtra("material");
        String location = intent.getStringExtra("loc");
        String pincode = intent.getStringExtra("pin");
        int quantity = Integer.parseInt(intent.getStringExtra("qty"));
        TextView t=(TextView)findViewById(R.id.textView90);
        if(mat.equals("Plastics")==true)
        {
            d=(double)(quantity*(6.00/1000));
            t.setText("The Impact Of "+quantity+" Tons Plastic On Air is: "+d+" Tons \n \nFor AIR:\nDepending on the country, a little more than 22 to 43 percent of plastic waste ends up in landfills \"Compounds of concern\" (high risk to human health) that are allowed to come in contact with food mainly through plastic packaging include bisphenols, phthalates, nonpersistent pesticides, perfluoroalkyl chemicals (PFCs), and perchlorate. Chlorinated plastic can release harmful chemicals into the surrounding soil, which can then seep into groundwater or other surrounding water sources, and also the ecosystem. Additives such as phthalates and Bisphenol A (widely known as BPA) leach out of plastic particles. These additives are known for their hormonal effects and can disrupt the hormone system of vertebrates and invertebrates alike.");
        }
        else if(mat.equals("Furniture")==true) {
            d = (double) (quantity* (1.65 / 1000));
            t.setText("The Impact Of " + quantity + " Tons Furniture On Air is: " + d + " Tons.\n \nFor air:\nLandfills cause pollution to the local environment by contaminating the groundwater and aquifers, contaminating the soil, and producing methane. The Environmental Impact of Wood Smoke. Wood smoke is air pollution. It is as simple as that. Residential wood burning also produces a laundry list of other pollutants such as mercury, carbon monoxide, greenhouse gases, volatile organic compounds and nitrogen oxides.");
        }
        else if(mat.equals("Footwear")==true) {
            d = (double) (quantity*0.806);
            //t.setText("The Impact Of " + quantity + " Tons Furniture On Air is: " + d + " Tons.\n \nFor air:\nLandfills cause pollution to the local environment by contaminating the groundwater and aquifers, contaminating the soil, and producing methane. The Environmental Impact of Wood Smoke. Wood smoke is air pollution. It is as simple as that. Residential wood burning also produces a laundry list of other pollutants such as mercury, carbon monoxide, greenhouse gases, volatile organic compounds and nitrogen oxides.");
        }

    }
}
