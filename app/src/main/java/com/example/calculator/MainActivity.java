package com.example.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String showString = "", operator,primaryString="";
    String result;
    double res, temp;
    int f, flag = 0,zero=0,othersNumber=0;
    boolean dotEnable = true,zeroPress=true;

    TextView tvShow, tvResult;

    Button btnClear, btnOneDelete, btnDivide, btnMulti;
    Button btn7, btn8, btn9, btnSub;
    Button btn4, btn5, btn6, btnAdd;
    Button btn1, btn2, btn3, btnPoint;
    Button btnPercent, btn0, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = findViewById(R.id.tv_1);
        tvResult = findViewById(R.id.tv_2);

        btnClear = findViewById(R.id.btn_c);
        btn7 = findViewById(R.id.btn_7);
        btn4 = findViewById(R.id.btn_4);
        btn1 = findViewById(R.id.btn_1);
        btnPercent = findViewById(R.id.btn_percent);

        btnOneDelete = findViewById(R.id.btn_one_delete);
        btn8 = findViewById(R.id.btn_8);
        btn5 = findViewById(R.id.btn_5);
        btn2 = findViewById(R.id.btn_2);
        btn0 = findViewById(R.id.btn_0);

        btnDivide = findViewById(R.id.btn_divide);
        btn9 = findViewById(R.id.btn_9);
        btn6 = findViewById(R.id.btn_6);
        btn3 = findViewById(R.id.btn_3);
        btnPoint = findViewById(R.id.btn_point);

        btnMulti = findViewById(R.id.btn_multi);
        btnSub = findViewById(R.id.btn_sub);
        btnAdd = findViewById(R.id.btn_add);
        btnEqual = findViewById(R.id.btn_equal);

        btnClear.setOnClickListener(MainActivity.this);
        btn7.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn1.setOnClickListener(MainActivity.this);
        btnPercent.setOnClickListener(MainActivity.this);

        btnOneDelete.setOnClickListener(MainActivity.this);
        btn8.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn0.setOnClickListener(MainActivity.this);

        btnDivide.setOnClickListener(MainActivity.this);
        btn9.setOnClickListener(MainActivity.this);
        btn6.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btnPoint.setOnClickListener(MainActivity.this);

        btnMulti.setOnClickListener(MainActivity.this);
        btnSub.setOnClickListener(MainActivity.this);
        btnAdd.setOnClickListener(MainActivity.this);
        btnEqual.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_1) {
            if (flag == 1) {
                numberResult();
            }

            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                if (primaryString.length()==8)
                {}
                else
                {
                    primaryString=primaryString+"1";
                    showString = showString + "1";
                    tvShow.setText(showString);
                    calculateValue(showString);
                    zero=0;}
            }
        }

        if (v.getId() == R.id.btn_2) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                if (primaryString.length()==8)
                {}
                else
                {primaryString=primaryString+"2";
                    showString = showString + "2";
                    tvShow.setText(showString);
                    calculateValue(showString);}
            }}

        if (v.getId() == R.id.btn_3) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                showString = showString + "3";
                tvShow.setText(showString);
                calculateValue(showString);
            }}

        if (v.getId() == R.id.btn_4) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                showString = showString + "4";
                tvShow.setText(showString);
                calculateValue(showString);
            }}

        if (v.getId() == R.id.btn_5) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                showString = showString + "5";
                tvShow.setText(showString);
                calculateValue(showString);
            }}

        if (v.getId() == R.id.btn_6) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                showString = showString + "6";
                tvShow.setText(showString);
                calculateValue(showString);
            }}

        if (v.getId() == R.id.btn_7) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                showString = showString + "7";
                tvShow.setText(showString);
                calculateValue(showString);
            }}

        if (v.getId() == R.id.btn_8) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                showString = showString + "8";
                tvShow.setText(showString);
                calculateValue(showString);
            }}

        if (v.getId() == R.id.btn_9) {
            if (flag == 1) {
                numberResult();
            }
            if (othersNumber==1)
            {}
            else
            {
                if (showString.length()==1 && showString.equals("0"))
                {
                    showString="";
                }
                showString = showString + "9";
                tvShow.setText(showString);
                calculateValue(showString);
            }}

        if (v.getId() == R.id.btn_0) {
            if (flag == 1) {
                numberResult();
            }
            if (zero==1)
            {
                if (zeroPress==true)
                {showString=showString+"0";
                    tvShow.setText(showString);
                    calculateValue(showString);
                    zeroPress=false;
                    othersNumber=1;}
            }
            else {
                if (showString.equals("0")) {
                } else {
                    showString = showString + "0";
                    tvShow.setText(showString);
                    calculateValue(showString);
                }
            }
        }

        if (v.getId() == R.id.btn_point) {
            if (flag == 1) {
                numberResult();
            }
            if (showString.length() == 0) {
                showString = "0";
            }
            if (dotEnable == true) {
                showString = showString + ".";
                tvShow.setText(showString);
                dotEnable = false;
            }
            zero=0;
            othersNumber=0;
            calculateValue(showString);
        }

        if (v.getId()==R.id.btn_percent)
        {
            if (flag == 1)
            {
                showString=tvResult.getText().toString();
                showString=showString.substring(1,showString.length());
                showString=showString+"+";
                tvShow.setText(showString);
                flag=0;
            }
            if (tvResult.getText().equals("")) {
                showString = "0";
            }
            if ((showString.charAt(showString.length()-1)=='x')||(showString.charAt(showString.length()-1)=='+')||
                    (showString.charAt(showString.length()-1)=='-')||(showString.charAt(showString.length()-1)=='/'))
            {}
            else {
                showString=showString+"%";
                tvShow.setText(showString);
                String per=showString;
                String perValue="";
                int c=0;
                for (int i=per.length();i>1;i--)
                {
                    String ch=per.substring(i-2,i-1);
                    if (ch.equals("+")||(ch.equals("-"))||(ch.equals("x"))||(ch.equals("/")))
                    {break;}
                    else
                    {
                        perValue=perValue+ch;
                    }
                    c++;
                }
                per="";
                for (int i=perValue.length();i>0;i--)
                {
                    per=per+perValue.charAt(i-1);
                }
                double a=Double.parseDouble(per)*0.01;
                //String e=String.valueOf(a);
                //int i=e.indexOf("E");

                BigDecimal b= BigDecimal.valueOf(a);

                showString=showString.substring(0,showString.length()-(c+1));
                showString=showString+String.valueOf(b);
                if (showString.substring(showString.length()-2,showString.length()).contains(".0"))
                {
                    showString=showString.substring(0,showString.length()-2);
                }

                tvShow.setText(showString);
                calculateValue(showString);
            }
        }

        if (v.getId() == R.id.btn_add) {
            if (flag == 1) {
                showString=tvResult.getText().toString();
                int e=showString.indexOf("E");
                showString=showString.substring(1,showString.length());
                if (e==-1)
                {}
                else
                {
                    double a=Double.parseDouble(showString);
                    BigDecimal bigDecimal=new BigDecimal(a);
                    showString=String.valueOf(bigDecimal);
                }
                showString=showString+"+";
                tvShow.setText(showString);
                flag=0;
            }
            else {
                if (tvResult.getText().equals("")) {
                    showString = "0";
                }
                if (showString.charAt(showString.length() - 1) == '+' || showString.charAt(showString.length() - 1) == '-'
                        || showString.charAt(showString.length() - 1) == 'x' || showString.charAt(showString.length() - 1) == '/') {
                    showString = showString.substring(0, showString.length() - 1);
                    showString = showString + "+";
                    tvShow.setText(showString);
                } else {
                    showString = showString + "+";
                    tvShow.setText(showString);
                }
            }
            calculateValue(showString);
            dotEnable = true;
            zero=1;
            zeroPress=true;
            primaryString="";
        }

        if (v.getId() == R.id.btn_sub) {
            if (flag == 1) {
                showString=tvResult.getText().toString();
                showString=showString.substring(1,showString.length());
                showString=showString+"-";
                tvShow.setText(showString);
                flag=0;
            }
            if (tvResult.getText().equals("")) {
                showString = "0";
            }
            if ((showString.charAt(showString.length() - 1) == '+') || (showString.charAt(showString.length() - 1) == '-')
                    || (showString.charAt(showString.length() - 1) == 'x') || (showString.charAt(showString.length() - 1) == '/')) {
                showString = showString.substring(0, showString.length() - 1);
                showString = showString + "-";
                tvShow.setText(showString);
            } else {
                showString = showString + "-";
                tvShow.setText(showString);
            }
            calculateValue(showString);
            dotEnable = true;
            zero=1;
            zeroPress=true;
        }

        if (v.getId() == R.id.btn_multi) {
            flag = 0;
            showString = tvResult.getText().toString();
            if (showString.equals("")) {
                showString = "0";
            } else {
                showString = showString.substring(1, showString.length());
            }
            if (showString.charAt(showString.length() - 1) == 'x') {
            } else {
                showString = showString + "x";
                tvShow.setText(showString);
            }
            calculateValue(showString);
            dotEnable = true;
            zero=1;
            zeroPress=true;
        }

        if (v.getId() == R.id.btn_divide) {
            flag = 0;
            showString = tvResult.getText().toString();
            if (showString.equals("")) {
                showString = "0";
            } else {
                showString = showString.substring(1, showString.length());
            }
            if (showString.charAt(showString.length() - 1) == '/') {
            } else {
                showString = showString + "/";
                tvShow.setText(showString);
            }
            calculateValue(showString);
            dotEnable = true;
            zero=1;
            zeroPress=true;
        }

        if (v.getId()==R.id.btn_equal)
        {
            tvShow.setTextColor(Color.GRAY);
            tvResult.setTextSize(40);
            tvResult.setTextColor(Color.BLACK);
            flag = 1;
        }

        if (v.getId() == R.id.btn_c) {
            numberResult();
        }

        if (v.getId()==R.id.btn_one_delete)
        {
            showString=tvShow.getText().toString();
            if (showString.length() > 0)
            {
                if (showString.charAt(showString.length() - 1) == '.')
                {
                    dotEnable = true;
                }
                showString = showString.substring(0, showString.length() - 1);
            }
            tvShow.setText(showString);
            if (showString.length() == 0)
            {
                tvResult.setText("");
            }
            else
            {
                calculateValue(showString);
            }
        }
    }

    private void calculateValue(String showString) {

        result="";
        operator="";
        int n=showString.length();
        for (int i=0;i<n;i++)
        {
            String ch=showString.substring(i,i+1);
            if (ch.equals("+")||ch.equals("-")||ch.equals("x")||ch.equals("/"))
            {
                operator=ch;
                result="0";
                f=0;
                temp=0;
            }
            else
            {
                result=result+ch;
            }

            checkSavedOperation(operator);
        }
    }


    private void checkSavedOperation(String operator) {
        if (operator.equals(""))
        {
            res=Double.parseDouble(result);
            setResultToTextView(res);
        }

        if (operator.equals("+") && f==1)
        {
            double second = secondValue(result);
            res = res + second;
            setResultToTextView(res);
        }

        if (operator.equals("-") && f==1)
        {
            double second = secondValue(result);
            res = res - second;
            setResultToTextView(res);
        }

        if (operator.equals("x") && f==1)
        {
            double second=secondValue(result);
            if (second==0)
            {
                setResultToTextView(0);
            }
            else
            {
                res=res*second;
                setResultToTextView(res);
            }
        }

        if (operator.equals("/") && f==1)
        {
            double second=secondValue(result);
            if (second==0)
            {
                setResultToTextView(0.0/0);
            }
            else
            {
                res=res/second;
                setResultToTextView(res);
            }

        }

        else
        {
            res=res*1;
            f=1;
        }
    }

    private double secondValue(String result) {
        switch (operator)
        {
            case "+":
            {
                res = res - temp;
            }
            break;
            case "-":
            {
                res=res+temp;
            }
            break;
            case "x":
            {
                if (temp!=0)
                {
                    res=res/temp;
                }
            }
            break;
            case "/":
            {
                if (temp!=0)
                {
                    res=res*temp;
                }
            }

        }
        double number = Double.parseDouble(result);
        temp = number;
        return number;
    }

    private void setResultToTextView(double res) {

        String finalResult = String.valueOf(res);
        int n=finalResult.indexOf("E");

        if (n!=-1)
        {

        }
        else
        {
            if (finalResult.equals("NaN"))
            {
                finalResult="Infinity";
            }
            if (finalResult.substring(finalResult.length() - 2, finalResult.length()).contains(".0")) {
                finalResult = finalResult.substring(0, finalResult.length() - 2);
            }

            else {
                DecimalFormat decimalFormat = new DecimalFormat("#.#######");
                finalResult = decimalFormat.format(Double.parseDouble(finalResult));
            }
        }

        tvResult.setTextSize(30);
        tvResult.setTextColor(Color.LTGRAY);
        tvShow.setTextColor(Color.BLACK);
        tvResult.setText("=" + finalResult);
    }

    private void numberResult() {
        tvShow.setText("");
        tvResult.setText("");
        dotEnable = true;
        showString = "";
        primaryString="";
        flag = 0;
        zero=0;
        zeroPress=true;
        othersNumber=0;
        operator="";
        res=0;
    }
}
