package com.zhouyinyan.demo.interfacedemo;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomWords(10));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        scanner = new Scanner(new ReadableAdpter());
        while (scanner.hasNextDouble()){
            System.out.println(scanner.nextDouble());
        }
    }

    static class RandomWords implements Readable {

        private int count ;

        public RandomWords(int count) {
            this.count = count;
        }

        @Override
        public int read(CharBuffer cb) throws IOException {
            if(count-- == 0){
                return -1;
            }
            String s = "hello ";
            cb.append(s);
            return s.length();
        }
    }

    static class RandomDoubles {
        private static Random random = new Random(50);
        public double next(){
            return random.nextDouble();
        }
    }

    static class ReadableAdpter extends RandomDoubles implements Readable{
        private int count = 3;

        @Override
        public int read(CharBuffer cb) throws IOException {
            if(count-- == 0){
                return -1;
            }
            String s = String.valueOf(next()) + " ";
            cb.append(s);
            return s.length();
        }
    }
}
