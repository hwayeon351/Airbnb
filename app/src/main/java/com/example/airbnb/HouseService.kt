package com.example.airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/69a88557-560d-4285-bb16-3582299033a0")
    fun getHouseList(): Call<HouseDto>
}