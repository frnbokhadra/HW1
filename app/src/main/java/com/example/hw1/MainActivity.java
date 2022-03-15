package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText q =findViewById(R.id.quiz);
        EditText H1 =findViewById(R.id.HW);
        EditText M2 =findViewById(R.id.MID);
        EditText F3 =findViewById(R.id.FINAL);
        TextView T = findViewById(R.id.RESULT);
        Button RR = findViewById(R.id.RESET);
        Button C = findViewById(R.id.CALC);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(q.getText().toString());
                int H= Integer.parseInt(H1.getText().toString());
                int M= Integer.parseInt(M2.getText().toString());
                int F= Integer.parseInt(F3.getText().toString());
                int total= a+H+M+F ;
                T.setText(total+"");


            }
        });



    }
}