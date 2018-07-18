package net.qiujuer.italker.demointerface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import net.qiujuer.italker.demointerface.Presenter.Presenter;
import net.qiujuer.italker.demointerface.Presenter.PresenterView;
import net.qiujuer.italker.demointerface.base.BaseActivity;

public class MainActivity extends BaseActivity<PresenterView,Presenter> implements  PresenterView {
    EditText editText;
    TextView textView;
    int s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.show_Text);
        editText = findViewById(R.id.Ed);

    }

    public void submit(View view) {
        if (editText.getText() != null) {
            s = Integer.parseInt(editText.getText().toString());
            getPresenter().setSum(s);
            getPresenter().allpriceget();
            getPresenter().allget();
        }
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
