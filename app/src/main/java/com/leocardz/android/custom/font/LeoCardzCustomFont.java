package com.leocardz.android.custom.font;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.leocardz.android.custom.font.fonts.Gothic;
import com.leocardz.android.custom.font.fonts.OpenSans;

public class LeoCardzCustomFont extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.custom_font);

        /** Set custom font programmatically */
        TextView programmaticallyTextView = (TextView) findViewById(R.id.programmatically_text_view);
        programmaticallyTextView.setTypeface(Gothic.getInstance(this).getTypeFace());

        /** Set custom font programmatically */
        Button programmaticallyButton = (Button) findViewById(R.id.programmatically_button);
        programmaticallyButton.setTypeface(OpenSans.getInstance(this).getTypeFace());
    }

}
