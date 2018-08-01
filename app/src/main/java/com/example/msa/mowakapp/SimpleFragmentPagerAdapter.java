package com.example.msa.mowakapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{
    private String tabTitles[] = new String[]{"Numbers","Family","Colors","Phrases"};
    private Context mcontext;
    public SimpleFragmentPagerAdapter(Context context,FragmentManager fragmentManager){
        super(fragmentManager);
        this.mcontext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new NumbersFragment();
        }
        else if(position==1){
            return new FamilyFragment();
        }
        else if(position==2){
            return new ColorsFragment();
        }
        else
            return new PhrasesFragment();

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
