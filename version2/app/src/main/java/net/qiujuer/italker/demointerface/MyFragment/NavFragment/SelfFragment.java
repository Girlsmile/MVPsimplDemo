package net.qiujuer.italker.demointerface.MyFragment.NavFragment;

import net.qiujuer.italker.demointerface.Presenter.NavPresenter.MsgPresenter;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.MsgPresenterView;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.SelfPresenter;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.SelfPresenterView;
import net.qiujuer.italker.demointerface.R;
import net.qiujuer.italker.demointerface.base.BaseFragment;


public class SelfFragment extends BaseFragment<SelfPresenterView,SelfPresenter>implements SelfPresenterView {
    @Override
    protected int setContentViewId() {
        return R.layout.navself;
    }

    @Override
    public SelfPresenter createPresenter() {
        return new SelfPresenter();
    }

    @Override
    public SelfPresenterView createView() {
        return this;
    }
}
