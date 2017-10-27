package com.arora.purusharth.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link fragment1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment1 extends Fragment implements View.OnClickListener{

    EditText t1=null;
    EditText t2=null;

    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment1, container, false);
        t1=(EditText)v.findViewById(R.id.t1);
        t2=(EditText)v.findViewById(R.id.t2);
        Button b1=(Button)v.findViewById(R.id.b1);
        Button b2=(Button)v.findViewById(R.id.b2);
        Button b3=(Button)v.findViewById(R.id.b3);
        Button b4=(Button)v.findViewById(R.id.b4);
        Button b5=(Button)v.findViewById(R.id.b5);
        Button bc=(Button)v.findViewById(R.id.bc);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        bc.setOnClickListener(this);
        return v;
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
        //Toast.makeText(getApplicationContext(), s , Toast.LENGTH_LONG).show();
        FragmentManager fm=getActivity().getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();

        fragment2 blankF2=new fragment2();

        Bundle b=new Bundle();
        b.putString("data",s);
        blankF2.setArguments(b);

        ft.replace(R.id.top,blankF2);
        ft.commit();

    }
}
