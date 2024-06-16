package com.differentit.bmi_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvdisply;
    EditText etfit1;
    EditText etweight;
    EditText etinch;
    Button button;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvdisply =findViewById(R.id.tvdisply);
        etfit1 =(EditText)findViewById(R.id.etfit1);
        etweight =(EditText) findViewById(R.id.etweight);
        etinch =(EditText) findViewById(R.id.etinch);
        button =findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String sweight=etweight.getText().toString();
                float fweight=Float.parseFloat(sweight);

                String sfit=etfit1.getText().toString();
                float ffit =Float.parseFloat(sfit);

                String sinch=etinch.getText().toString();
                float finch=Float.parseFloat(sinch);

                float height = (float) (ffit*0.3048 + finch*0.0254);
                float bmi= fweight/ (height*height);



                tvdisply.setText("Your BMI index is:"+ bmi);



            }
        });










    }
}