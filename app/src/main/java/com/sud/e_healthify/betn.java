package com.sud.e_healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class betn extends AppCompatActivity {

    private ImageView betn;
    private ImageView fill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_betn);

        betn=findViewById(R.id.betn);
        fill=findViewById(R.id.fill);

        betn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(betn.this, mainmenu.class);
                startActivity(intent);
            }
        });

        fill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(betn.this, typeform.class);
                startActivity(intent);
            }
        });

    }
}
