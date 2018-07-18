package net.qiujuer.italker.demointerface.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseActivity<V extends BaseView, P extends BasePresenter<V>> extends Activity {
    private P presenter;
    private V view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null) {
            this.presenter=createPresenter();
        }
        if (view == null) {
            view=this.createView();
        }
        if (presenter != null && view != null) {
            this.presenter.onattachView(view);
        }
    }

    public P getPresenter() {
        return presenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null && view != null) {
            this.presenter.detachView();

        }
    }

    public abstract P createPresenter();

    public abstract V createView();
}
