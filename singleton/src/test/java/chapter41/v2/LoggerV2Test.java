package chapter41.v2;

import com.example.designpattern.chapter41.v2.*;
import org.junit.Test;

/**
 * @author dorra
 * @date 2021/3/25 11:29
 * @description
 */
public class LoggerV2Test {

    @Test
    public void testV2() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    Logger.getInstance().log("dorra logined!" + i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    Logger.getInstance().log("Created an order: " + i);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
