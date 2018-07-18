package net.qiujuer.italker.demointerface.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract  class BaseFragment<V extends  BaseView,P extends  BasePresenter<V>> extends Fragment {
    V view;
    P presenter;

    public P getPresenter() {
        return presenter;
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
