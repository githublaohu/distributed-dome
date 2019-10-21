package com.dome.user.producer.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.dome.user.service.DemoService;

/**
 * Default {@link DemoService}
 * nacos官方提供的demo
 * @since 2.6.5
 */
@Service
public class DemoServiceImpl implements DemoService {

    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return "Service:demoService      "+"调用端口"+rpcContext.getLocalPort()+"            调用方法"+rpcContext.getMethodName()+"          name:"+name;
    }
}