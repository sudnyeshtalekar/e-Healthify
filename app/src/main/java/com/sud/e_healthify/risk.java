package com.sud.e_healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class risk extends AppCompatActivity {

    private ImageView risk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk);
        risk=findViewById(R.id.risk);

        // Read from the database

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("prediction").child("Risk").child("Color");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String color = dataSnapshot.getValue(String.class);
                Log.i( "Value is: " , color);
                if (color.equals("Green")){
                    Log.i( "Value is: " , "Green");
                    risk.setImageResource(R.drawable.greenrisk);
                }
                else if(color.equals("Orange")){risk.setImageResource(R.drawable.yellowrisk);
                Log.i( "Value is: " , "Orange");
                }
                else if(color.equals("Red")){risk.setImageResource(R.drawable.yellowrisk); Log.i( "Value is: " , "red");
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.i("Failed to read value.", String.valueOf(error.toException()));
            }
        });
        alle();

    }
    @Override
    public void onBackPressed() {
        Log.d("CDA", "onBackPressed Called");
        Intent mySuperIntent = new Intent(risk.this, mainmenu.class);
        startActivity(mySuperIntent);
    }



    public void alle() {
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
        myRef.child("counter").setValue("0");


    }
}
