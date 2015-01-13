package com.leocardz.android.custom.font.fonts;

import android.content.Context;
import android.graphics.Typeface;

/** SingleTon */
public class OpenSans {

    private static OpenSans instance;
    private static Typeface typeface;

    public static OpenSans getInstance(Context context) {
        synchronized (OpenSans.class) {
            if (instance == null) {
                instance = new OpenSans();
                typeface = Typeface.createFromAsset(context.getResources().getAssets(), "open_sans.ttf");
            }
            return instance;
        }
    }

    public Typeface getTypeFace() {
        return typeface;
    }
}
