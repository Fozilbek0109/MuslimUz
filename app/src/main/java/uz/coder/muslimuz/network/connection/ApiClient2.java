package uz.coder.muslimuz.network.connection;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient2 {
private static final String BASE_URL = "https://";
public static Retrofit getRetrofit(

){
    return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
}

}
