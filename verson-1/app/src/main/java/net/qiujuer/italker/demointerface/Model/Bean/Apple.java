package net.qiujuer.italker.demointerface.Model.Bean;

import net.qiujuer.italker.demointerface.Model.Util.Counter;

public class Apple {
    private int num;
    final static public int price = 3;

    public int allPrice() {
        return Counter.sum(this.price, this.num);
    }

    public void setNum(int num) {
        this.num = num;
    }
}
