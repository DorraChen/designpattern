package com.example.designpattern;

import com.example.designpattern.doublecheck.DoubleCheckSingleton;
import com.example.designpattern.hungry.HungrySingleton;
import com.example.designpattern.lazy.LazySingleton;
import com.example.designpattern.multiton.Multiton;
import com.example.designpattern.process.ProcessSingleton;
import com.example.designpattern.thread.ThreadSingleton;
import com.example.designpattern.uenum.EnumSingleton;
import com.example.designpattern.ustatic.StaticBlockSingleton;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dorra
 * @date 2021/4/21 14:53
 * @description
 */
public class SingletonTest {
    @Test
    public void singletonTest() {
        Assert.assertEquals(DoubleCheckSingleton.getInstance(), DoubleCheckSingleton.getInstance());
        Assert.assertEquals(HungrySingleton.getInstance(), HungrySingleton.getInstance());
        Assert.assertEquals(LazySingleton.getInstance(), LazySingleton.getInstance());
        Assert.assertEquals(EnumSingleton.INSTANCE, EnumSingleton.INSTANCE);
        Assert.assertEquals(StaticBlockSingleton.getInstance(), StaticBlockSingleton.getInstance());
        Assert.assertEquals(ThreadSingleton.getInstance(), ThreadSingleton.getInstance());
//        Assert.assertEquals(ProcessSingleton.getInstance(), ThreadSingleton.getInstance());
    }

    @Test
    public void multitonTest() {
        // 相同
        Assert.assertEquals(Multiton.getInstance("Hello"), Multiton.getInstance("Hello"));
        // 不同
        Assert.assertEquals(Multiton.getInstance("Hello"), Multiton.getInstance("Ketty"));
    }
}
