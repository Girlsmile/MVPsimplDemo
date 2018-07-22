package net.qiujuer.italker.demointerface.Presenter;

import android.util.Log;

import net.qiujuer.italker.demointerface.Model.Bean.Apple;
import net.qiujuer.italker.demointerface.base.BasePresenter;
import net.qiujuer.italker.demointerface.base.BaseView;

public class DemoPersenter extends BasePresenter<DemoPresenterView> {
    Apple mapple=new Apple();
    int result;

    public void setSum(int sum) {
        this.result = sum;
        this.mapple.setNum(sum);
    }

    public  int allpriceget(){
        result=mapple.allPrice();
        if(getView()!=null){
            getView().getResult(result);
        }
        return result;
        }
   }


