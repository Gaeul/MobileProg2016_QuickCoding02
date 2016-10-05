package com.example.gaeul.quickcoding02;

import android.support.v7.app.AppCompatActivity;
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

        //객체 생성
        final EditText edittext = (EditText) findViewById(R.id.editText);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button send_button = (Button) findViewById(R.id.send_button);
        Button Bigger_button = (Button) findViewById(R.id.bigger_button);
        Button Smaller_button = (Button) findViewById(R.id.smaller_button);
        Button Bingo_button = (Button) findViewById(R.id.bingo_button);

        final findNumber findnumber = new findNumber();


        //send 버튼 눌렀을 시 textView에 숫자 표시
        send_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView2.setText("Your number is " + findnumber.random());
            }
        });

        //Bigger 버튼 눌렀을 시 textView에 숫자 표시
        Bigger_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView2.setText("Your number is " + findnumber.pressBigger());
            }
        });

        //Smaller 버튼 눌렀을 시 textView에 숫자 표시
        Smaller_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView2.setText("Your number is " + findnumber.pressSmaller());
            }
        });

        Bingo_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView2.setText("Correct numbers in " + findnumber.pressBingo()+ " time(s)!");
            }
        });



    }


}
