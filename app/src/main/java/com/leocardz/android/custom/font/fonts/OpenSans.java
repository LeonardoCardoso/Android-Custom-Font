package com.leocardz.android.custom.font.fonts;

import android.content.Context;
import android.graphics.Typeface;

/** SingleTon */
public class OpenSans {

    private Context context;
    private static OpenSans instance;
    private static Typeface typeface;

    public OpenSans(Context context) {
        this.context = context;
    }

    public static OpenSans getInstance(Context context) {
        synchronized (Gothic.class) {
            if (instance == null) {
                instance = new OpenSans(context);
                typeface = Typeface.createFromAsset(context.getResources().getAssets(), "open_sans.ttf");
            }
            return instance;
        }
    }

    public Typeface getTypeFace() {
        return typeface;
    }
}
