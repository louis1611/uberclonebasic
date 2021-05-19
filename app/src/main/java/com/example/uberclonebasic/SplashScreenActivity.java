package com.example.uberclonebasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;
import java.util.function.ToLongFunction;

import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        delaySplashScreen();
    }

    private void delaySplashScreen() {
        Completable.timer(5, TimeUnit.SECONDS,
                AndroidSchedulers.mainThread())
                .subscribe(() -> Toast.makeText(SplashScreenActivity.this,"Splash Screen Done",Toast.LENGTH_SHORT).show());
    }
}