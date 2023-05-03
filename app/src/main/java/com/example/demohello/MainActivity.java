package com.example.demohello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Types of Toast");

        Button btn3 = findViewById(R.id.button3);
        Button btn2 = findViewById(R.id.button2);
        Button btn1 = findViewById(R.id.button1);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Using Simple Toast", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li=getLayoutInflater();
                View layout= li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
//                ImageView toastImageView = (ImageView) layout.findViewById(R.id.custom_toast_image);
//                TextView toastTextView = (TextView) layout.findViewById(R.id.custom_toast_message);
//                toastImageView.setImageResource(R.drawable.hello);
//                toastTextView.setText("Custom Toast In Android");
                Toast t2=new Toast(getApplicationContext());
                t2.setDuration(Toast.LENGTH_SHORT);
                t2.setGravity(Gravity.CENTER,0,0);
                t2.setView(layout);
                t2.show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t=Toast.makeText(MainActivity.this,"Using Toast android.widget",Toast.LENGTH_SHORT);
                t.setGravity(Gravity.CENTER | Gravity.AXIS_SPECIFIED,50,-1000);
                t.show();
            }
        });
    }

}
