package com.example.menu;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    Button button2, button10, button3, button4, button5, button6, button7, button8, button, button9, button11, button12, button13, button14, button15, button16, button17, button18;
    Double Var1, Var2;
    android.widget.EditText EditText;
    int i,j;
    TextView signbox;
    double res;
    String s,z;
    boolean add, div, sub, mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        signbox=findViewById(R.id.signbox);
        EditText = findViewById(R.id.Edittext);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "1");
            }
        });
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "2");
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "3");
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "4");
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText.setText(EditText.getText() + "5");
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "6");
            }
        });
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "7");
            }
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "8");
            }
        });
        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "9");
            }
        });

        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + "0");
            }
        });
        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText.setText(EditText.getText() + ".");
            }
        });
        button4 = findViewById(R.id.button4);//mul button
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    z=("X");
                    Var1 = Double.parseDouble(EditText.getText() + "");
                    mul = true;
                    EditText.setText(null);
                    signbox.setText(z);
                }
            }
        });
        button16 = findViewById(R.id.button16);//div button
        button16.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    z=("/");
                    Var1 = Double.parseDouble(EditText.getText() + "");
                    div = true;
                    EditText.setText(null);
                    signbox.setText(z);
                }
            }
        });
        button12 = findViewById(R.id.button12);//sub button
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    z=("-");
                    Var1 = Double.parseDouble(EditText.getText() + "");
                    sub = true;
                    EditText.setText(null);
                    signbox.setText(z);

                }
            }
        });
        button8 = findViewById(R.id.button8);//add button
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (EditText == null) {
                    EditText.setText("");
                } else {
                    z=("+");
                    Var1 = Double.parseDouble(EditText.getText() + "");
                    add = true;
                    EditText.setText(null);
                    signbox.setText(z);
                }
            }
        });
        button15 = findViewById(R.id.button15);//equal to button
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Var2 = Double.parseDouble(EditText.getText() + "");
                switch(z){
                    case ("+"):
                        Var2 = Double.parseDouble(EditText.getText() + "");
                        res = (Var1 + Var2);
                        EditText.setText(res + "");
                        add = false;
                        break;
                    case ("-"):
                        Var2 = Double.parseDouble(EditText.getText() + "");
                        res = (Var1 - Var2);
                        EditText.setText(res + "");
                        sub = false;
                        break;
                    case ("X"):
                        Var2 = Double.parseDouble(EditText.getText() + "");
                        res = (Var1 * Var2);
                        EditText.setText(res + "");
                        mul = false;
                        break;
                    case ("/"):
                        Var2 = Double.parseDouble(EditText.getText() + "");
                        res = (Var1 / Var2);
                        EditText.setText(res + "");
                        div = false;
                        break;
                }


            }

        });
        button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signbox.setText("");
                EditText.setText("");
            }
        });
        button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(EditText.getText().toString().equals(""))) {
                    String value = EditText.getText().toString();
                    if (value.length() > 0) {
                        value = value.substring(0, value.length() - 1).toString();
                        EditText.setText(value);
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case (R.id.item1):

                Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
                Bundle b1=new Bundle();
                b1.putString("Value1", String.valueOf(Var1));
                b1.putString("Value2", String.valueOf(Var2));
                b1.putString("Value3", String.valueOf(res));
                b1.putString("Value4", String.valueOf(z));
                i1.putExtras(b1);
                startActivity(i1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }



}
