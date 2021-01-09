package org.example.store.controller;

import org.example.store.dto.TestDTO;
import org.example.store.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Main {
    @Inject
    private TestService service;

    @RequestMapping(value="/")
    public String index(TestDTO testDTO, Model model) throws Exception {
        List<TestDTO> list = service.selectAllTest();
        model.addAttribute("list", list);
        return "index";

    }

    @RequestMapping(value="/json", produces = "application/json")
    @ResponseBody
    public Object json(){
        Map<String, String> map = new HashMap<>();
        map.put("test", "Hello world!(/json) This is Spring MVC project by using IntelliJ");
        return map;
    }

}
