package uz.coder.muslimuz.ui;

import android.content.Intent;
import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;

import org.json.JSONArray;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.adapter.QuranAdapter;
import uz.coder.muslimuz.adapter.SuraAdapter;
import uz.coder.muslimuz.databinding.ActivitySuraBinding;


import uz.coder.muslimuz.R;
import uz.coder.muslimuz.model.QuranModel;
import uz.coder.muslimuz.model.VersesItem;

public class SuraActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySuraBinding binding;
    private SuraAdapter adapter;
    private static final String TAG = "SuraActivity";
    private List<QuranModel> quranModelList;
    private RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySuraBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int id = getIntent().getIntExtra("id",0);
        requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("https://cdn.jsdelivr.net/npm/quran-json@3.1.2/dist/quran_en.json", new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                if (response != null) {
                    Gson gson = new Gson();
                    Type type = new TypeToken<List<QuranModel>>() {
                    }.getType();
                    quranModelList = gson.fromJson(response.toString(), type);
                    List<VersesItem> verses = quranModelList.get(id).getVerses();
                    adapter = new SuraAdapter(verses);
                    binding.suraRv.setLayoutManager(new LinearLayoutManager(SuraActivity.this));
                    binding.suraRv.setAdapter(adapter);
                    Log.d(TAG, "onRespon: " + quranModelList);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(jsonArrayRequest);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }
}