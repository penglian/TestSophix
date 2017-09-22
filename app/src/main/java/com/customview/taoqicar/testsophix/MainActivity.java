package com.customview.taoqicar.testsophix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiView();
    }

    private void intiView() {
        Toast.makeText(MainActivity.this,"hello sophix22222222222222222",Toast.LENGTH_SHORT).show();
    }
}
