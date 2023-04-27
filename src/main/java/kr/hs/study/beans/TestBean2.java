package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
    @Value("22") //이걸 사용하면 set을 사용 안해도된다
    private int data1;
    @Value("22.22")
    private double data2;
    
    

    public int getData1() {
        return data1;
    }
//자동주입해서 없어도 된다
//    public void setData1(int data1) {
//        this.data1 = data1;
//    }

    public double getData2() {
        return data2;
    }

//    public void setData2(double data2) {
//        this.data2 = data2;
//    }
}
