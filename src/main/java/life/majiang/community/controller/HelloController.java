package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    //HelloController充当一个请求处理类

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){ //hello()方法将处理所有传入URL的请求/hello
        //@RequestParam注解将请求参数绑定至方法参数，name为参数名；URL接收到的请求就必须带上方法参数，如/hello?name=xiaoshuwen
        model.addAttribute("name",name);//@ModelAttribute注解用于将请求的参数绑定到Model对象中，方便在前台的数据回显
        return "hello";     //返回hello.html 可视化文件
    }
}
