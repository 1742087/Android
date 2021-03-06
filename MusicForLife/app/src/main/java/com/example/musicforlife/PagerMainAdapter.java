package com.example.musicforlife;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;


public class PagerMainAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 5;
    private Fragment mFragmentListSong, mFragmentRecent, mFramentArtist, mFragmentAlbum, mFragmentFolder;
    FragmentManager mFragmentManager;
    public PagerMainAdapter(FragmentManager fm) {
        super(fm);
        mFragmentManager=fm;
    }

    @Override
    public Fragment getItem(int i) {
       Fragment fragment=null;
        switch (i){
            case 0:

                fragment=mFragmentRecent==null?mFragmentRecent= new FragmentRecent():mFragmentRecent;
                break;
            case 1:

                fragment=mFragmentListSong==null?mFragmentListSong=FragmentListSong.newInstance():mFragmentListSong;
                break;
            case 2:

                fragment=mFramentArtist==null?mFramentArtist=new FragmentArtist():mFramentArtist;
                break;
            case 3:
                fragment=mFragmentAlbum==null?mFragmentAlbum=new FragmentAlbum():mFragmentAlbum;

                break;
            case 4:
                fragment=mFragmentFolder==null?mFragmentFolder=new FragmentFolder():mFragmentFolder;
                break;
            default:
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
//        private void loadFragment(Fragment fragment, String tag) {
//        //load fragment
//        FragmentTransaction transaction = mFragmentManager.beginTransaction();
////        fragmentListSong = FragmentListSong.newInstance();
//        transaction.add(R.id.frame_container, fragment, tag);
//        transaction.addToBackStack(tag);
//        transaction.commit();
//
//    }
}
