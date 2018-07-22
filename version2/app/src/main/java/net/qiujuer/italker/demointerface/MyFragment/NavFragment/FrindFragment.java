package net.qiujuer.italker.demointerface.MyFragment.NavFragment;

import net.qiujuer.italker.demointerface.Presenter.NavPresenter.FindPresenter;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.FindPresenterView;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.MsgPresenter;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.MsgPresenterView;
import net.qiujuer.italker.demointerface.R;
import net.qiujuer.italker.demointerface.base.BaseFragment;


public class FrindFragment extends BaseFragment<FindPresenterView,FindPresenter>implements FindPresenterView {
    @Override
    protected int setContentViewId() {
        return R.layout.navfind;
    }

    @Override
    public FindPresenter createPresenter() {
        return new FindPresenter();
    }

    @Override
    public FindPresenterView createView() {
        return this;
    }
}
