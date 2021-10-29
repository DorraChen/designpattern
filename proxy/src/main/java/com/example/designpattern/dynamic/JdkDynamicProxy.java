package com.example.designpattern.dynamic;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @author dorra
 * @date 2021/10/28 15:49
 * @description jdk 动态代理
 */
public class JdkDynamicProxy {
    public static BookApi createJdkDynamicProxy(final BookApi delegate) {
        BookApi jdkProxy = (BookApi) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{BookApi.class}, new JdkHandler(delegate));
        return jdkProxy;
    }

    private static class JdkHandler implements InvocationHandler {

        final Object delegate;

        JdkHandler(Object delegate) {
            this.delegate = delegate;
        }

        @Override
        public Object invoke(Object object, Method method, Object[] objects)
                throws Throwable {
            // 添加代理逻辑 <1>
            if (method.getName().equals("sell")) {
                System.out.print("");
            }
            return null;
//            return method.invoke(delegate, objects);
        }

    }
}
