package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one(View view){
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        field2.setText(temp + "1");
    }

    public void clearall(View view) {
    }

    public void clear(View view) {
    }

    public void sign(View view) {
    }

    public void backspace(View view) {
    }

    public void percent(View view) {
    }

    public void inverse(View view) {
    }

    public void square(View view) {
    }

    public void multiply(View view) {
    }

    public void seven(View view) {
    }

    public void eight(View view) {
    }

    public void nine(View view) {
    }

    public void divide(View view) {
    }

    public void two(View view) {
    }

    public void three(View view) {
    }

    public void plus(View view) {
    }

    public void four(View view) {
    }

    public void five(View view) {
    }

    public void six(View view) {
    }

    public void minus(View view) {
    }

    public void zero(View view) {
    }

    public void answer(View view) {
    }
}