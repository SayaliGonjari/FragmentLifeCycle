package com.project.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentLifeCycle extends Fragment {
    public static FragmentLifeCycle newInstance() {
        return new FragmentLifeCycle();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment Lifecycle","onPause Called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment Lifecycle","onStop Called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment Lifecycle","onDestroyView Called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment Lifecycle","onDestroy Called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment Lifecycle","onDetach Called");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("Fragment Lifecycle","onAttach Called");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d("Fragment Lifecycle","OnCreateView called");
        return inflater.inflate(R.layout.main_fragment, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("Fragment Lifecycle","onViewCreated Called");
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment Lifecycle","onStart Called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment Lifecycle","onResume Called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment Lifecycle","onCreate Called");
    }
}
