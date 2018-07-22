package net.qiujuer.italker.demointerface.Presenter;

import net.qiujuer.italker.demointerface.Model.Bean.Apple;
import net.qiujuer.italker.demointerface.base.BasePresenter;
import net.qiujuer.italker.demointerface.base.BaseView;

public class Presenter extends BasePresenter<PresenterView> {
    Apple mapple=new Apple();
    int result;

    public void setSum(int sum) {
        this.result = sum;
        this.mapple.setNum(sum);
    }

    public  int allpriceget(){
       result=mapple.allPrice();
        if(getView()!=null){
            getView().sum(result);
        }
        return result;

    }

    public  void allget(){
        result=mapple.allPrice()*3;
        if(getView()!=null){
            getView().moresun(result);
        }

    }

}
