package in.engkrishna;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class B {
     A a;

     public void setA(A a){
         this.a =a;

     }


}

//public B(A a) {
//      this.a = a;
//      System.out.println("Constructor B is Called!!");
//    }
