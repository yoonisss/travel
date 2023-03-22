package com.android4.travel2

import com.android4.travel2.model.*
import retrofit2.Call
import retrofit2.http.*

interface INetworkService {

    @GET("travel/trip/list")
    fun doGetTripList(): Call<TripListModel>

    @GET("travel/trip/myList")
    fun doGetMyTripList(@Query("userName")userName:String?): Call<TripListModel>

    @POST("travel/trip/insert")
    fun doInsertTrip(@Body trip: Trip?): Call<Trip>

    @GET("travel/trip/oneTrip")
    fun doGetOneTrip(@Query("title")title:String?): Call<Trip>

    @GET("travel/trip/plusMember")
    fun updateTripMember(@Query("title")title:String?, @Query("member")member:String?): Call<Trip>

    @GET("travel/diaryList")
    fun doGetDiaryList(): Call<DiaryListModel>

    @GET("travel/tripDiaryList")
    fun doGetTripDiaryList(): Call<DiaryListModel>

    @POST("travel/diaryinsert")
    fun insert(@Body trip: Diary):Call<String>

    @POST("travel/diaryListDelete/{dno}")
    fun  delete(@Path("dno")dno:Int):Call<Unit>

    @POST("travel/user/join")
    fun doInsertUser(@Body user: User?): Call<User>

    @POST("login")
    fun login(@Body loginDto: LoginDto): Call<LoginDto>

    @GET("travel/user/oneUser")
    fun doGetOneUser(@Query("username") username: String?): Call<User>
}