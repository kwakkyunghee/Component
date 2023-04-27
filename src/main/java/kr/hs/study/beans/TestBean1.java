package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //("test")
//type으로 가져오기(이름이 없는 익명의 클래스일 경우) test라는 이름을 부여하면 test로 객체 생성
@Lazy
@Scope("prototype")
public class TestBean1 {
    public TestBean1() {
        System.out.println("TestBean1의 생성자");
    }
}
