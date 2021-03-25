package com.example.designpattern.chapter41.v2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author dorra
 * @date 2021/3/25 14:49
 * @description
 */
public class Logger {
    private FileWriter writer;
    private static final Logger instance = new Logger();

    private Logger() {
        File file = new File(".\\log_v2.txt");
        try {
            //true表示追加写入
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        return instance;
    }

    public void log(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}