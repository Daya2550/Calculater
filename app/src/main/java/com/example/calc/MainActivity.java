package com.example.calc;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    float tem=0;
    int op=0;
    float tem1=0;
    String h="";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsub,badd,bmul,bdiv,bclr,brqe,bd,brem,bdot,bdj;
        TextView e,te;
        e =findViewById(R.id.editTextNumber);
        b0=findViewById(R.id.b0); b8=findViewById(R.id.b8);
        b1=findViewById(R.id.b1); b9=findViewById(R.id.b9);
        b2=findViewById(R.id.b2);  bsub=findViewById(R.id.bsub);
        b3=findViewById(R.id.b3);  badd=findViewById(R.id.badd);
        b4=findViewById(R.id.b4);  bmul=findViewById(R.id.bmul);
        b5=findViewById(R.id.b5);  bdiv=findViewById(R.id.bdiv);
        b6=findViewById(R.id.b6);  bclr=findViewById(R.id.bclr);
        b7=findViewById(R.id.b7);  brqe=findViewById(R.id.beq);
        bd=findViewById(R.id.bdel);  brem=findViewById(R.id.brem);
        bdot=findViewById(R.id.bdot);  bdj=findViewById(R.id.bn);
        te=findViewById(R.id.te);  bdj=findViewById(R.id.bn);

        bd.setBackgroundColor(Color.LTGRAY); // Red background
        bclr.setBackgroundColor(Color.RED);
        brqe.setBackgroundColor(Color.GREEN);
        bdj.setBackgroundColor(Color.CYAN);
        badd.setBackgroundColor(Color.CYAN);
        bsub.setBackgroundColor(Color.CYAN);
        bmul.setBackgroundColor(Color.CYAN);
        bdiv.setBackgroundColor(Color.CYAN);
        brem.setBackgroundColor(Color.CYAN);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+0);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+0);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+1);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+2);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+3);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+4);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+5);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+6);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+7);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+8);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+9);
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+9);
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText(e.getText().toString()+".");
                if(h.equals(te.getText().toString())){
                    te.setText("");
                }
                te.setText(te.getText().toString()+".");
            }
        });
        bdj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                te.setText(h);
            }
        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentText = e.getText().toString();
                if (currentText.length() > 0) {
                    e.setText(currentText.substring(0, currentText.length() - 1));
                }
                String currentText1 = te.getText().toString();
                if (currentText1.length() > 0) {
                    te.setText(currentText1.substring(0, currentText1.length() - 1));
                }
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(e.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Plase Enter the vlaues !", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        tem =Float.parseFloat(e.getText().toString());
                        e.setText("");
                        op=1;
                        te.setText(te.getText().toString()+"+");
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Somthing wentes Wrong !", Toast.LENGTH_SHORT).show();
                }

            }
        });


        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(e.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Plase Enter the vlaues !", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        tem =Float.parseFloat(e.getText().toString());
                        e.setText("");
                        op=2;
                        te.setText(te.getText().toString()+"-");
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Somthing wentes Wrong !", Toast.LENGTH_SHORT).show();
                }

            }
        });



        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(e.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Plase Enter the vlaues !", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        tem =Float.parseFloat(e.getText().toString());
                        e.setText("");
                        op=3;
                        te.setText(te.getText().toString()+"*");
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Somthing wentes Wrong !", Toast.LENGTH_SHORT).show();
                }

            }
        });


        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(e.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Plase Enter the vlaues !", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        tem =Float.parseFloat(e.getText().toString());
                        e.setText("");
                        op=4;
                        te.setText(te.getText().toString()+"/");
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Somthing wentes Wrong !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(e.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Plase Enter the vlaues !", Toast.LENGTH_SHORT).show();
                    } else{
                        tem =Float.parseFloat(e.getText().toString());
                        e.setText("");
                        op=5;
                        te.setText(te.getText().toString()+"%");
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Somthing wentes Wrong !", Toast.LENGTH_SHORT).show();
                }

            }
        });


        brqe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              try {
                  if(e.getText().toString().isEmpty()){
                      Toast.makeText(MainActivity.this, "Enter the value !", Toast.LENGTH_SHORT).show();
                  }
                  else{
                      tem1=Float.parseFloat(e.getText().toString());
                      if(op==0){
                          Toast.makeText(MainActivity.this, "Plase select the opration !", Toast.LENGTH_SHORT).show();
                      }
                      else{
                          switch (op){

                              case 1:
                                  float ans =tem + tem1;
                                  e.setText(ans+"");
                                  te.setText(te.getText().toString()+"="+ans);
                                  h=te.getText().toString();
                                  break;
                              case 2:
                                  float ans1 =tem - tem1;
                                  e.setText(ans1+"");
                                  te.setText(te.getText().toString()+"="+ans1);
                                  h=te.getText().toString();
                                  break;
                              case 3:
                                  float ans2 =tem * tem1;
                                  e.setText(ans2+"");
                                  te.setText(te.getText().toString()+"="+ans2);
                                  h=te.getText().toString();
                                  break;
                              case 4:
                                  float ans3 =tem / tem1;
                                  e.setText(ans3+"");
                                  te.setText(te.getText().toString()+"="+ans3);
                                  h=te.getText().toString();
                                  break;
                              case 5:
                              float ans4=tem % tem1;
                                  e.setText(ans4+"");
                                  te.setText(te.getText().toString()+"="+ans4);
                                  h=te.getText().toString();
                              break;
                          }

                      }

                  }
              }
              catch (Exception e){
                  Toast.makeText(MainActivity.this, "Somthing wentes wrong !", Toast.LENGTH_SHORT).show();
              }

            }
        });


        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setText("");
                te.setText("");
                tem=0;
                tem1=0;
                op=0;
            }
        });

    }

}