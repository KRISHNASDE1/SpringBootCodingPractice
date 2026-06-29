package in.engkrishna;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
//@Lazy
@Scope("prototype")
public class CartService  implements BeanNameAware, ApplicationContextAware
        /* implements InitializingBean , DisposableBean */ {



    Map<Integer,String> map;

    public CartService() {
        System.out.println("Cart Constructor Called!!");
        map = new HashMap<>();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("The Bean name is: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("The Context Application name is: " + applicationContext.getClass());

    }
    @PostConstruct
    public void start2(){
        System.out.println("Bean is Ready");
        map.put(1,"krishna");
        map.put(2,"Divesh");
    }

    public String getValue(int key){
        return map.get(key);
    }
//        public void start(){
//        System.out.println("Bean is Ready");
//        map.put(1,"krishna");
//        map.put(2,"Divesh");
//    }
//    public void stop(){
//        map.clear();
//        System.out.println("Bean is getting destroy!!");
//    }

//    @Override
//    public void destroy() throws Exception {
//        map.clear();
//        System.out.println("Bean is getting destroy!!");
//    }
    @PreDestroy
    public  void stop(){
        map.clear();
        System.out.println("Bean  is getting destroyed!!");
    }


    //    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean is Ready");
//        map.put(1,"krishna");
//        map.put(2,"Divesh");
//    }

//    public void addCart(){
//        System.out.println("Item Added Successfully!!");
//    }

    //    public void start(){
//        System.out.println("Bean is Ready");
//        map.put(1,"krishna");
//        map.put(2,"Divesh");
//    }
}
