package uz.coder.muslimuz.network.connection;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
private static final String BASE_URL1 = "https://quranapi.pages.dev/";
private static final String BASE_URL = "https://islomapi.uz/";
public static Retrofit getRetrofit(

){
    return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
}

}
