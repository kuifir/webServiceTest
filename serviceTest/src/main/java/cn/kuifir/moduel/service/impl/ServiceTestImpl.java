package cn.kuifir.moduel.service.impl;

import cn.kuifir.moduel.service.ServiceTest;

import javax.jws.WebService;

/**
 * Package: cn.kuifir.moduel.service.impl
 * <p>
 * Description： TODO
 * <p>
 * Author: baci
 * <p>
 * Date: Created in 2022/3/5 14:56
 * <p>
 * Version: 0.0.1
 */
@WebService
public class ServiceTestImpl implements ServiceTest {
    public String weather(String city) {
        System.out.println("输入参数：" + city);
        return city + "天气晴朗";
    }

    public String people(String name, int age) {
        System.out.println("输入参数:" + name + age);
        return name + "今年" + age + "岁";
    }
}
