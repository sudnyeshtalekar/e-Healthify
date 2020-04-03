package com.sud.e_healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private EditText usnam;
    private EditText pass;
    private ImageView signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usnam=findViewById(R.id.usnam);
        pass=findViewById(R.id.pass);
        signin=findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usnam.getText().toString()=="rishik" && pass.getText().toString()=="test"){

                Intent intent = new Intent(LoginActivity.this, FormActivity.class);
                startActivity(intent);}
                else{Toast. makeText(getApplicationContext(),"Incorrect login details",Toast. LENGTH_SHORT);}

            }
        });



    }
}
