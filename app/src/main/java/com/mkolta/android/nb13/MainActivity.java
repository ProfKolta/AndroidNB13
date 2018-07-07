package com.mkolta.android.nb13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //layout
        RelativeLayout mRelativeLayout = new RelativeLayout(this);
        mRelativeLayout.setBackgroundColor(Color.GREEN);

        //button
        Button mRedButton = new Button(this);
        mRedButton.setText("Click here");
        mRedButton.setBackgroundColor(Color.RED);
        mRedButton.setId(1);

        //EditText
        EditText mUserName = new EditText(this);
        mUserName.setId(2);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams userNameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        userNameDetails.addRule(RelativeLayout.ABOVE, mRedButton.getId());
        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userNameDetails.setMargins(0, 0, 0, 50);

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //convert dp value to pixel value
        Resources mResource =getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, mResource.getDisplayMetrics());
        mUserName.setWidth(px);


        /*mRelativeLayout.addView(mRedButton, buttonDetails);
        mRelativeLayout.addView(mUserName, userNameDetails);

        setContentView(mRelativeLayout);*/


    }


}
