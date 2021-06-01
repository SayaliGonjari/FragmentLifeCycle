package com.project.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            //getsupportfragment mening is initiate the main fragment and continue with th childfragment actvitiiy
            getSupportFragmentManager().beginTransaction().replace(R.id.rl_Container1, FragmentLifeCycle.newInstance())
                    .commitNow();
        }
    }
}