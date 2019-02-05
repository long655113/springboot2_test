/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pz.demo.controller;

import com.pz.demo.mapper.TestMapper;
import com.pz.demo.model.JsonData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author long655113
 */
@RestController
@Api(value = "TestController", tags = "测试参数请求接口")
@CrossOrigin
public class TestController {

    @Autowired
    TestMapper testMapper;

    @ApiOperation(value = "index请求", notes = "获取数据库服务器时间")
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(String name) {
        Date now = this.testMapper.getNow();
        return name + ":Hello World!" + now;
    }

    @ApiOperation(value = "返回数据是json", notes = "返回数据对象自动转json")
    @RequestMapping(value = "json", method = {RequestMethod.GET, RequestMethod.POST})
    public Object json() {
        Map<String, Object> map = new HashMap();

        map.put("date", this.testMapper.getNow());
        map.put("Integer", 10);
        map.put("Double", Double.valueOf("3.14159"));
        map.put("char[]", "ablkjd".split("|"));

        return map;
    }

    @ApiOperation(value = "请求数据是json", notes = "请求和返回数据都是json")
    @RequestMapping(value = "/jsonData", method = {RequestMethod.POST})
    public Object jsonData(@RequestBody JsonData jsonParam) {

        return jsonParam;
    }

}
