package com.arora.purusharth.fragments;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText t1=null;
    EditText t2=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.t1);
        t2=(EditText)findViewById(R.id.t2);
        Button b1=(Button)findViewById(R.id.b1);
        Button b2=(Button)findViewById(R.id.b2);
        Button b3=(Button)findViewById(R.id.b3);
        Button b4=(Button)findViewById(R.id.b4);
        Button b5=(Button)findViewById(R.id.b5);
        Button bc=(Button)findViewById(R.id.bc);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        bc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());
        int z=0;
        String s="";
        switch(v.getId()) {
            case R.id.b1:
                z=x+y;s="Sum : " + z;
                break;
            case R.id.b2:
                z=x-y;s="Difference : " + z;
                break;
            case R.id.b3:
                z=x*y;s="Product : " + z;
                break;
            case R.id.b4:
                z=x/y;s="Quotient : " + z;
                break;
            case R.id.b5:
                z=x%y; s="Remainder : " + z;
                break;
            case R.id.bc: t1.setText("");
                t2.setText("");
                s="Cleared";
                break;

        }
        Toast.makeText(getApplicationContext(), s , Toast.LENGTH_LONG).show();
    }
}
