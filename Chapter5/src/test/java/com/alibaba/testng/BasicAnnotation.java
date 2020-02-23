package com.alibaba.testng;

import org.testng.annotations.Test;

public class BasicAnnotation {

    @Test(groups = "server")
    public void test(){
        System.out.println("服务端运行");
    }

    @Test(groups = "client")
    public void test2(){
        System.out.println("客户端运行");
    }
}
