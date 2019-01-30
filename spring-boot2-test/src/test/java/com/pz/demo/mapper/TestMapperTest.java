/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pz.demo.mapper;

import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author long655113
 */
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@SpringBootTest(classes = {TestMapper.class})
public class TestMapperTest {
    
    @Autowired
    TestMapper testMapper;
    
    public TestMapperTest() {
    }

    @Test
    public void testSomeMethod() {
        Date now = this.testMapper.getNow();
        
        System.out.println("now:" + now);
    }
    
}
