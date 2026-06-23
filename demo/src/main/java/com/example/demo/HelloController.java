package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


      @GetMapping("hello")
    public String hello(){
          return  "<h1><center>This is Spring boot" +
                  " Application</center></h1> </br>" +
                  " <h3><center>Hello World</center></h3>\n";
    }

    @GetMapping("bye")
    public String greetBye(){
        return  "<h1><center>This is Spring boot" +
                " Application</center></h1> </br>" +
                " <h3><center>Bye Bye </center></h3>\n";
    }

}
