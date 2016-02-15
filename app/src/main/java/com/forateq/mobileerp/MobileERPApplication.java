package com.forateq.mobileerp;

import android.app.Application;
import android.view.View;

import com.activeandroid.ActiveAndroid;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Vallejos Family on 2/2/2016.
 */
public class MobileERPApplication extends Application {

    public static Deque<View> viewDeque = new ArrayDeque<>();

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
