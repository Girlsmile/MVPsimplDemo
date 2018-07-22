package net.qiujuer.italker.demointerface.MyActivity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import net.qiujuer.italker.demointerface.MyAdapter.NavFragmentAdapter;
import net.qiujuer.italker.demointerface.MyFragment.NavFragment.FindFragment;
import net.qiujuer.italker.demointerface.MyFragment.NavFragment.FrindFragment;
import net.qiujuer.italker.demointerface.MyFragment.NavFragment.MsgFragment;
import net.qiujuer.italker.demointerface.MyFragment.NavFragment.SelfFragment;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.NavActivityPersenterView;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.NavActivityPresenter;
import net.qiujuer.italker.demointerface.R;
import net.qiujuer.italker.demointerface.base.BaseActivity;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnItemSelected;

public class Navactivity extends BaseActivity<NavActivityPersenterView,NavActivityPresenter> implements NavActivityPersenterView {
    @BindView(R.id.view_pager) ViewPager viewPager;
    @BindView(R.id.navigation) BottomNavigationView navigationView;
    List<Fragment> list;


    @Override
    protected void initData() {
        //向viewpage添加页面
        list=new ArrayList<>();
        list.add(new MsgFragment());
        list.add(new FrindFragment());
        list.add(new FindFragment());
        list.add(new SelfFragment());
        NavFragmentAdapter navFragmentAdapter=new NavFragmentAdapter(getSupportFragmentManager(), this, list);
        viewPager.setAdapter(navFragmentAdapter);
        //导航栏点击事件和ViewPager滑动事件,让两个控件相互关联
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //这里设置为：当点击到某子项，ViewPager就滑动到对应位置
                switch (item.getItemId()) {
                    case R.id.navMsgMeun:
                        Log.d("ggggg","你好");
                        viewPager.setCurrentItem(0);
                        Log.d("ggggg","你好");
                        return true;
                    case R.id.navFriendMeun:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.navFindMeun:
                        viewPager.setCurrentItem(2);
                        return true;
                    case R.id.navSelfMeun:
                        viewPager.setCurrentItem(3);
                        return true;
                    default:
                        break;
                }
                return false;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //注意这个方法滑动时会调用多次，下面是参数解释：
                //position当前所处页面索引,滑动调用的最后一次绝对是滑动停止所在页面
                //positionOffset:表示从位置的页面偏移的[0,1]的值。
                //positionOffsetPixels:以像素为单位的值，表示与位置的偏移
            }

            @Override
            public void onPageSelected(int position) {
                //该方法只在滑动停止时调用，position滑动停止所在页面位置
//                当滑动到某一位置，导航栏对应位置被按下
                navigationView.getMenu().getItem(position).setChecked(true);
                //这里使用navigation.setSelectedItemId(position);无效，
                //setSelectedItemId(position)的官网原句：Set the selected
                // menu item ID. This behaves the same as tapping on an item
                //未找到原因
            }

            @Override
            public void onPageScrollStateChanged(int state) {
//这个方法在滑动是调用三次，分别对应下面三种状态
// 这个方法对于发现用户何时开始拖动，
// 何时寻呼机自动调整到当前页面，或何时完全停止/空闲非常有用。
//                state表示新的滑动状态，有三个值：
//                SCROLL_STATE_IDLE：开始滑动（空闲状态->滑动），实际值为0
//                SCROLL_STATE_DRAGGING：正在被拖动，实际值为1
//                SCROLL_STATE_SETTLING：拖动结束,实际值为2
            }
        });



    }

    @Override
    protected int setContentViewId() {
        return R.layout.navlayout;
    }

    @Override
    public NavActivityPresenter createPresenter() {
        return new NavActivityPresenter();
    }

    @Override
    public NavActivityPersenterView createView() {
        return this;
    }

}
