package com.example.codelab_itcamp_ucsmonywa2019.network;

import com.example.codelab_itcamp_ucsmonywa2019.data.vo.CountryVO;
import com.example.codelab_itcamp_ucsmonywa2019.utils.AppConstants;
import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkInstance implements NetworkRequests {
    private static NetworkInstance sObjInstance;
    private APIEndPoints mApi;

    public static NetworkInstance getInstance() {
        if (sObjInstance == null) {
            sObjInstance = new NetworkInstance();
        }
        return sObjInstance;
    }

    public NetworkInstance(APIEndPoints mApi) {
        this.mApi = mApi;
    }

    private NetworkInstance() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(okHttpClient)
                .build();

        mApi = retrofit.create(APIEndPoints.class);
    }

    @Override
    public void loadCountries() {
        // implement real network call requests here
    }
}
