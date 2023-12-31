package com.devapps.githubuser.data.retrofit

import com.devapps.githubuser.data.response.DetailUserResponse
import com.devapps.githubuser.data.response.ItemsItem
import com.devapps.githubuser.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("search/users")
    @Headers("Authorization: token //your token here//")
    fun searchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token //your token here//")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token //your token here//")
    fun getUserFollowers(
        @Path("username") username: String
    ): Call<List<ItemsItem>>

    @GET("users/{username}/following")
    @Headers("Authorization: token //your token here//")
    fun getUserFollowing(
        @Path("username") username: String
    ): Call<List<ItemsItem>>

}
