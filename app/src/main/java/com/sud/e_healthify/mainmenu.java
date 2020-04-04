package com.sud.e_healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class mainmenu extends AppCompatActivity {

    private TextView inf;
    private TextView qr;
    private TextView risk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        inf=findViewById(R.id.inf);
        qr=findViewById(R.id.qr);
        risk=findViewById(R.id.risk);

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mySuperIntent = new Intent(mainmenu.this, qractivity.class);
                startActivity(mySuperIntent);

            }
        });

        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mySuperIntent = new Intent(mainmenu.this, MapsActivity.class);
                startActivity(mySuperIntent);

            }
        });


        risk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mySuperIntent = new Intent(mainmenu.this, loadactivity.class);
                startActivity(mySuperIntent);

            }
        });

    }


}
