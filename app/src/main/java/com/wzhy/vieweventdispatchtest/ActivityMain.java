package com.wzhy.vieweventdispatchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.wzhy.vieweventdispatchtest.viewevent.EventButton;

public class ActivityMain extends AppCompatActivity {

    private static final String TAG = "ActivityMain";
    private EventButton mEventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEventButton = (EventButton) findViewById(R.id.event_btn);
        mEventButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.e(TAG, "OnTouchListener: ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e(TAG, "OnTouchListener: ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e(TAG, "OnTouchListener: ACTION_UP");
                        break;
                }

                return false;
            }
        });

    }
}
