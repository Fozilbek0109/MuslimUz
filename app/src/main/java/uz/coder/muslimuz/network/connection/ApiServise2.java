package uz.coder.muslimuz.network.connection;

import retrofit2.Call;
import retrofit2.http.GET;
import uz.coder.muslimuz.model.date.NamozVaqti;
import uz.coder.muslimuz.model.surahs.Datum;

public interface ApiServise2 {

    @GET("api.alquran.cloud/v1/surah")
    public Call<Datum> getSurah();
}
