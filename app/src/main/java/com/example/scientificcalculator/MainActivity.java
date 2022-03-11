package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bequal, bdot, bplus, bmin, bdiv, bmul, bsin, bcos, btan, bac, bc, bb1, bb2, blog;
    TextView tvmain, tvsec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bequal=findViewById(R.id.bequal);
        bdot=findViewById(R.id.bdot);
        bplus=findViewById(R.id.bplus);
        bmin=findViewById(R.id.bmin);
        bdiv=findViewById(R.id.bdiv);
        bmul=findViewById(R.id.bmul);
        bsin=findViewById(R.id.bsin);
        bcos=findViewById(R.id.bcos);
        btan=findViewById(R.id.btan);
        bac=findViewById(R.id.bac);
        bc=findViewById(R.id.bc);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        blog=findViewById(R.id.blog);

        tvmain=findViewById(R.id.tvmain);
        tvsec=findViewById(R.id.tvsec);

        //onClick Listener
        b0.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"0");
        });
        b1.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"1");
        });
        b2.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"2");
        });
        b3.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"3");
        });
        b4.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"4");
        });
        b5.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"5");
        });
        b6.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"6");
        });
        b7.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"7");
        });
        b8.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"8");
        });
        b9.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"9");
        });
        bdot.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+".");
        });
        bac.setOnClickListener(view ->  {
            tvmain.setText("");
            tvsec.setText("");
        });
        bc.setOnClickListener(view ->  {
            String val=tvmain.getText().toString();
            val=val.substring(0, val.length()-1);
            tvmain.setText(val);
        });
        bplus.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"+");
        });
        bmin.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"-");
        });
        bmul.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"*");
        });
        bdiv.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"/");
        });
        bb1.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"(");
        });
        bb2.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+")");
        });
        bsin.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"sin");
        });
        bcos.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"cos");
        });
        btan.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"tan");
        });
        blog.setOnClickListener(view ->  {
            tvmain.setText(tvmain.getText()+"log");
        });

        bequal.setOnClickListener(view -> {
            String exp=tvmain.getText().toString();
            exp=exp.replaceAll("x", "*");

            Expression express=new Expression(exp);
            String result=String.valueOf(express.calculate());

            tvsec.setText(tvmain.getText());
            tvmain.setText(result);

        });
    }
}