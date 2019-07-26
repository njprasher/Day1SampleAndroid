package com.example.day1sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtPreviousMsg;
    Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtPreviousMsg = (TextView)findViewById(R.id.txtPreviousMsg);
        btnAlert = (Button)findViewById((R.id.btnAlert));

        

    }
}
