package com.leocardz.android.custom.font.fonts;

import android.content.Context;
import android.graphics.Typeface;

/** SingleTon */
public class Gothic {

	private Context context;
	private static Gothic instance;

	public Gothic(Context context) {
		this.context = context;
	}

	public static Gothic getInstance(Context context) {
		synchronized (Gothic.class) {
			if (instance == null)
				instance = new Gothic(context);
			return instance;
		}
	}

	public Typeface getTypeFace() {
		return Typeface.createFromAsset(context.getResources().getAssets(), "gothic.ttf");
	}
}
