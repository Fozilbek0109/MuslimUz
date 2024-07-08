package uz.coder.muslimuz.network.connection;

import retrofit2.Call;
import retrofit2.http.GET;
import uz.coder.muslimuz.model.date.NamozVaqti;

public interface ApiServise {

    @GET("api/present/day?region=Urganch")
    public Call<NamozVaqti> getDateSurah();
}
