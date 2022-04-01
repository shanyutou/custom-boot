package ml.yixiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/app")
public class MyController {

    @RequestMapping("/index")
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
