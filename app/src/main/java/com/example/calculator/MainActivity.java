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
        field1.setText("");
        field2.setText("");

    }

    public void clear(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        field2.setText("");
    }

    public void factorial(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        if(temp.length()>0)
        {
            field1.setText(temp + "!");
            int i,fact=1;
            int number=Integer.parseInt(temp);//It is the number to calculate factorial
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            field2.setText("");
            String s = String.valueOf(fact);
            field2.setText(s);
        }


    }

    public void backspace(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();

        if(temp.length()>0)
        {
            field2.setText(temp.substring(0,temp.length()-1));
        }
    }

    public void power(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        if(temp.length()>0){
            field1.setText(temp + " ^");
            field2.setText("");
        }


    }

    public void inverse(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        if (temp.length()>0)
        {
            field1.setText("1/" + temp);
            field2.setText(String.valueOf(1/Float.parseFloat(temp)));
        }

    }

    public void square(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        if (temp.length()>0)
        {
            field1.setText(temp + "^2");
            field2.setText(String.valueOf((int) Math.pow(Integer.parseInt(temp),2)));
        }

    }

    public void multiply(View view) {
        EditText field1  = (EditText) findViewById(R.id.field1);
        EditText field2  = (EditText) findViewById(R.id.field2);

        String temp = field2.getText().toString();
        if(temp.length() >0)
        {
            field1.setText(temp + " *");
            field2.setText("");
        }

    }

    public void one(View view){
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "1");
    }

    public void seven(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "7");
    }

    public void eight(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "8");
    }

    public void nine(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
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
        if(temp.length() > 0)
        {
            field1.setText(temp + " /");
            field2.setText("");
        }

    }

    public void two(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "2");
    }

    public void three(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
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
        if(temp.length() > 0)
        {
            field1.setText(temp + " +");
            field2.setText("");
        }
    }

    public void four(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "4");
    }

    public void five(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "5");
    }

    public void six(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.charAt(0) == ' '){
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

        if(temp.length() > 0)
        {
            field1.setText(temp + " -");
            field2.setText("");
        }
    }

    public void zero(View view) {
        EditText field2  = (EditText) findViewById(R.id.field2);
        String temp = field2.getText().toString();
        if (temp.length() > 0 && temp.length() > 0 && temp.charAt(0) == ' '){
            field2.setText("");
            temp = field2.getText().toString();
        }
        if(temp.length() < 8)
            field2.setText(temp + "0");
    }

    public void answer(View view) {
        try {
            EditText field1  = (EditText) findViewById(R.id.field1);
            EditText field2  = (EditText) findViewById(R.id.field2);

            String s = field1.getText().toString();
            int value1 = (int) Float.parseFloat(s.substring(0,s.length()-2));
            int value2 = (int) Float.parseFloat(field2.getText().toString());

            s = field1.getText().toString();
            field1.setText(field1.getText().toString() + " " + field2.getText().toString() + " =");

            char c = s.charAt(s.length()-1);

            if(c == '*')
                s = String.valueOf(value1 * value2);
            else if (c == '/')
            {
                if (value2 != 0){
                    s = String.valueOf((double)value1 / value2);
                }
                else
                    s = " Invalid Operation";
            }
            else if(c == '+'){
                s = String.valueOf(value1 + value2);

            }
            else if(c == '-'){
                s = String.valueOf(value1 - value2);

            }
            else if(c == '^'){
                s = String.valueOf((int) Math.pow(value1,value2));
            }

            field2.setText(s);
        }
        catch (Exception ex)
        {

        }
    }
}