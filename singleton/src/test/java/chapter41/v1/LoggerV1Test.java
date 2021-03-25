package chapter41.v1;

import com.example.designpattern.chapter41.v1.*;
import org.junit.Test;

/**
 * @author dorra
 * @date 2021/3/25 11:29
 * @description
 */
public class LoggerV1Test {

    @Test
    public void testV1() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    new Logger().log("dorra logined!" + i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    new Logger().log("Created an order: " + i);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
