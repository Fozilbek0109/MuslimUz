package uz.coder.muslimuz.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.ActivityItemBinding;

public class ItemActivity extends AppCompatActivity {
private ActivityItemBinding binding;
    private static final String TAG = "ItemActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String name = getIntent().getStringExtra("name");
        String message = getIntent().getStringExtra("message");
        Log.d(TAG, "onCreate: "+ name + " " + message);
        binding.name.setText(name);
        binding.message.setText(message);


    }
}