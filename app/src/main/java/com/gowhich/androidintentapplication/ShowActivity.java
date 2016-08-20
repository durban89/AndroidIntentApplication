package com.gowhich.androidintentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    private TextView textView;
    private MyApp myApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        textView = (TextView) this.findViewById(R.id.msg);
        myApp = (MyApp) getApplication();
        String name = myApp.getName();
        textView.setText(name);
    }
}
