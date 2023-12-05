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
    private int krug = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTasbihBinding.inflate(inflater, container, false);
        binding.onbirTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.onbirTxt.setTextColor(getResources().getColor(android.R.color.holo_purple));
                binding.otizuchTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.toqsonTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.cheksizTxt.setTextColor(getResources().getColor(android.R.color.black));
                krug = 0;
                binding.krug.setText(String.valueOf(krug));
                hisob = 0;
                binding.hisobTxt.setText(String.valueOf(hisob));

                binding.buttonFb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        hisob++;
                        if (hisob <= 11) {
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        } else if (hisob == 12){
                            hisob = 0;
                            binding.hisobTxt.setText(String.valueOf(hisob));
                            krug++;
                            binding.krug.setText(String.valueOf(krug));
                        }
                    }
                });
            }
        });
        binding.otizuchTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.otizuchTxt.setTextColor(getResources().getColor(android.R.color.holo_purple));
                binding.onbirTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.toqsonTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.cheksizTxt.setTextColor(getResources().getColor(android.R.color.black));
                krug = 0;
                binding.krug.setText(String.valueOf(krug));
                hisob = 0;
                binding.hisobTxt.setText(String.valueOf(hisob));
                binding.buttonFb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        hisob++;
                        if (hisob <= 33) {
                            binding.hisobTxt.setText(String.valueOf(hisob));

                        } else if (hisob == 34){
                            hisob = 0;
                            krug++;
                            binding.krug.setText(String.valueOf(krug));
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        }
                    }
                });
            }
        });
        binding.toqsonTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.toqsonTxt.setTextColor(getResources().getColor(android.R.color.holo_purple));
                binding.onbirTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.otizuchTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.cheksizTxt.setTextColor(getResources().getColor(android.R.color.black));
                krug = 0;
                binding.krug.setText(String.valueOf(krug));
                hisob = 0;
                binding.hisobTxt.setText(String.valueOf(hisob));
                binding.buttonFb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        hisob++;
                        if (hisob <= 99) {
                            binding.hisobTxt.setText(String.valueOf(hisob));
                        } else if (hisob == 100){
                            hisob = 0;
                            binding.hisobTxt.setText(String.valueOf(hisob));
                            krug++;
                            binding.krug.setText(String.valueOf(krug));
                        }
                    }
                });
            }
        });
        binding.cheksizTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.cheksizTxt.setTextColor(getResources().getColor(android.R.color.holo_purple));
                binding.onbirTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.otizuchTxt.setTextColor(getResources().getColor(android.R.color.black));
                binding.toqsonTxt.setTextColor(getResources().getColor(android.R.color.black));
                krug = 1;
                binding.krug.setText(String.valueOf(krug));
                hisob = 0;
                binding.hisobTxt.setText(String.valueOf(hisob));
                binding.buttonFb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        hisob++;
                        if (true) {
                            binding.hisobTxt.setText(String.valueOf(hisob));

                        }
                    }
                });
            }
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding =null;
    }
}