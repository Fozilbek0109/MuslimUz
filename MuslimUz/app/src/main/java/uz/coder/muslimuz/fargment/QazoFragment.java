package uz.coder.muslimuz.fargment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.FragmentQazoBinding;
import uz.coder.muslimuz.databinding.FragmentQuranBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QazoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QazoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QazoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QazoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QazoFragment newInstance(String param1, String param2) {
        QazoFragment fragment = new QazoFragment();
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
private FragmentQazoBinding binding;
    private int countB = 0;
    private int countP = 0;
    private int countA = 0;
    private int countS = 0;
    private int countX = 0;
    private int countV = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentQazoBinding.inflate(inflater, container, false);
        binding.fbBomdodP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countB++;
                binding.bomdodTxt.setText(String.valueOf(countB));
            }
        });
        binding.fbBomdodM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countB > 0) {
                    countB--;
                    binding.bomdodTxt.setText(String.valueOf(countB));
                }
            }
        });
        binding.fbPeshinP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countP++;
                binding.peshinTxt.setText(String.valueOf(countP));
            }
        });
        binding.fbPeshinM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countP > 0) {
                    countP--;
                    binding.peshinTxt.setText(String.valueOf(countP));
                }
            }
        });
        binding.fbAsrP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countA++;
                binding.asrTxt.setText(String.valueOf(countA));
            }
        });
        binding.fbAsrM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countA > 0) {
                    countA--;
                    binding.asrTxt.setText(String.valueOf(countA));
                }
            }
        });
        binding.fbShomP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countS++;
                binding.shomTxt.setText(String.valueOf(countS));
            }
        });
        binding.fbShomM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countS > 0) {
                    countS--;
                    binding.shomTxt.setText(String.valueOf(countS));
                }
            }
        });
        binding.fbHuftonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countX++;
                binding.huftonTxt.setText(String.valueOf(countX));
            }
        });
        binding.fbHuftonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countX > 0) {
                    countX--;
                    binding.huftonTxt.setText(String.valueOf(countX));
                }
            }
        });
        binding.fbVitrP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countV++;
                binding.vitrTxt.setText(String.valueOf(countV));
            }
        });
        binding.fbVitrM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countV > 0) {
                    countV--;
                    binding.vitrTxt.setText(String.valueOf(countV));
                }
            }
        });
        return binding.getRoot();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}