package net.qiujuer.italker.demointerface.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;



import butterknife.ButterKnife;

public abstract class BaseActivity<V extends BaseView, P extends BasePresenter<V>> extends AppCompatActivity {
    private P presenter;
    private V view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setContentViewId());
        ButterKnife.bind(this);
        initData();

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

    protected abstract void initData();

    protected abstract int setContentViewId();

    protected<T> void  onLoading(T result){

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
