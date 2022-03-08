package com.example.gradecalculator;

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

        EditText Quizes = findViewById(R.id.Quizes) ;
        EditText HW = findViewById(R.id.HW) ;
        EditText MidTerm = findViewById(R.id.MidTerm) ;
        EditText Final = findViewById(R.id.Final) ;

        Button Calculate = findViewById(R.id.Calculate) ;
        Button Reset = findViewById(R.id.Reset) ;
        TextView Result = findViewById(R.id.Result) ;

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(Quizes.getText().toString());
                int b = Integer.parseInt(HW.getText().toString());
                int c = Integer.parseInt(MidTerm.getText().toString());
                int d = Integer.parseInt(Final.getText().toString());
                int result = a+b+c+d ;

                Result.setText(result + " ");
            }



        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quizes.getText().clear();
                HW.getText().clear();
                MidTerm.getText().clear();
                Final.getText().clear();
                Result.setText("Result");

    }
        });
    }
}