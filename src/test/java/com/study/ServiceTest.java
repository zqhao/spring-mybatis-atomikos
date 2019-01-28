package com.study;

import com.study.service.DTService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName:ServiceTest
 * Description:  <br/>
 *
 * @author zqhao
 * @created: 2019-01-28 13:44 <br/>
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class ServiceTest {

    @Autowired
    private DTService dtService;

    /**
     * 单个数据源事务提交
     */
    @Test
    public void test_01() {
        dtService.saveDataSource1_A();
    }

    /**
     * 多个数据源提交 事务成功
     */
    @Test
    public void test_02() {
        dtService.saveTwoDataSourceSuccess();
    }

    /**
     * 多个数据源提交 事务回滚
     */
    @Test
    public void test_03() {
        dtService.saveTwoDataSourceFail();
    }
}
