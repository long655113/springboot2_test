/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pz.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pz.demo.mapper.TestMapper;
import com.pz.demo.model.JsonData;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author long655113
 */
@RestController
@EnableAutoConfiguration
public class TestController {
    
    @Autowired
    TestMapper testMapper;

    @RequestMapping("/")
    public String home(String name) {
        Date now = this.testMapper.getNow();
        return name + ":Hello World!" + now;
    }
    
    @RequestMapping("json")
    public Object json() {
        Map<String, Object> map = new HashMap();
        
        map.put("date", this.testMapper.getNow());
        map.put("Integer", 10);
        map.put("Double", Double.valueOf("3.14159"));
        map.put("char[]", "ablkjd".split("|"));
        
        return map;
    }
    
    @RequestMapping("/jsonData")
    public Object jsonData(@RequestBody JsonData jsonParam) {
        
        return jsonParam;
    }
    
}
