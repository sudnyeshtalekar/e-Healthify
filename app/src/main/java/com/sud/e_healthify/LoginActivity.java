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

       // usnam=findViewById(R.id.usnam);
        //pass=findViewById(R.id.pass);
        signin=findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, betn.class);
                startActivity(intent);
                /*if (usnam.getText().toString()=="rishik" && pass.getText().toString()=="test"){

                Intent intent = new Intent(LoginActivity.this, typeform.class);
                startActivity(intent);
                }
                else{Toast. makeText(getApplicationContext(),"Incorrect login details",Toast. LENGTH_SHORT);}*/

            }
        });


      /*<ImageView
        android:id="@+id/loginback"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="26dp"
        android:layout_marginTop="47dp"
        android:layout_marginEnd="346dp"
        android:layout_marginBottom="737dp"
        app:layout_constraintBottom_toBottomOf="@+id/imageView3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0"
        app:srcCompat="@drawable/loginback" />*/
    }
}
