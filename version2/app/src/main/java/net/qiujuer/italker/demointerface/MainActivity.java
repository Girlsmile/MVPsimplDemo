package net.qiujuer.italker.demointerface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import net.qiujuer.italker.demointerface.MyActivity.LoginActivity;
import net.qiujuer.italker.demointerface.MyActivity.Navactivity;
import net.qiujuer.italker.demointerface.Presenter.Presenter;
import net.qiujuer.italker.demointerface.Presenter.PresenterView;
import net.qiujuer.italker.demointerface.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<PresenterView,Presenter> implements  PresenterView {
    @BindView(R.id.Ed)
    EditText editText;
    @BindView(R.id.show_Text)
    TextView textView;
    @BindView(R.id.submitButton)
    Button button;
    int s;


    @Override
    protected void initData() {

    }

    @Override
    protected int setContentViewId() {
        return R.layout.activity_main;
    }

 @OnClick(R.id.submitButton) void submit(View view) {
        Intent intent=new Intent();
        intent.setClass(this, LoginActivity.class);
     startActivity(intent);
     finish();
        if (editText.getText() != null) {
            s = Integer.parseInt(editText.getText().toString());
            getPresenter().setSum(s);
            getPresenter().allpriceget();
            getPresenter().allget();
        }
        startActivity(intent);
    }

    @Override
    public int sum(int result) {
        final String show = String.valueOf(result);
        Log.d("rrrrrr", String.valueOf(result));
        Log.d("Thread", show);
        textView.setText(String.valueOf(result));
        return 0;
    }

    @Override
    public int moresun(int result) {
        Toast.makeText(this,String.valueOf(result),Toast.LENGTH_SHORT).show();
        return 0;
    }

    @Override
    public Presenter createPresenter() {
        return new Presenter();
    }

    @Override
    public PresenterView createView() {
        return this;
    }
}
