package uz.coder.muslimuz.fargment;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
import uz.coder.muslimuz.databinding.FragmentDateFargmentBinding;
import uz.coder.muslimuz.model.DateModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DateFargment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DateFargment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private DateModel mParam1;

    public DateFargment() {
        // Required empty public constructor
    }


    public static DateFargment newInstance(DateModel dateModel) {
        DateFargment fragment = new DateFargment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, dateModel);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = (DateModel) getArguments().getSerializable(ARG_PARAM1);
        }
    }

    private FragmentDateFargmentBinding binding;
    private static final String TAG = "DateFargment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDateFargmentBinding.inflate(inflater, container, false);
       binding.hozirTxt.setText(mParam1.getQachon());
       binding.peshin.setText(mParam1.getKunVaqti());
       binding.vaqtTxt.setText(mParam1.getSoat());
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String currentTime = simpleDateFormat.format(calendar.getTime());
        binding.soat.setText(currentTime);
        binding.soat.setSelected(true);
        binding.soat.animate();
        binding.soat.beginBatchEdit();
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}