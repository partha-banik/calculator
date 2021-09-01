package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView firstView, secondview;
    String secondvalue, operator;
    double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstView = findViewById(R.id.firstTextviewid);
        secondview = findViewById(R.id.secondTextviewid);
    }

    public void digitfunction(View view) {
        secondvalue = secondview.getText().toString();
        if (view.getId() == R.id.zerobuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("0");
            } else
                secondview.setText(secondvalue + "0");

        } else if (view.getId() == R.id.onebuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("1");
            } else
                secondview.setText(secondvalue + "1");
        } else if (view.getId() == R.id.twobuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("2");
            } else
                secondview.setText(secondvalue + "2");
        } else if (view.getId() == R.id.threebuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("3");
            } else
                secondview.setText(secondvalue + "3");
        } else if (view.getId() == R.id.fourbuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("4");
            } else
                secondview.setText(secondvalue + "4");
        } else if (view.getId() == R.id.fivebuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("5");
            } else
                secondview.setText(secondvalue + "5");
        } else if (view.getId() == R.id.sixbuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("6");
            } else
                secondview.setText(secondvalue + "6");
        } else if (view.getId() == R.id.sevenbuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("7");
            } else
                secondview.setText(secondvalue + "7");
        } else if (view.getId() == R.id.eightbuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("8");
            } else
                secondview.setText(secondvalue + "8");
        } else if (view.getId() == R.id.ninebuttonid) {
            if (secondvalue.equals("0")) {
                secondview.setText("9");
            } else
                secondview.setText(secondvalue + "9");
        } else {

            secondview.setText(secondvalue + ".");
            if (secondvalue.contains(".")) {
                secondview.setText(secondvalue);
            }

        }
    }

    public void logicFunction(View view) {
        secondvalue = secondview.getText().toString();
        num1 = Double.parseDouble(secondvalue);//store num1

        if (view.getId() == R.id.sumbuttonid) {
            operator = "+";
        } else if (view.getId() == R.id.subbuttonid) {
            operator = "-";
        } else if (view.getId() == R.id.multibuttonid) {
            operator = "*";
        } else if (view.getId() == R.id.divbuttonid) {
            operator = "/";
        }

        firstView.setText(secondvalue + operator);
        secondview.setText("0");
         if (view.getId() == R.id.navigationbuttonid) {
             operator = "-";


             if (secondvalue.contains("-")) {
                 secondvalue = secondvalue.replaceAll("-", "");
                 secondview.setText("-" + secondvalue);

             } else {
                 secondview.setText("-" + secondvalue);
             }
         }
    }



    public void ResultFunction(View view) {
        num2=Double.parseDouble(secondview.getText().toString());
        if(operator.equals("+")){
            result=num1+num2;
        }
        else if(operator.equals("-")){
            result=num1-num2;
        }
        else if(operator.equals("*")){
            result=num1*num2;
        }
        else {
            result = num1 / num2;
        }
        firstView.setText(""+num1+" "+operator+num2 + "=");
             secondview.setText(""+result);
    }

    public void ClearFunction(View view) {
        firstView.setText("");
        secondview.setText("0");
        num1=0;
        num2=0;
    }

    public void ClearFunctionT2(View view) {
        secondview.setText("");
        secondview.setText("0");
        num2=0;

    }

    public void deletefunction(View view) {
       secondvalue = secondview.getText().toString();
       if(secondvalue.length() !=0){
           secondvalue = secondvalue.substring(0,secondvalue.length()-1);
           secondview.setText(secondvalue);
           if(secondvalue.length() ==0){
               secondview.setText('0');
           }
       }
    }



    }
