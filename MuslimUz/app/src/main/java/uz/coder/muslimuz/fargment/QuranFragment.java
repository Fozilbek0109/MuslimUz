package uz.coder.muslimuz.fargment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.QuranAdapter;
import uz.coder.muslimuz.adapter.SuraAdapter;
import uz.coder.muslimuz.databinding.FragmentQuranBinding;
import uz.coder.muslimuz.model.QuranModel;
import uz.coder.muslimuz.model.VersesItem;
import uz.coder.muslimuz.ui.SuraActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuranFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuranFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuranFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuranFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuranFragment newInstance(String param1, String param2) {
        QuranFragment fragment = new QuranFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private FragmentQuranBinding binding;
    private List<QuranModel> quranModelList;
    private QuranAdapter adapter;
    private RequestQueue requestQueue;

    private static final String TAG = "QuranFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentQuranBinding.inflate(inflater, container, false);
        loadData();
        requestQueue = Volley.newRequestQueue(requireContext());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("https://cdn.jsdelivr.net/npm/quran-json@3.1.2/dist/quran_en.json", new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                if (response != null) {
                    Gson gson = new Gson();
                    Type type = new TypeToken<List<QuranModel>>() {
                    }.getType();
                    quranModelList = gson.fromJson(response.toString(), type);

                    Log.d(TAG, "onResponse: " + quranModelList);
                    adapter = new QuranAdapter(quranModelList, (quranModel, position) -> {
                        Log.d(TAG, "onResponse1: " + quranModel.getVerses());
                        Intent intent = new Intent(getActivity(), SuraActivity.class);
                        intent.putExtra("id", position);
                        startActivity(intent);

                    });
                    binding.quranRv.setLayoutManager(new LinearLayoutManager(requireContext()));
                    binding.quranRv.setAdapter(adapter);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(jsonArrayRequest);

        return binding.getRoot();
    }

    private void loadData() {
        quranModelList = new ArrayList<>();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}