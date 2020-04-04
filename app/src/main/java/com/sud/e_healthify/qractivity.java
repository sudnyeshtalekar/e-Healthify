package com.sud.e_healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class qractivity extends AppCompatActivity {
private ImageView qrimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qractivity);

        qrimg=findViewById(R.id.qrimg);
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
                    qrimg.setImageResource(R.drawable.greenqr);
                }
                else if(color.equals("Orange")){qrimg.setImageResource(R.drawable.yellowqr);
                    Log.i( "Value is: " , "Orange");
                }
                else if(color.equals("Red")){qrimg.setImageResource(R.drawable.yellowqr); Log.i( "Value is: " , "red");
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.i("Failed to read value.", String.valueOf(error.toException()));
            }
        });
        
    }
}
