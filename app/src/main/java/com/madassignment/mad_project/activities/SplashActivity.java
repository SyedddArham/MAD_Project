package com.madassignment.mad_project.activities;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.madassignment.mad_project.R;
import com.madassignment.mad_project.modules.User;

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_DURATION = 3000; // 3 seconds
    private ProgressBar progressBar;
    private ImageView imageViewLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

            imageViewLogo = findViewById(R.id.imageView_logo);
            progressBar = findViewById(R.id.progressBar);
            int nightModeFlags = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
            int logoResId;
            if (nightModeFlags == Configuration.UI_MODE_NIGHT_YES) {
                // Dark mode is active
                logoResId = R.drawable.chatsync_high_resolution_logo_white_transparent;
            } else {
                // Light mode is active
                logoResId = R.drawable.chatsync_logo;
            }
            imageViewLogo.setImageResource(logoResId);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Start animation or any other operations here
                    progressBar.setVisibility(View.GONE);
                    // Transition to sign-in activity
                    startActivity(new Intent(SplashActivity.this, SignInActivity.class));
                    finish();
                }
            }, SPLASH_DURATION);


    }

}