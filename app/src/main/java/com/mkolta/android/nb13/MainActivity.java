package com.mkolta.android.nb13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout mRelativeLayout = new RelativeLayout(this);
        Button mRedButton = new Button(this);

        mRelativeLayout.addView(mRedButton);

        setContentView(mRelativeLayout);
    }


}
