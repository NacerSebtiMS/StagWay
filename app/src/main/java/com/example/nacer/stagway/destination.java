package com.example.nacer.stagway;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class destination extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
    }

    @SuppressLint("ResourceType")
    public void valider(View view){
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        rg = findViewById(R.id.radioGroup2);

        int id_rb = rg.getCheckedRadioButtonId();
        rb = findViewById(id_rb);


        intent.putExtra("mode", rb.getText());

        startActivity(intent);
    }
}
