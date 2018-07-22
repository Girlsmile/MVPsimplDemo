package net.qiujuer.italker.demointerface.base;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;


public abstract class BaseFragmentStatePageAdapter extends FragmentStatePagerAdapter {
    protected abstract Context setContext();
    protected abstract List<Fragment> setList();

    public BaseFragmentStatePageAdapter(FragmentManager fm, Context context, List<Fragment> fragmentList) {
        super(fm);
        context=setContext();
        fragmentList=setList();

    }

    @Override
    public Fragment getItem(int position) {
        return setList().get(position);
    }

    @Override
    public int getCount() {
        return setList().size();
    }

    public  Context getContext(){
        return this.setContext();
    }
}
