package uz.coder.muslimuz.fargment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DigitalClock;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.DateAdapterFragmentPj;
import uz.coder.muslimuz.databinding.FragmentHomeBinding;
import uz.coder.muslimuz.model.DateModel;

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

    private void loadData() {
        dateModelList = new ArrayList<>();
        dateModelList.add(new DateModel("Hozir", "Bomdod", "04:52"));
        dateModelList.add(new DateModel("Hozir", "Peshin", "12:26"));
        dateModelList.add(new DateModel("Hozir", "Asr", "17:33"));
        dateModelList.add(new DateModel("Hozir", "Shom", "19:51"));
        dateModelList.add(new DateModel("Hozir", "Hufton", "21:52"));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding=null;
    }
}