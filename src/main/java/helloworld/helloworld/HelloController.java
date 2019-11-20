package helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getGretting(){
        return "hello selomie";
    }

    @GetMapping("/helloWorld")
    public  HelloModel getGreeting(){
        return new HelloModel("hi selomie");
    }

    @GetMapping("/hello/{name}")
    public String getgrettingSTR(@PathVariable String name){
        return "hello =>" + name;
    }
}
