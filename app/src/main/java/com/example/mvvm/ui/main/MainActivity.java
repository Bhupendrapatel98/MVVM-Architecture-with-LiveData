package com.example.mvvm.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.mvvm.R;
import com.example.mvvm.data.model.User;

import java.util.List;

//The 4 steps of MVVM
// 1. Create Model (POJO)
// 2. Create Repository (fetch data from API or DB)
// 3. Create ViewModel (extend ViewModel, get liveData from Repository)
// 4. Create Activity (observe ViewModel & display data)

public class MainActivity extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModel viewModel = new MainViewModel();

        viewModel.getHolidays().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> currencyPojos) {

              String description =  currencyPojos.get(0).getContent().getRendered();

                Log.i("fkjdnfjfd", "onChanged: "+description);
            }
        });

    }

}
