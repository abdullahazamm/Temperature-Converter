package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConverterF();
        ConverterCel();
        ConverterCent();
        ConverterKel();
        Reset();
    }


    public void ConverterF(){
        Button btn1=findViewById(R.id.button4);
        Button btn2=findViewById(R.id.button3);
        Button btn3=findViewById(R.id.button1);
        Button btn4=findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float FarToCel=Float.parseFloat(editText.getText().toString());
                float FToC= (float) ((FarToCel-32) * 0.555);

                editText1.setText(String.valueOf(FToC));


                float FarToCent=Float.parseFloat(editText.getText().toString());
                float FToCent= (float) ((FarToCent-32)*0.555);

                editText2.setText(String.valueOf(FToCent));


                float FarToKel=Float.parseFloat(editText.getText().toString());
                float FtoKel= (float) ((FarToKel-32)*0.555+273.15);


                editText3.setText(String.valueOf(FtoKel));








            }
        });


    }
    public void ConverterCel() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float CelToFar=Float.parseFloat(editText1.getText().toString());
                float CToFar= (float) (CelToFar*(1.8)+32);
                editText.setText(String.valueOf(CToFar));


                float CelToCent=Float.parseFloat(editText1.getText().toString());
                float CToCent=CelToCent;
                editText2.setText(String.valueOf(CToCent));


                float CelToKel=Float.parseFloat(editText1.getText().toString());
                float CToKel= (float) (CelToKel+273.15);
                editText3.setText(String.valueOf(CToKel));




            }


        });




    }


    public void ConverterCent() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float CentToFar=Float.parseFloat(editText2.getText().toString());
                float CToFar= (float) (CentToFar*(1.8)+32);
                editText.setText(String.valueOf(CToFar));


                float CentToCel=Float.parseFloat(editText2.getText().toString());
                float CToCent=CentToCel;
                editText1.setText(String.valueOf(CToCent));


                float CentToKel=Float.parseFloat(editText2.getText().toString());
                float CToKel= (float) (CentToKel+273.15);
                editText3.setText(String.valueOf(CToKel));

            }

        });

    }





    public void ConverterKel() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float KelToFar=Float.parseFloat(editText3.getText().toString());
                float KToFar= (float) ((KelToFar-273.15)*1.8+32);
                editText.setText(String.valueOf(KToFar));


                float KelToCel=Float.parseFloat(editText3.getText().toString());
                float KToCel= (float) (KelToCel-273.15);
                editText1.setText(String.valueOf(KToCel));


                float KelToCent=Float.parseFloat(editText3.getText().toString());
                float KToCent= (float) (KelToCent-273.15);
                editText2.setText(String.valueOf(KToCent));

            }

        });

    }

    public void Reset(){
        Button resetbtn=findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                editText.setText(null);
                editText1.setText(null);
                editText2.setText(null);
                editText3.setText(null);

            }
        });


    }


}