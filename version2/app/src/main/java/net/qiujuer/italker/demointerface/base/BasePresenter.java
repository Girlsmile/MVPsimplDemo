package net.qiujuer.italker.demointerface.base;

import android.util.Log;

import net.qiujuer.italker.demointerface.Presenter.Presenter;
import net.qiujuer.italker.demointerface.Presenter.PresenterView;

public abstract class BasePresenter<V extends BaseView> {
    protected V view;

    public V getView() {
        return view;
    }

    public void onattachView(V view) {
        this.view = view;
        Log.d("444", "onattachView");
    }

    public void detachView() {
        this.view = null;
        Log.d("444", "detachView");
    }
}
