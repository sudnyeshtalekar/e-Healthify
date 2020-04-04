package com.sud.e_healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class typeform1 extends AppCompatActivity {

    private ImageView submit;
    private TextView plat;
    private TextView diu;
    private TextView hbb;
    private TextView dimer;
    private TextView heart;
    private TextView hdl;
    private TextView charl;
    private TextView blood;
    private TextView trips;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeform1);

        submit=findViewById(R.id.submit);
        diu= findViewById(R.id.diu);
        plat= findViewById(R.id.plat);
        hbb= findViewById(R.id.hbb);
        dimer= findViewById(R.id.dimer);heart= findViewById(R.id.heart);
        hdl= findViewById(R.id.hdl);
        charl= findViewById(R.id.charl);blood= findViewById(R.id.blood);trips= findViewById(R.id.trips);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");
                myRef.child("diu").setValue(diu.getText().toString());
                myRef.child("plat").setValue(plat.getText().toString());
                myRef.child("hbb").setValue(hbb.getText().toString());
                myRef.child("dimer").setValue(dimer.getText().toString());
                myRef.child("hdl").setValue(hdl.getText().toString());
                myRef.child("charl").setValue(charl.getText().toString());
                myRef.child("blood").setValue(blood.getText().toString());
                myRef.child("heart").setValue(heart.getText().toString());
                myRef.child("trips").setValue(trips.getText().toString());
                //alle();
                Intent intent = new Intent(typeform1.this, mainmenu.class);
                startActivity(intent);
                myRef.child("counter").setValue("1");
            }

            /*public void alle() {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");
                myRef.child("age").setValue("e");
                myRef.child("blood").setValue("e");
                myRef.child("cardio").setValue("e");
                myRef.child("cases").setValue("e");
                myRef.child("charl").setValue("e");
                myRef.child("child").setValue("e");
                myRef.child("coma").setValue("e");
                myRef.child("death").setValue("e");
                myRef.child("dimer").setValue("e");
                myRef.child("diu").setValue("e");
                myRef.child("gend").setValue("e");
                myRef.child("hbb").setValue("e");
                myRef.child("hdl").setValue("e");
                myRef.child("heart").setValue("e");
                myRef.child("occ").setValue("e");
                myRef.child("plat").setValue("e");
                myRef.child("pulm").setValue("e");
                myRef.child("trans").setValue("e");
                myRef.child("trips").setValue("e");
                myRef.child("como").setValue("e");

            }*/
        });

    }
}
