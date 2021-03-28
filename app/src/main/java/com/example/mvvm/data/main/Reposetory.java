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
        
        //MutableLiveData is commonly used since it provides the postValue(), setValue() methods publicly, something that LiveData class doesn’t provide.
        //LiveData has no public method to modify its data.
        //You can't update its value like getUser().setValue(userObject) or getUser().postValue(userObject)
        //So when you don't want your data to be modified use LiveData If you want to modify your data later use MutableLiveData
        //LiveData is that the data will not be updated when your View is in the background and when the view will come in the foreground, then it will get the updated data only.


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
