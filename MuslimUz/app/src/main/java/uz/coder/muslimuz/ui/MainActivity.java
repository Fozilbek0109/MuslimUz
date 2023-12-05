package uz.coder.muslimuz.ui;

import static uz.coder.muslimuz.R.id.fragmentContainerView;
import static uz.coder.muslimuz.R.id.homeFragment;
import static uz.coder.muslimuz.R.id.qazoFragment;
import static uz.coder.muslimuz.R.id.quranFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.ActivityMainBinding;
import uz.coder.muslimuz.fargment.HomeFragment;
import uz.coder.muslimuz.model.DateModel;
import uz.coder.muslimuz.model.VersesItem;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomBtn,navController);

    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}