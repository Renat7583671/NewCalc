package com.example.renat.mycalculatortest003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int NO_OPERATION = 0;
    public static final int PLUS = 1;
    public static final int MINUS = 2;
    public static final int MULTIPLY = 3;
    public static final int DEVISION = 4;
    public static final int RESULT = 5;
    public static final int RESET = 6;
    TextView textView;
    ImageButton button1;
    ImageButton button2;
    ImageButton button3;
    ImageButton button4;
    ImageButton button5;
    ImageButton button6;
    ImageButton button7;
    ImageButton button8;
    ImageButton button9;
    ImageButton plus;
    ImageButton button11;
    ImageButton minus;
    ImageButton multiply;
    ImageButton division;
    ImageButton result;
    ImageButton reset;

    double a,b,c;

    int operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        textView = (TextView) findViewById(R.id.textView);
        button1 = (ImageButton) findViewById(R.id.button1);
        button2 = (ImageButton) findViewById(R.id.button2);
        button3 = (ImageButton) findViewById(R.id.button3);
        button4 = (ImageButton) findViewById(R.id.button4);
        button5 = (ImageButton) findViewById(R.id.button5);
        button6 = (ImageButton) findViewById(R.id.button6);
        button7 = (ImageButton) findViewById(R.id.button7);
        button8 = (ImageButton) findViewById(R.id.button8);
        button9 = (ImageButton) findViewById(R.id.button9);
        plus = (ImageButton) findViewById(R.id.plus);
        button11 = (ImageButton) findViewById(R.id.button11);
        minus = (ImageButton) findViewById(R.id.minus);
        multiply = (ImageButton) findViewById(R.id.multiply);
        result = (ImageButton) findViewById(R.id.result);
        division = (ImageButton) findViewById(R.id.division);
        reset = (ImageButton) findViewById(R.id.reset);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        plus.setOnClickListener(this);
        button11.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        result.setOnClickListener(this);
        division.setOnClickListener(this);
        reset.setOnClickListener(this);

        clear();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                pressDigit(1);
                break;
            case R.id.button2:
                pressDigit(2);
                break;
            case R.id.button3:
                pressDigit(3);
                break;
            case R.id.button4:
                pressDigit(4);
                break;
            case R.id.button5:
                pressDigit(5);
                break;
            case R.id.button6:
                pressDigit(6);
                break;
            case R.id.button7:
                pressDigit(7);
                break;
            case R.id.button8:
                pressDigit(8);
                break;
            case R.id.button9:
                pressDigit(9);
                break;
            case R.id.button11:
                pressDigit(0);
                break;
            case R.id.plus:
                pressOperation(PLUS);
                break;
            case R.id.minus:
                pressOperation(MINUS);
                break;
            case R.id.division:
                pressOperation(DEVISION);
                break;
            case R.id.multiply:
                pressOperation(MULTIPLY);
                break;
            case R.id.result:
                pressOperation(RESULT);
                break;
            case R.id.reset:
                pressOperation(RESET);
                break;


            default:
                break;
        }
    }

    private void pressDigit(int digit) {

        if (operation == NO_OPERATION) {
            a = a*10 + digit;
            textView.setText("" + a);
        } else {
            b = b*10 + digit;
            textView.setText("" + b);
        }


    }
    private void pressOperation(int op) {
        switch (op) {
            case PLUS:
            case MINUS:
            case MULTIPLY:
            case DEVISION:
                operation = op;
                break;



            case RESULT:
                calcResult();
                textView.setText("" + c);
                break;

            case RESET:
                clear();
                a = 0;
                b = 0;
                c = 0;
                textView.setText("0");
                break;

        }
    }

    private void calcResult() {
        switch (operation) {
            case PLUS:
                c = a + b;
                break;
            case MINUS:
                c = a - b;
                break;
            case MULTIPLY:
                c = a * b;
                break;
            case DEVISION:
                c = a / b;
                break;

            case NO_OPERATION:
                break;
        }
    }



    private void clear() {
        a = 0;
        b = 0;
        c = 0;
        operation = NO_OPERATION;

    }
}
