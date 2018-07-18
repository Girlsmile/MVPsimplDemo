package net.qiujuer.italker.demointerface;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import net.qiujuer.italker.demointerface.Presenter.Presenter;
import net.qiujuer.italker.demointerface.Presenter.PresenterView;
import net.qiujuer.italker.demointerface.base.BaseFragment;


public class MyFragment extends BaseFragment<PresenterView,Presenter> implements PresenterView {
    public  MyFragment(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.Sbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().setSum(69);
                Toast.makeText(getActivity(), String.valueOf(getPresenter().allpriceget()),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public Presenter createPresenter() {
        return new Presenter();
    }

    @Override
    public PresenterView createView() {
        return this;
    }

    @Override
    public int sum(int result) {
        return 0;
    }

    @Override
    public int moresun(int result) {
        return 0;
    }
}
