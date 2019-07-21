package com.youyi.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderClient {
    public static void main(String[] args) throws Exception {
        /**
         * 手动加载配置文件
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-youyi-provider.xml"});
        context.start();
        try {
            System.in.read(); // 按任意键退出

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
