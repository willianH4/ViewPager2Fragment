package com.willianhdz.sliderviewpagerfragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

//    agregamos el arreglo para la canridad de fragments que pondremos
    ArrayList<Fragment> arrayList = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
// en este metodo se agregan la cantidad de fragmentos
//    que se iran agregando al viewpager
    public Fragment createFragment(int position) {
        Fragment fragment = new Fragment();
        switch (position){
            case 0:
                fragment = new HomeFragment();
                break;
            case 1:
                fragment = new AccountFragment();
                break;
            case 2:
                fragment = new SettingFragment();
                break;
        }
//       return arrayList.get(position);
        return fragment;
    }

    @Override
    public int getItemCount() {
//        return arrayList.size();
        return 3;
    }

    public void addFragment(Fragment fragment){
        arrayList.add(fragment);
    }
}
