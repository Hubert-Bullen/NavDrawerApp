package be.vdab.navdrawerapp;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentOne extends Fragment {

    private String text;

    public FragmentOne() {
    }

    public static FragmentOne createNewFragmentOne(String title) {
        FragmentOne frag = new FragmentOne();
        frag.setText(title);
        return frag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView1);
        textView.setText(this.text);


        return view;

    }
}