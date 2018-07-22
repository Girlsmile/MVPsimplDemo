package net.qiujuer.italker.demointerface.MyAdapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import net.qiujuer.italker.demointerface.base.BaseFragmentStatePageAdapter;

import java.util.List;

public class NavFragmentAdapter extends BaseFragmentStatePageAdapter {
    Context context;
    List<Fragment> fragmentList;

    public NavFragmentAdapter(FragmentManager fm, Context context, List<Fragment> fragmentList) {
        super(fm, context, fragmentList);
       this.context=context;
       this.fragmentList=fragmentList;
    }

    @Override
    protected Context setContext() {
        return this.context;
    }

    @Override
    protected List<Fragment> setList() {
        return this.fragmentList;
    }
}
