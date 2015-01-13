package com.leocardz.android.custom.font.fonts;

import android.content.Context;
import android.graphics.Typeface;

/**
 * SingleTon
 */
public class Gothic {

    private static Gothic instance;
    private static Typeface typeface;

    public static Gothic getInstance(Context context) {
        synchronized (Gothic.class) {
            if (instance == null) {
                instance = new Gothic();
                typeface = Typeface.createFromAsset(context.getResources().getAssets(), "gothic.ttf");
            }
            return instance;
        }
    }

    public Typeface getTypeFace() {
        return typeface;
    }
}
