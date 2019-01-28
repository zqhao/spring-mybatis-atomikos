package com.study.service;

import com.study.daoa.AMapper;
import com.study.daob.BMapper;
import com.study.domain.DS1_A;
import com.study.domain.DS2_B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:TestService
 * Description:  <br/>
 *
 * @author zqhao
 * @created: 2019-01-28 11:16 <br/>
 * @Version 1.0
 */
@Service
public class DTService {
    @Autowired
    private AMapper aMapper;

    @Autowired
    private BMapper bMapper;

    /**
     * 单个数据源数据插入
     */
    public void saveDataSource1_A() {
        DS1_A a = new DS1_A();
        a.setA1(1);
        a.setA2("a1");
        aMapper.saveInfo(a);

    }

    /**
     * 两个数据源数据插入
     */
    public void saveTwoDataSourceSuccess() {
        DS1_A a = new DS1_A();
        a.setA1(2);
        a.setA2("a2");
        aMapper.saveInfo(a);

        DS2_B b = new DS2_B();
        b.setB1(1);
        b.setB2("b1");
        bMapper.saveInfo(b);
    }

    /**
     * 两个数据源数据插入 b中插入重复数据
     */
    public void saveTwoDataSourceFail() {
        DS1_A a = new DS1_A();
        a.setA1(3);
        a.setA2("a3");
        aMapper.saveInfo(a);

        DS2_B b = new DS2_B();
        b.setB1(1);
        b.setB2("b1");
        bMapper.saveInfo(b);
    }
}

