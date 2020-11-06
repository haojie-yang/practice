package com.example.practice.controller;

import com.example.practice.entity.People;
import com.example.practice.result.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description:
 * @author: yanghaojie 31648
 * @date: 2020/9/17 11:46
 */

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("index")
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("test")
    public ResponseResult test(){
        ResponseResult result = new ResponseResult();
        People people = new People();
        people.setName("阳豪杰");
        people.setAge(23);
        people.setSex("男");
        result.setCode(100);
        result.setMsg("操作成功");
        result.setData(people);
        return result;
    }
}
