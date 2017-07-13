package com.example.jluukvg.rxjava_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

        import java.util.concurrent.TimeUnit;

        import io.reactivex.Observable;
        import io.reactivex.ObservableEmitter;
        import io.reactivex.ObservableOnSubscribe;
        import io.reactivex.Observer;
        import io.reactivex.android.schedulers.AndroidSchedulers;
        import io.reactivex.disposables.Disposable;
        import io.reactivex.schedulers.Schedulers;

public class TryingOut {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {

            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                //Use onNext to emit each item in the stream//
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onNext(4);

                //Once the Observable has emitted all items in the sequence, call onComplete//
                e.onComplete();
            }
        });

        Observable<Long> infiniteObservable = Observable.interval(1, TimeUnit.SECONDS);

        Observable<Integer> rangeObservable = Observable.range(0, 20);

        Observable<String> emptyObservable = Observable.empty();

        Observable.just(1, 2, 3)
                  .subscribeOn(Schedulers.newThread())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribe(observer);

    }

    Observer<Integer> observer = new Observer<Integer>() {

        public static final String TAG = "RxJavaTest";

        @Override
        public void onSubscribe(Disposable d) {
            Log.d(TAG, "onSubscribe" + Thread.currentThread().getName());
        }

        @Override
        public void onNext(Integer value) {
            Log.d(TAG, "onNext: " + value + Thread.currentThread().getName());
        }

        @Override
        public void onError(Throwable e) {
            Log.d(TAG, "onError: ");
        }

        @Override
        public void onComplete() {
            Log.d(TAG, "onComplete: All Done!" + Thread.currentThread().getName());
        }
    };*/
}
