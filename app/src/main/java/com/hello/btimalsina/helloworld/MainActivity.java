package com.hello.btimalsina.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    EditText etUserName, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        init();
        Log.e("On Create", "Step2");
    }

    private void init () {
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        etUserName = (EditText)findViewById(R.id.etUserName);
        etPassword = (EditText)findViewById(R.id.etPassword);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Welcome to LeapFrog Academy!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("On Start", "Step1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("On Pause", "On Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("On Resume", "On Resume");

    }
}
