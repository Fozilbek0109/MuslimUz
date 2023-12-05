package uz.coder.muslimuz.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import uz.coder.muslimuz.databinding.ActivityMainBinding;
import uz.coder.muslimuz.model.DateModel;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();

    }
}