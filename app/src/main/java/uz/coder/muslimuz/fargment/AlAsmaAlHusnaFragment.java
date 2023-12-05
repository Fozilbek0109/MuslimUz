package uz.coder.muslimuz.fargment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.AlAsmaUlHusnaAdapter;
import uz.coder.muslimuz.databinding.FragmentAlAsmaAlHusnaBinding;
import uz.coder.muslimuz.model.AlAsmaAlHusnaModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlAsmaAlHusnaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlAsmaAlHusnaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AlAsmaAlHusnaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlAsmaAlHusnaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlAsmaAlHusnaFragment newInstance(String param1, String param2) {
        AlAsmaAlHusnaFragment fragment = new AlAsmaAlHusnaFragment();
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
    private FragmentAlAsmaAlHusnaBinding binding;
    private List<AlAsmaAlHusnaModel> alAsmaAlHusnaModelList;
    private AlAsmaUlHusnaAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAlAsmaAlHusnaBinding.inflate(inflater,container,false);
        loadData();
        adapter = new AlAsmaUlHusnaAdapter(alAsmaAlHusnaModelList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.rvAlAsmaAlHusna.setLayoutManager(layoutManager);
        binding.rvAlAsmaAlHusna.setAdapter(adapter);
        return binding.getRoot();
    }

    private void loadData() {
        alAsmaAlHusnaModelList = new ArrayList<>();
        for (int i = 1; i <=99 ; i++) {
            alAsmaAlHusnaModelList.add(new AlAsmaAlHusnaModel(i,"Ar-Rahmon","O'ta mehribon"));
        }
    }
}