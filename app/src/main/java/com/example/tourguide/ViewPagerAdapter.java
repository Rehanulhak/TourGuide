package com.example.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 5;
    private String tabTitles[] = new String[] { "Home", "Masjid", "Flag", "Golf Course", "Cine Gold" };
    private Context context;

    public ViewPagerAdapter(@NonNull FragmentManager fm, Context context) {

        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
         Fragment fragment = null;

        ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("A Turkish designed elegant " +
                "congregational Masjid", "Proof of beautiful Turkish " +
                "architecture standing as a beacon of elegance" +
                " in a city designed by the Turks themselves and a center of faith " +
                "and hospitality.", "masjid"));
        locations.add(new Location("This is the highest flag in " +
                "Pakistan", "It is located at the highest point of Garden " +
                "City, which is founded on the edge of a valley itself," +
                " So it sits atop of the valley overlooking the golf course and the " +
                "rest of Garden City.", "flag"));
        locations.add(new Location("Currently under expansion, this " +
                "9 hole course will soon become 18.", "A golf course that " +
                "is open 24 hours a day" +
                ", yes that's true, it features a flood light system that keeps one " +
                "playing throughout the night.", "golfcourse"));
        locations.add(new Location("A premium cinema with a gold " +
                "bar/restaurant", "Although open for everyone, this cinema" +
                " features a best in class sound system" +
                " and visual performance. Along with this it features very low rates " +
                "and access to a VIP lounge with a premium membership.", "cinegold"));

         switch(position){
             case 0:
                 fragment = Home.newInstance(locations);
                 break;
             case 1:
                 fragment = Masjid.newInstance(locations.get(0));
                 break;
             case 2:
                 fragment = Flag.newInstance(locations.get(1));
                 break;
             case 3:
                 fragment = Golfcourse.newInstance(locations.get(2));
                 break;
             case 4:
                 fragment = Cinegold.newInstance(locations.get(3));
                 break;
         }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
