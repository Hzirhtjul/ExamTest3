package com.example.examtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle=getIntent().getExtras();
        String uname=bundle.getString("Uname");
        tvName=findViewById(R.id.tvUname);
        tvName.setText("Welcome "+uname);
    }
}