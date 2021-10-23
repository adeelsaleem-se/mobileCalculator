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



    public void clearall(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);


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
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        field1.setText(temp + " *");
        field2.setText("");
    }

    public void one(View view){
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "1");
    }

    public void seven(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "7");
    }

    public void eight(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "8");
    }

    public void nine(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "9");
    }

    public void divide(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        field1.setText(temp + " /");
        field2.setText("");
    }

    public void two(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "2");
    }

    public void three(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "3");
    }

    public void plus(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        field1.setText(temp + " +");
        field2.setText("");
    }

    public void four(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "4");
    }

    public void five(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "5");
    }

    public void six(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "6");
    }

    public void minus(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        field1.setText(temp + " -");
        field2.setText("");
    }

    public void zero(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.length() > 0 && temp.charAt(0) == 'A'){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "0");
    }

    public void answer(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String s = field1.getText().toString();
        int value1 = Integer.parseInt(s.substring(0,s.length()-3));
        int value2 = Integer.parseInt(field2.getText().toString());

        s = field1.getText().toString();
        field1.setText(field1.getText().toString() + " " + field2.getText().toString() + " =");

        char c = s.charAt(s.length());
        if(c == '*')
            s = String.valueOf(value1 - value2);
        else if (c == '/')
        {
            if (value2 != 0){
                s = String.valueOf(value1 / value2);
            }
            else
                s = "Invalid Operation";
        }
        else if(c == '+'){
            s = String.valueOf(value1 + value2);

        }
        else if(c == '-'){
            s = String.valueOf(value1 - value2);

        }
        else
            s = " Invalid operation!";

        field2.setText("Answer " + String.valueOf(value1 - value2));
    }
}