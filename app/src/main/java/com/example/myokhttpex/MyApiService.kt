package com.example.myokhttpex

import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Build
import androidx.annotation.RequiresApi
import com.google.gson.Gson
import okhttp3.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.io.IOException

class MyApiService : IntentService("MyAPIService") {
    override fun onHandleIntent(intent: Intent?) {
//        makeApiCallWithOkHttp()
        makeApiCallWithRetrofitCache()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    val cacheSize: Long = 5 * 1024 * 1024


    private fun makeApiCallWithRetrofitCache() {

        val okHttpClient = OkHttpClient.Builder()
            .cache(Cache(applicationContext.cacheDir, cacheSize))
            .addInterceptor(MyInterceptor())
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.githubbbb.com")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        val gitService = retrofit.create(GitService::class.java)

        gitService.getRepository("dalo-chinkhwangwa-prof")
            .enqueue(object : retrofit2.Callback<GitResult> {
                override fun onResponse(
                    call: retrofit2.Call<GitResult>,
                    response: retrofit2.Response<GitResult>
                ) {
                    sendBroadcast(Intent("from.my.service").also { myIntent ->
                        myIntent.putExtra("my_result", response.body())
                    })
                }

                override fun onFailure(call: retrofit2.Call<GitResult>, t: Throwable) {
                }

            })


    }

    private fun makeApiCallWithOkHttp() {
        val okHttpClient = OkHttpClient.Builder()
            .cache(Cache(applicationContext.cacheDir, cacheSize))
            .addInterceptor(MyInterceptor())
            .build()

        val request = Request.Builder()
            .url("https://api.gitshshub.com/users/dalo-chinkhwangwa-prof")
            .build()

        okHttpClient.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                response.body?.string().let { myContent ->
                    val myResponse = Gson().fromJson(myContent, GitResult::class.java)
                    sendBroadcast(Intent("from.my.service").also { myIntent ->
                        myIntent.putExtra("my_result", myResponse)
                    })
                }
            }

            override fun onFailure(call: Call, e: IOException) {
                //TODO: Error handle
            }

        })
    }

    inner class MyInterceptor : Interceptor {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun intercept(chain: Interceptor.Chain): Response {

            val connectivityManager =
                getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            val builder = chain.request().newBuilder()

            if (!connectivityManager.isDefaultNetworkActive)
                builder.cacheControl(CacheControl.FORCE_CACHE)

            return chain.proceed(builder.build())
        }

    }

    interface GitService {
        @GET("users/{user_name}")
        fun getRepository(@Path("user_name") username: String): retrofit2.Call<GitResult>
    }


}