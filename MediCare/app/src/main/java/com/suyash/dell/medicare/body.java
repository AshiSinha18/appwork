package com.suyash.dell.medicare;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class body extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5;
    double max = 38;
    double min = 34;

    Button b1,b2;
  SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);
        tv1=(TextView)findViewById(R.id.textView11);
        tv2=(TextView)findViewById(R.id.textView12);
        tv3=(TextView)findViewById(R.id.textView13);
        b1=(Button)findViewById(R.id.button5);
        b2=(Button)findViewById(R.id.connect);
        final double random = (Math.random() * (max-min)+1) + min;

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(Double.toString(random));
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(body.this,workingHours.class);
                startActivity(i);
            }
        });




    }
}
