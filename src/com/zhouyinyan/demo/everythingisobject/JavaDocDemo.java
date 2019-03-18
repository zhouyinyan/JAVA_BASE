package com.zhouyinyan.demo.everythingisobject;

/**
 * javadoc的简单实用，注释中添加javadoc标记，通过javadoc工具提取，生成HTML文档
 * <pre>
 *     javadoc -d ./javadoc -verbose -encoding utf-8 -docencoding utf-8 -charset utf-8 JavaDocDemo.java
 * </pre>
 * <pre>
 *     System.out.println(new Date());
 * </pre>
 * @author zhouyinyan
 * @author gruelac@126.com
 * @see java.lang.System
 * {@docRoot}
 * {@inheritDoc}
 * @version 1.0
 * @since jdk1.5
 */
public class JavaDocDemo {

    /**
     * 计算字符串在unicode编码下，占用的内存空间
     * @param s 待计算的字符串
     * @return 占用的空间长度
     */
    public static long demoMehtod(String s){
        return s.length() * 2;
    }

    /**
     * 主方法 - 程序入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        System.out.println(JavaDocDemo.demoMehtod("main"));
    }

}
