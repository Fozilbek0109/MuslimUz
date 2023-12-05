package uz.coder.muslimuz.fargment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import uz.coder.muslimuz.adapter.DuolarAdapterRv;
import uz.coder.muslimuz.databinding.FragmentDuolarBinding;
import uz.coder.muslimuz.model.DuolarModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DuolarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DuolarFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String TAG = "DuolarFragment";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DuolarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DuolarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DuolarFragment newInstance(String param1, String param2) {
        DuolarFragment fragment = new DuolarFragment();
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
    private FragmentDuolarBinding binding;
    private DuolarAdapterRv adapterDuolar;
    private List<DuolarModel> duolarModelList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDuolarBinding.inflate(inflater,container,false);
        loadData();
        adapterDuolar = new DuolarAdapterRv(duolarModelList);
        binding.rv.setAdapter(adapterDuolar);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        binding.rv.setLayoutManager(layoutManager);

        return binding.getRoot();
    }

    private void loadData() {
        duolarModelList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {

            duolarModelList.add(new DuolarModel("effew","wefcwfe","ewffcw"));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        getParentFragmentManager().popBackStack();
        Log.d(TAG, "onDestroyView: ");
        binding=null;
    }
}