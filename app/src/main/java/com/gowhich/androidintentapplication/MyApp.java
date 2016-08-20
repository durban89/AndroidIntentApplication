package com.gowhich.androidintentapplication;

import android.app.Application;

/**
 * Created by durban126 on 16/8/20.
 */
public class MyApp extends Application {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
