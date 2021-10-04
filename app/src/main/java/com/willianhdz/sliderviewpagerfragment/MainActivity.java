package com.willianhdz.sliderviewpagerfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager2);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());

//        addFragment
        viewPagerAdapter .addFragment(new HomeFragment()); //Posicion 0
        viewPagerAdapter .addFragment(new AccountFragment()); //Posicion 1
        viewPagerAdapter .addFragment(new SettingFragment()); //Posicion 2

        viewPager2.setAdapter(viewPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabLayoutMain);

// arreglo para iconos
        int[] icono = new int[]{
              R.drawable.ic_launcher_background,
              R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
        };

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setIcon(icono[position])).attach();

//        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
//            @Override
//            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
//                switch (position){
//                    case 0:
//                        tab.setText("Home");
//                        break;
//                    case 1:
//                        tab.setText("Accounnt");
//                        break;
//                    case 2:
//                        tab.setText("Setting");
//                        break;
//                }
//            }
//        }).attach();


    }
}