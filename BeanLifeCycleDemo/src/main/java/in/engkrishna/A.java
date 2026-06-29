package in.engkrishna;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class A {
    B b;

    public A(B b) {
        this.b = b;
        System.out.println("This is A constructor");
    }
    @PostConstruct
    public void setB(){
     b.setA(this);
    }
}
