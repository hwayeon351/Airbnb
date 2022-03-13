package com.example.airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/240eb6b9-9d63-440e-91e6-dfc773f1e6f1")
    fun getHouseList(): Call<HouseDto>
}