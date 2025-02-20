package com.movieapi.movie.fragment.movies;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerMoviesAdapter extends FragmentPagerAdapter {
    Context context;

    public PagerMoviesAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TrailerMoviesFragment();
            case 1:
                return new RecommendMoviesFragment();
            case 2:
                return new CommentsMoviesFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Trailers";
            case 1:
                return "More Like This";
            case 2:
                return "Comments";
        }
        return null;
    }
}
