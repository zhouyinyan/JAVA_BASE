package com.zhouyinyan.demo.innerclass;

/**
 * Created by zhouyinyan on 2019/3/19.
 */
public class Sequence {
    private Object[] items;

    public Sequence(int size) {
        items = new Object[size];
        for(int i=0;i<size;i++){
            items[i] = new Object();
        }
    }

    public Selector selector(){
        return new SequenceSelector();  //初始化内部类
    }


    /**
     * 非static内部类，在外部类中实例化后，会隐含一个指向外部类对象的引用，能够直接访问外部类的所有成员。
     */
    private class SequenceSelector implements Selector{
        private int index = 0;

        @Override
        public boolean haxNext() {
            return index < items.length-1;
        }

        @Override
        public Object next() {
            if(haxNext()){
                return items[index++];
            }
            return null;
        }

        public Sequence outerSequence(){
            return Sequence.this;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        Selector selector = sequence.selector();
        while(selector.haxNext()){
            System.out.println(selector.next());
        }

        System.out.println(sequence == ((SequenceSelector)selector).outerSequence());
    }
}
