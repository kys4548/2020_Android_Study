package com.youngsil.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    ViewerFragment viewerFragment;
    ListFragment listFragment;

    int images[] = {R.drawable.picture, R.drawable.wraith, R.drawable.cloaking };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        viewerFragment = (ViewerFragment) manager.findFragmentById(R.id.viewerFragment);
        listFragment = (ListFragment) manager.findFragmentById(R.id.listFragment);
    }

    public void onImageSelected(int position) {
        viewerFragment.setImage(images[position]);
    }
}
