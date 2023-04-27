package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        System.out.println("obj1"+obj1);

        TestBean2 obj2 = ctx.getBean(TestBean2.class);
//        obj2.setData1(11); //자동주입해서 필요없다.
//        obj2.setData2(11.11);

        System.out.println("data1: "+obj2.getData1());
        System.out.println("data2: "+obj2.getData2());
    }
}