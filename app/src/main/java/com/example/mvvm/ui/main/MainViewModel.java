package com.example.mvvm.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.data.main.Reposetory;
import com.example.mvvm.data.model.User;

import java.util.List;

public class MainViewModel extends ViewModel {

    private Reposetory user;
    private MutableLiveData<List<User>> mutableLiveData;

    public MainViewModel(){
        user = new Reposetory();
    }

    public LiveData<List<User>> getHolidays() {
        if(mutableLiveData==null){
            mutableLiveData = user.requestHolidays();
        }
        return mutableLiveData;
    }


}
