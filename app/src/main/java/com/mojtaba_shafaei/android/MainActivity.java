package com.mojtaba_shafaei.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = findViewById(R.id.t1);
        TextView t2 = findViewById(R.id.t2);

        t1.setTypeface(PersianFont.IRANSANS_LIGHT());
        t2.setTypeface(PersianFont.YEKAN_BOLD(this));

    }
}
