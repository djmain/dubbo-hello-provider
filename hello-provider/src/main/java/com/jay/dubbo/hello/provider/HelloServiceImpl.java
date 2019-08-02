package com.jay.dubbo.hello.provider;

import com.jay.duboo.hello.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * created by Jay on 2019/8/2
 */
@Service
public class HelloServiceImpl implements HelloService
{
    @Override
    public String sayHello(String name)
    {
        System.out.println("calling hello service.");
        return "Hello, " + name;
    }
}
