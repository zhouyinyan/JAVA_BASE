package com.zhouyinyan.demo.interfacedemo;

import java.util.Arrays;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public interface Processor {

    String name();
    Object process(Object input);

    abstract class AbstractProcessor implements Processor{
        public String name(){
            return getClass().getSimpleName();
        }
        public abstract Object process(Object input);
    }

    static class Upcase extends AbstractProcessor{
        @Override
        public String process(Object input) {  //协变返回类型
            return ((String)input).toUpperCase();
        }
    }

    static class Downcase extends AbstractProcessor{
        @Override
        public String process(Object input) {  //协变返回类型
            return ((String)input).toLowerCase();
        }
    }

    static class Splitter extends AbstractProcessor{
        @Override
        public String process(Object input) {  //协变返回类型
            return Arrays.toString(((String)input).split(" "));
        }
    }

    static class Apply{
        static void process(Processor processor, Object input){   //策略模式
            System.out.println("using processor " + processor.name());
            System.out.println(processor.process(input));
        }

    }

    public static void main(String[] args) {
        String s = "disagreement with beliefs is definition incorrect.";
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);

        Apply.process(new FilterAdapter(new LowPass()), new WaveForm());
        Apply.process(new FilterAdapter(new HighPass()), new WaveForm());
        Apply.process(new FilterAdapter(new BandPass()), new WaveForm());
    }

    class FilterAdapter implements Processor{  //适配器模式

        private Filter filter;

        public FilterAdapter(Filter filter) {
            this.filter = filter;
        }

        @Override
        public String name() {
            return filter.name();
        }

        @Override
        public Object process(Object input) {
            return filter.process((WaveForm) input);
        }
    }


    //-----------------------------
    static class WaveForm{
        private static long counter;
        private final long id = counter++;

        @Override
        public String toString() {
            return "WaveFrom " + id;
        }
    }

    class Filter{
        public String name(){
            return getClass().getSimpleName();
        }
        public WaveForm process(WaveForm input){
            return input;
        }
    }

    class LowPass extends Filter{
        @Override
        public WaveForm process(WaveForm input) {
            return input;
        }
    }

    class HighPass extends Filter{
        @Override
        public WaveForm process(WaveForm input) {
            return input;
        }
    }

    class BandPass extends Filter{
        @Override
        public WaveForm process(WaveForm input) {
            return input;
        }
    }


}
