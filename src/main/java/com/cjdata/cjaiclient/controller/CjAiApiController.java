package com.cjdata.cjaiclient.controller;

import com.cjdata.cjaiclient.util.HttpClientUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/gptApi")
public class CjAiApiController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/toNextView")
    public String getNext() {
        return "ai_client";
    }

    @RequestMapping("/getNext")
    public ModelAndView getNext(ModelAndView modelAndView, String key) {
        System.out.println(key);
        if(StringUtils.isEmpty(key)){
            modelAndView.setViewName( "ai_client" );
            modelAndView.addObject( "result" , "请求参数为空" );
        }else{
            Map params = new HashMap();
            params.put("keystr", key);
            String result = HttpClientUtil.doGet("http://192.168.15.200:8000/cjai/api/v1/get/tasks", params);
            modelAndView.setViewName( "ai_client" );
            modelAndView.addObject( "result" , result);
        }
        return modelAndView;
    }
}