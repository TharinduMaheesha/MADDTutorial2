package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMessage = findViewById(R.id.TvMsg2);
        textMessage.setText(R.string.Msg2);

        Log.i("LifeCycle", "OnCreate is Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("LifeCycle", "OnRestart is Called");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle", "OnResume is Called");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifeCycle", "OnPause is Called");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifeCycle", "OnStop is Called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle", "OnDestroy is Called");

    }
}