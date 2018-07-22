package net.qiujuer.italker.demointerface.MyActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import net.qiujuer.italker.demointerface.Presenter.LoginPresenter.LoginPresenter;
import net.qiujuer.italker.demointerface.Presenter.LoginPresenter.LoginPresenterView;
import net.qiujuer.italker.demointerface.R;
import net.qiujuer.italker.demointerface.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginPresenterView,LoginPresenter> implements  LoginPresenterView {
    @BindView(R.id.login_avatar)
    ImageView login_avatar_imageView;
    @BindView(R.id.login_autologin)
    CheckBox login_autologin_CheckBox;
    @BindView(R.id.login_button)
    Button login_button;
    @BindView(R.id.login_rememberpassword)
    CheckBox login_rememberpassword_CheckBox;
    @BindView(R.id.login_id)
    EditText login_id_edittext;
    @BindView(R.id.login_password)
    EditText getLogin_password_edittext;
    @BindView(R.id.register_button)
    Button register_button;
    @BindView(R.id.more_login_button)
    Button more_login_button;

    @Override
    protected void initData() {

    }

    @Override
    protected int setContentViewId() {
        return R.layout.loginlayout;
    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public LoginPresenterView createView() {
        return this;
    }


    @OnClick(R.id.login_button) void login(){
        Intent intent=new Intent();
        intent.setClass(this,Navactivity.class);
        startActivity(intent);
    }

    @Override
    protected <V> void onLoading(V result) {
        super.onLoading(result);
    }
}
