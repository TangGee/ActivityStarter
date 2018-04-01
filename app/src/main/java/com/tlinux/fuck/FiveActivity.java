package com.tlinux.fuck;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by tlinux on 18-4-1.
 */

public class FiveActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new StartController(findViewById(R.id.root),this);
        setTitle("singelInstance.fuck.ThridActivity");
    }
}
