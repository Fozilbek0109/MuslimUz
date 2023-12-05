package uz.coder.muslimuz.fargment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.FragmentTasbihBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TasbihFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TasbihFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TasbihFragment() {
        // Required empty public constructor
        //
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TasbihFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TasbihFragment newInstance(String param1, String param2) {
        TasbihFragment fragment = new TasbihFragment();
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

    private FragmentTasbihBinding binding;
    private int hisob = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTasbihBinding.inflate(inflater, container, false);
        binding.ottizbTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.ottizbTxt.setTextColor(getResources().getColor(android.R.color.holo_purple));
                binding.yuzTxt.setTextColor(getResources().getColor(android.R.color.white));
                binding.mingTxt.setTextColor(getResources().getColor(android.R.color.white));
                hisob = 0;
                binding.hisobTxt.setText(String.valueOf(hisob));

                binding.buttonFb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        hisob++;
                        if (hisob <= 35) {
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        } else if (hisob == 36){
                            hisob = 0;
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        }
                    }
                });
            }
        });
        binding.yuzTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.yuzTxt.setTextColor(getResources().getColor(android.R.color.holo_purple));
                binding.ottizbTxt.setTextColor(getResources().getColor(android.R.color.white));
                binding.mingTxt.setTextColor(getResources().getColor(android.R.color.white));
                hisob = 0;
                binding.hisobTxt.setText(String.valueOf(hisob));
                binding.buttonFb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        hisob++;
                        if (hisob <= 100) {
                            binding.hisobTxt.setText(String.valueOf(hisob));

                        } else if (hisob == 101){
                            hisob = 0;
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        }
                    }
                });
            }
        });
        binding.mingTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.mingTxt.setTextColor(getResources().getColor(android.R.color.holo_purple));
                binding.yuzTxt.setTextColor(getResources().getColor(android.R.color.white));
                binding.ottizbTxt.setTextColor(getResources().getColor(android.R.color.white));
                hisob = 0;
                binding.hisobTxt.setText(String.valueOf(hisob));
                binding.buttonFb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        hisob++;
                        if (hisob <= 1000) {
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        } else if (hisob == 1001){
                            hisob = 0;
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        }
                    }
                });
            }
        });


        return binding.getRoot();
    }
}