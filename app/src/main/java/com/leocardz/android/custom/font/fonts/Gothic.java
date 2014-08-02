package com.leocardz.android.custom.font.fonts;

import android.content.Context;
import android.graphics.Typeface;

/**
 * SingleTon
 */
public class Gothic {

    private Context context;
    private static Gothic instance;
    private static Typeface typeface;

    public Gothic(Context context) {
        this.context = context;
    }

    public static Gothic getInstance(Context context) {
        synchronized (Gothic.class) {
            if (instance == null) {
                instance = new Gothic(context);
                typeface = Typeface.createFromAsset(context.getResources().getAssets(), "gothic.ttf");
            }
            return instance;
        }
    }

    public Typeface getTypeFace() {
        return typeface;
    }
}
