package com.yyyz.test;

/**
 * @Author yzz
 * @Date 2024/10/31 上午11:13
 */

public class test11 {
    public static void main(String[] args) {
        // 原始字符串
        String input = "id, count, capacity,    data_time, type, create_time, update_time";

        // 将字符串按逗号分割成数组
        String[] parts = input.split(", ");
        String[] parts2 = input.split(", ");

        // 使用 StringBuilder 来构建最终的字符串45677
        StringBuilder result = new StringBuilder();

        for (String part : parts) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append("\"").append(part).append("\"");
        }

        // 输出结果
        System.out.println(result.toString());
    }
}
