package ru.android_group.dmtou.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView result;
    private int X1,X2 = 0;
    private double Y1,Y2 = 0.0;
    private byte FlagYX = 1;           //1 - по умолчанию, целые числа, 0 - дробные
    private byte Operation = 0;        //0 - сложение; 1 - разность;  2 - умножение; 3 - деление;
    public Calculation calc = new Calculation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result_view);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    result.append("1");
            }

        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("2");
            }

        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("3");
            }

        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("4");
            }

        });

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("5");
            }

        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("6");
            }

        });

        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("7");
            }

        });

        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("8");
            }

        });

        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("9");
            }

        });

        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append("0");
            }

        });

        findViewById(R.id.buttonDot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(".");
                FlagYX = 0;
            }

        });

        findViewById(R.id.buttonDiv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FlagYX = 0;
                Operation = 3;
                Y1 = Double.parseDouble(result.getText().toString());
                result.setText("");
            }

        });

        findViewById(R.id.buttonMult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X1 = Integer.parseInt(result.getText().toString());
                Y1 = Double.parseDouble(result.getText().toString());
                Operation = 2;
                result.setText("");
            }

        });

        findViewById(R.id.buttonMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X1 = Integer.parseInt(result.getText().toString());
                Y1 = Double.parseDouble(result.getText().toString());
                Operation = 1;
                result.setText("");
            }

        });

        findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                X1 = Integer.parseInt(result.getText().toString());
                Y1 = Double.parseDouble(result.getText().toString());
                Operation = 0;
                result.setText("");
            }

        });

        findViewById(R.id.buttonEq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (FlagYX == 1) {
                    X2 = Integer.parseInt(result.getText().toString());
                    if (Operation ==1) X2= -X2;
                    if (Operation <=1) result.setText(String.valueOf(calc.calcSumma(X1,X2)));
                        else result.setText(String.valueOf(calc.calcMult(X1,X2)));
                }
                else{
                    Y2 = Double.parseDouble(result.getText().toString());
                    if (Operation ==1) Y2= -Y2; if (Operation == 3) Y2= 1/Y2;
                    if (Operation <=1) result.setText(String.valueOf(calc.calcSumma(Y1,Y2)));
                        else result.setText(String.valueOf(calc.calcMult(Y1,Y2)));
                }
                FlagYX = 1;
            }
        });

        findViewById(R.id.buttonDel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText().subSequence(0,result.getText().length()-1));
            }

        });

        findViewById(R.id.buttonC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }

        });
    }

    @Override
    public void onClick(View v) {
        result.setText("");
    }
}
