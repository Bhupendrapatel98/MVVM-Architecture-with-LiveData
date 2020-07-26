package com.example.mvvm.data.main;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;

import com.example.mvvm.data.model.User;
import com.example.mvvm.data.util.Constant;
import com.example.mvvm.data.util.RetrofitClint;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Reposetory {

        public MutableLiveData<List<User>> requestHolidays(){

                final MutableLiveData<List<User>> mutableLiveData = new MutableLiveData<>();

                RetrofitClint.getRetrofit(Constant.BASE_URL).
                        create(GetRequest.class)
                        .getData("about-us")
                        .enqueue(new Callback<List<User>>() {
                        @Override
                        public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                                mutableLiveData.postValue(response.body());
                                Log.i("hfbjdhdf", "onResponse: "+response);
                                Log.i("hfbjdhdf", "onResponse: "+response.body());
                        }

                        @Override
                        public void onFailure(Call<List<User>> call, Throwable t) {
                                Log.i("dfjhbdfj", "onFailure: "+call.toString());
                        }
                });

                return mutableLiveData;
        }

}
