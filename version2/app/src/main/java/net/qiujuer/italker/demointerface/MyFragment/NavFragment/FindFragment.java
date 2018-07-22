package net.qiujuer.italker.demointerface.MyFragment.NavFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import net.qiujuer.italker.demointerface.Presenter.NavPresenter.FindPresenter;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.FindPresenterView;
import net.qiujuer.italker.demointerface.R;
import net.qiujuer.italker.demointerface.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;


public class FindFragment extends BaseFragment<FindPresenterView,FindPresenter>implements FindPresenterView {

    @BindView( R.id.navFindButton)
    Button navFindButton;

    @Override
    public FindPresenter createPresenter() {
        return new FindPresenter();
    }

    @Override
    public FindPresenterView createView() {
        return this;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    protected int setContentViewId() {
        return R.layout.navfind;
    }

    @OnClick(R.id.navFindButton) void  submit(){
        Toast.makeText(this.getActivity(),"你好我是发现",Toast.LENGTH_SHORT).show();
    }
}
