package com.project.RivalNutritionApplication.Rivalnutrition;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.project.RivalNutritionApplication.Rivalnutrition.Extra.TypefaceUtil;


/**
 * Created by Saubhagyam on 28/08/2017.
 */

public class MyApplication extends Application {


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }



    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/SEGOEUI.TTF");
        Stetho.initializeWithDefaults(this);
    }
}
