package com.example.omi.ndkcalculatordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    static{
        System.loadLibrary("calculator");
    }

    EditText first,second,answer;
    Button plus,minus,multiply,divide;

    private native int getAddition(int firstNumber,int secondNumber);
    private native int getSubtraction(int firstNumber,int secondNumber);
    private native int getMultiplication(int firstNumber,int secondNumber);
    private native int getDivision(int firstNumber,int secondNumber);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        answer = (EditText) findViewById(R.id.answer);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        int id = v.getId();
        switch(id)
        {
            case R.id.plus:
                add();
                break;
            case R.id.minus:
                subtract();
                break;
            case R.id.multiply:
                mul();
                break;
            case R.id.divide:
                division();
                break;
        }

    }


    private void add()
    {
        if(first.getText().toString().equals("")  || second.getText().toString().equals("") )
        {
            Toast.makeText(MainActivity.this, "plz provide both first and second value", Toast.LENGTH_LONG).show();
            return;
        }
        int firstNumber = Integer.parseInt(first.getText().toString());
        int secondNumber = Integer.parseInt(second.getText().toString());
        int result = this.getAddition(firstNumber,secondNumber);
        this.answer.setText(String.valueOf(result));

    }

    private void subtract()
    {
        if(first.getText().toString().equals("")  || second.getText().toString().equals("") )
        {
            Toast.makeText(MainActivity.this, "plz provide both first and second value", Toast.LENGTH_LONG).show();
            return;
        }
        int firstNumber = Integer.parseInt(first.getText().toString());
        int secondNumber = Integer.parseInt(second.getText().toString());
        int result = this.getSubtraction(firstNumber,secondNumber);
        this.answer.setText(String.valueOf(result));

    }

    private void mul()
    {
        if(first.getText().toString().equals("")  || second.getText().toString().equals("") )
        {
            Toast.makeText(MainActivity.this, "plz provide both first and second value", Toast.LENGTH_LONG).show();
            return;
        }
        int firstNumber = Integer.parseInt(first.getText().toString());
        int secondNumber = Integer.parseInt(second.getText().toString());
        int result = this.getMultiplication(firstNumber,secondNumber);
        this.answer.setText(String.valueOf(result));

    }

    private void division()
    {
        if(first.getText().toString().equals("")  || second.getText().toString().equals("") )
        {
            Toast.makeText(MainActivity.this, "plz provide both first and second value", Toast.LENGTH_LONG).show();
            return;
        }
        int firstNumber = Integer.parseInt(first.getText().toString());
        int secondNumber = Integer.parseInt(second.getText().toString());
        int result = this.getDivision(firstNumber,secondNumber);
        this.answer.setText(String.valueOf(result));

    }
}
