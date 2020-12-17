package skiplist;

/**
 * @description:
 * @author: hbh
 * @time: 2020/12/16 13:08
 */
// 跳表
public class SkipList {
    private static final int  MAX_LEVEL=16;
}


class Node{
    private static final int MAX_LEVEL =16 ;
    private int data;
    private Node[] forwards=new Node[MAX_LEVEL];
    private int maxLevel;
}
