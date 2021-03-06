package cn.edu.hut.crazyacking.spider.queue;

import java.util.LinkedList;

/**
 * 未访问的url队列
 *
 * @author crazyacking
 */
public class WeiboUrlQueue {
    // 队列中对应最多的超链接数量
    public static final int MAX_SIZE = 10000;
    // 超链接队列
    private static final LinkedList<String> urlQueue = new LinkedList<String>();

    public synchronized static void addElement(String url) {
        urlQueue.add(url);
    }

    public synchronized static void addFirstElement(String url) {
        urlQueue.addFirst(url);
    }

    public synchronized static String outElement() {
        return urlQueue.removeFirst();
    }

    public synchronized static boolean isEmpty() {
        return urlQueue.isEmpty();
    }

    public static int size() {
        return urlQueue.size();
    }

    public static boolean isContains(String url) {
        return urlQueue.contains(url);
    }
}
