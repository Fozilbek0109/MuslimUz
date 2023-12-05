package uz.coder.muslimuz.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

import uz.coder.muslimuz.fargment.DateFargment;
import uz.coder.muslimuz.model.DateModel;

public class DateAdapterFragmentPj extends FragmentStatePagerAdapter {
    public DateAdapterFragmentPj(@NonNull FragmentManager fm, List<DateModel> dateModelList) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.dateModelList = dateModelList;
    }

    private List<DateModel> dateModelList;
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return DateFargment.newInstance(dateModelList.get(position));
    }

    @Override
    public int getCount() {
        return dateModelList.size();
    }
}
