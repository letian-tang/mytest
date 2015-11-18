package com.test.map;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 测试
 * Exception in thread "Thread-1" java.util.ConcurrentModificationException
    at java.util.HashMap$HashIterator.nextNode(HashMap.java:1429)
    at java.util.HashMap$EntryIterator.next(HashMap.java:1463)
    at java.util.HashMap$EntryIterator.next(HashMap.java:1461)
    at com.test.map.MapTest$2.run(MapTest.java:81)
    at java.lang.Thread.run(Thread.java:745)

 * @author tdy
 * 2015年11月17日
 */
public class MapTest {
    //static Hashtable<String, String> map = new Hashtable<String, String>();
    //static Map<String, String> map = new HashMap<String, String>();
    //static Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
    static Map<String, String> map = new ConcurrentHashMap<String, String>();
    
    
    static{
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");
    }


    public static void main(String[] args){
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                map.put("7", "7");
                try {
                    Thread.sleep(1);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                map.put("8", "8");
                try {
                    Thread.sleep(1);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                map.put("9", "9");
                try {
                    Thread.sleep(1);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                map.put("10", "10");
                
            }
        }).start();
        
        
       new Thread(new Runnable() {
           @Override
            public void run() {
               
               
                Map.Entry<String, String> entry = null;
                Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
                while(iterator.hasNext()){
                    try {
                        Thread.sleep(1);
                    }
                    catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    entry = iterator.next();
                    //if(entry.getKey().equals("8")){
                        iterator.remove();
                    //}
                    
                }
                System.out.println(map.size());
                
            }
        }).start();
       
       
       
       new Thread(() -> System.out.println("这是一个java8的小例子,可以使用lambda表达式")).start();

    }
    
}
