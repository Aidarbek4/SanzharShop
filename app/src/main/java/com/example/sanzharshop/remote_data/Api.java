package com.example.sanzharshop.remote_data;

import com.example.sanzharshop.models.ModelM;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api/v1/product/all")
    Call<List<ModelM>> getStoreProducts();
}
