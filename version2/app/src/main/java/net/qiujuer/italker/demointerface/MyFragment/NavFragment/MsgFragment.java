package net.qiujuer.italker.demointerface.MyFragment.NavFragment;

import net.qiujuer.italker.demointerface.Presenter.NavPresenter.MsgPresenter;
import net.qiujuer.italker.demointerface.Presenter.NavPresenter.MsgPresenterView;
import net.qiujuer.italker.demointerface.R;
import net.qiujuer.italker.demointerface.base.BaseFragment;


public class MsgFragment extends BaseFragment<MsgPresenterView,MsgPresenter>implements MsgPresenterView {
    @Override
    protected int setContentViewId() {
        return R.layout.navfind;
    }

    @Override
    public MsgPresenter createPresenter() {
        return new MsgPresenter();
    }

    @Override
    public MsgPresenterView createView() {
        return this;
    }
}
