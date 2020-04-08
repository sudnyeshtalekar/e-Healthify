package com.sud.e_healthify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class typeform extends AppCompatActivity {
    private ImageView nextp;
    public String trans="";
    private EditText child;
    private EditText age;
    private EditText cases;
    private EditText death;
    private EditText coma;
    DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeform);

        /*child=findViewById(R.id.child);
        age=findViewById(R.id.age);
        cases=findViewById(R.id.cases);
        death=findViewById(R.id.death);
        coma=findViewById(R.id.coma);

        alle();
        dropdown();
        occ();
        trans();
        como();
        pulm();
        cardio();*/


        nextp=findViewById(R.id.nextp);
        nextp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");
                myRef.child("child").setValue(child.getText().toString());
                myRef.child("age").setValue(age.getText().toString());
                myRef.child("cases").setValue(cases.getText().toString());
                myRef.child("death").setValue(death.getText().toString());
                myRef.child("coma").setValue(coma.getText().toString());*/
                Intent intent = new Intent(typeform.this, typeform1.class);
                startActivity(intent);
            }


        });


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


    }

    public void cardio() {
        String[] items = new String[]{"NA", "Elevated" , "Normal" , "Stage-01" , "Stage-02"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        final Spinner cardio = findViewById(R.id.cardio);
        cardio.setAdapter(adapter);
        cardio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null && item !="NA") {
                    Toast.makeText(typeform.this, item.toString(),Toast.LENGTH_SHORT).show();
                    String cardio=item.toString();
                    Log.i("str",cardio);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("cardio").setValue(cardio);

                }
                else if(item=="NA"){ FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("cardio").setValue("0");
                }
                Toast.makeText(typeform.this, "Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });
    }

    public void pulm() {
        String[] items = new String[]{"<100" , "<200" , "<300" , "<400"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        final Spinner pulm = findViewById(R.id.pulm);
        pulm.setAdapter(adapter);
        pulm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null) {
                    Toast.makeText(typeform.this, item.toString(),Toast.LENGTH_SHORT).show();
                    String pulm=item.toString();
                    Log.i("str",pulm);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("pulm").setValue(pulm);

                }
                Toast.makeText(typeform.this, "Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });
    }

    public void como() {
        String[] items = new String[]{"NA" , "Coronary Heart Disease" , "Diabetes" , "Hypertension" , "None" };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        final Spinner como = findViewById(R.id.como);
        como.setAdapter(adapter);
        como.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null && item !="NA") {
                    Toast.makeText(typeform.this, item.toString(),Toast.LENGTH_SHORT).show();
                    String como=item.toString();
                    Log.i("str",como);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("como").setValue(como);

                }
                else if(item=="NA"){ FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("como").setValue("0");
                }
                Toast.makeText(typeform.this, "Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });
    }


    public void trans() {
        String[] items = new String[]{"NA","Car","Public","Walk"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        final Spinner trans = findViewById(R.id.trans);
        trans.setAdapter(adapter);
        trans.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null && item !="NA") {
                    Toast.makeText(typeform.this, item.toString(),Toast.LENGTH_SHORT).show();
                    String trans=item.toString();
                    Log.i("str",trans);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("trans").setValue(trans);

                }
                else if(item=="NA"){ FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("trans").setValue("0");
                }
                Toast.makeText(typeform.this, "Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });
    }

    public void occ() {
        String[] items = new String[]{ "NA" , "Business" , "Cleaner" , "Clerk" , "Driver" , "Farmer" , "Legal" , "Manufacturing" , "Researcher" , "Sales"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        Spinner occ = findViewById(R.id.occ);
        occ.setAdapter(adapter);
        occ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null && item != "NA") {
                    Toast.makeText(typeform.this, item.toString(),Toast.LENGTH_SHORT).show();
                    String occ=item.toString();
                    Log.i("str",occ);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("occ").setValue(occ);

                }
                else if(item=="NA"){ FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("occ").setValue("0");
                }
                Toast.makeText(typeform.this, "Selected",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });
    }

    public void dropdown() {
        String[] items = new String[]{"Male", "Female", "other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        Spinner dropdown = findViewById(R.id.spinner1);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null) {
                    Toast.makeText(typeform.this, item.toString(),Toast.LENGTH_SHORT).show();
                    String gend=item.toString();
                    Log.i("str",gend);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");
                    myRef.child("gend").setValue(gend);

                }
                Toast.makeText(typeform.this, "Selected",
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }

        });
    }*/
}
