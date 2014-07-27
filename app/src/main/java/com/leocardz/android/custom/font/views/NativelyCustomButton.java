package com.leocardz.android.custom.font.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.leocardz.android.custom.font.fonts.Gothic;


public class NativelyCustomButton extends Button {

	public NativelyCustomButton(Context context) {
		super(context);
		setTypeface(Gothic.getInstance(context).getTypeFace());
	}

	public NativelyCustomButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		setTypeface(Gothic.getInstance(context).getTypeFace());
	}

	public NativelyCustomButton(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		setTypeface(Gothic.getInstance(context).getTypeFace());
	}

}
