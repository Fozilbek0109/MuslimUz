package uz.coder.muslimuz.fargment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.DateAdapterFragmentPj;
import uz.coder.muslimuz.databinding.FragmentHomeBinding;
import uz.coder.muslimuz.model.DateModel;
import uz.coder.muslimuz.model.date.NamozVaqti;
import uz.coder.muslimuz.model.date.Times;
import uz.coder.muslimuz.network.connection.ApiClient;
import uz.coder.muslimuz.network.connection.ApiClient2;
import uz.coder.muslimuz.network.connection.ApiServise;
import uz.coder.muslimuz.network.connection.ApiServise2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private static final String TAG = "HomeFragment";

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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

        loadData();
    }

    private DateAdapterFragmentPj adapterFragment;
    private FragmentHomeBinding binding;
    private List<DateModel> dateModelList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        Log.d(TAG, "onCreateView: ");
        adapterFragment = new DateAdapterFragmentPj(getChildFragmentManager(), dateModelList);
        binding.vp.setAdapter(adapterFragment);
        binding.duoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_homeFragment_to_duolarFragment);
            }
        });
        binding.tasbihCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.tasbihFragment);
            }
        });
        binding.husnaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(binding.getRoot()).navigate(R.id.alAsmaAlHusnaFragment);
            }
        });
        return binding.getRoot();

    }

    private List<DateModel> loadData() {
        dateModelList = new ArrayList<>();
        ApiServise apiServise = ApiClient.getRetrofit().create(ApiServise.class);
        apiServise.getDateSurah().enqueue(new Callback<NamozVaqti>() {
            @Override
            public void onResponse(Call<NamozVaqti> call, Response<NamozVaqti> response) {
                NamozVaqti body = response.body();
                Times times = body.getTimes();

                dateModelList.add(new DateModel("Quyosh",body.getDate(),times.getQuyosh().toString(),`times))
            }

            @Override
            public void onFailure(Call<NamozVaqti> call, Throwable t) {

            }
        });



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();


        binding=null;
    }
}