package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnZero;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnPercent;
    Button btnDot;
    Button btnEqual;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivision;
    Button btnC;
    ImageButton btnDel;
    TextView textInput;
    TextView textOutput;
    String text;
    String result;
    boolean dot_inserted;
    boolean operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = "";
        result = "";
        dot_inserted = false;
        operator_inserted = false;

        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnC = (Button) findViewById(R.id.btnC);
        btnDel = (ImageButton) findViewById(R.id.btnDel);
        textInput = (TextView) findViewById(R.id.textInput);
        textOutput = (TextView) findViewById(R.id.textOutput);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"0");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"2");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+"9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                textInput.setText(text+".");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " % ";
                        operator_inserted = true;
                    }
                }
                textInput.setText(text);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " + ";
                        operator_inserted = true;
                    }
                }
                textInput.setText(text);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " - ";
                        operator_inserted = true;
                    }
                }
                textInput.setText(text);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " * ";
                        operator_inserted = true;
                    }
                }
                textInput.setText(text);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                dot_inserted = false;

                if (!text.isEmpty()) {
                    if(text.substring(text.length()-1, text.length()).equals(".")) {
                        backspace();
                    }

                    if (operator_inserted == false) {
                        text = text + " / ";
                        operator_inserted = true;
                    }
                }
                textInput.setText(text);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textInput.setText("");
                textOutput.setText("");
                dot_inserted = false;
                operator_inserted = false;
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                backspace();
                textInput.setText(text);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                if (operator_inserted == true && !text.substring(text.length()-1, text.length()).equals(" ")) {
                    String [] tokens = text.split(" ");
                    switch (tokens[1].charAt(0)) {
                        case '+' :
                            result = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;

                        case '-' :
                            result = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;

                        case '*' :
                            result = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;

                        case '/' :
                            result = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;

                        case '%' :
                            result = Double.toString(Double.parseDouble(tokens[0]) % Double.parseDouble(tokens[2]));
                            break;
                    }
                    textOutput.setText(result);
                }
               }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = textInput.getText().toString();
                if (text.isEmpty()){
                    text = "0.";
                    dot_inserted = true;
                }

                if (dot_inserted == false) {
                    text = text + ".";
                    dot_inserted = true;
                }

                textInput.setText(text);
            }
        });
    }

    public void threeOnClick(View view) {
        text = textInput.getText().toString();
        textInput.setText(text+"3");
    }

    public void backspace(){
        if (!text.isEmpty()) {
            if (text.substring(text.length()-1, text.length()).equals(".")) {
                dot_inserted = false;
            }

            if (text.substring(text.length()-1, text.length()).equals(" ")) {
                text = text.substring(0, text.length()-3);
                operator_inserted = false;
            }else {
                text = text.substring(0, text.length()-1);
            }
        }
    }
}