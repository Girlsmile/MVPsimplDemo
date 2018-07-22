package net.qiujuer.italker.demointerface.base;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.qiujuer.italker.demointerface.R;

import butterknife.ButterKnife;

public abstract  class BaseFragment<V extends  BaseView,P extends  BasePresenter<V>> extends Fragment {

    V view;
    P presenter;


    public P getPresenter() {
        return presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(setContentViewId(),container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (presenter==null){
            this.presenter=createPresenter();
        }
        if (view==null){
            this.view=createView();
        }

    }
    protected abstract int setContentViewId();

    public abstract P  createPresenter();
    public  abstract  V createView();


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (presenter!=null&&view!=null){
            presenter.detachView();
        }
    }


}
