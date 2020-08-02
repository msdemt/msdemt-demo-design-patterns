package org.msdemt.demo.design.factory;

import org.msdemt.demo.design.util.ClassLoaderUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(
                method.getName(),
                ClassLoaderUtil.getClazzByArgs(args)
        ).invoke(cacheAdapter, args);
    }
}
