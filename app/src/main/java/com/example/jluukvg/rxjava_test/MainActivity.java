package com.example.jluukvg.rxjava_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxTextView;
import com.trello.rxlifecycle2.RxLifecycle;
import com.trello.rxlifecycle2.android.ActivityEvent;
import com.trello.rxlifecycle2.android.RxLifecycleAndroid;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity
        extends RxAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);

        RxView.clicks(button)
              .debounce(500, TimeUnit.MILLISECONDS)
              .compose(RxLifecycleAndroid.bindActivity(lifecycle()))
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(aVoid -> {
            Toast.makeText(MainActivity.this, "It's working", Toast.LENGTH_SHORT).show();
        });

        RxTextView.textChanges(editText)
                  .compose(RxLifecycle.bindUntilEvent(lifecycle(), ActivityEvent.DESTROY))
                  .subscribe(charSequence -> {
            textView.setText(charSequence);
        });
    }
}
