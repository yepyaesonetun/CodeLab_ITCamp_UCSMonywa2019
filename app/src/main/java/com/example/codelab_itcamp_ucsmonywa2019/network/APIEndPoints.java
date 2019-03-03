package com.example.codelab_itcamp_ucsmonywa2019.network;

import com.example.codelab_itcamp_ucsmonywa2019.data.vo.CountryVO;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIEndPoints {

    @GET("/rest/v2/all/")
    Call<ArrayList<CountryVO>> getCountries(@Query("fields") String field);
}
