package com.lutful.class2143;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button button;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sNum = editText.getText().toString();

                if(sNum.length() >0) {

                    int number = Integer.parseInt(sNum);

                    if(number==1) tvDisplay.setText("Sunday");
                    else if (number==2) tvDisplay.setText("Monday");
                    else if (number==3) tvDisplay.setText("tuesDay");
                    else if (number==4) tvDisplay.setText("Wednesday");
                    else if (number==5) tvDisplay.setText("thusDay");
                    else if (number==6) tvDisplay.setText("friday");
                    else if (number==7) tvDisplay.setText("Saturday");
                    else tvDisplay.setText("don't be funny");
                          editText.setText("don't be funny");

                } else{

                    editText.setError("thike moto number dao");

                }
            });

        }
    }