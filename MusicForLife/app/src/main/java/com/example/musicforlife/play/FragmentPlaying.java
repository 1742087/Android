package com.example.musicforlife.play;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.musicforlife.R;

public class FragmentPlaying  extends Fragment {
    public  FragmentPlaying(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup viewGroup= (ViewGroup)inflater.inflate(R.layout.fragment_playing, container, false);
        return viewGroup;
    }
}
