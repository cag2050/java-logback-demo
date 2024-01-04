package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Example {
    private static final Logger LOGGER = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) {
        // 设置 MDC 字段值
        // 修改val值，会输出到不同的<val>.log文件
        String val = "yourFieldValue";
        MDC.put("yourFieldName", val);

        LOGGER.info("This log message will go to a file named '" + val +".log'");

        // 清理 MDC 字段值
        MDC.clear();
    }
}
