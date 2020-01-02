package life.hhh.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @GetMapping("/")//任何东西都不输入时默认访问index里的内容
    public String index(){
        return "index";
    }
}
