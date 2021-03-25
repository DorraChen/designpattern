package com.example.designpattern.chapter41.v1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author dorra
 * @date 2021/3/25 11:17
 * @description 往文件中打印日志
 */
public class Logger {
    private FileWriter writer;

    public Logger() {
        File file = new File(".\\log_v1.txt");
        try {
            //true表示追加写入
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        try {
            synchronized (Logger.class) {
                writer.write(message + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



