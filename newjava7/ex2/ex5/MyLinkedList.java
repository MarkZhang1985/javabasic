package newjava7.ex2.ex5;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @Auther: zhangkaiming
 * @Date: 2018/8/8
 * @Description:
 * 第五题LinkedList练习题
 * 自实现简单的MyLinkedList集合
 * 创建Node内部类
 * Node 创建属性:
 * Node prev
 * Object item
 * Node next
 * 为Node创建构造器给属性初始化的构造器。
 * 使用递归的方法创建
 * nodeAdd(int index，Object obj)方法
 * nodeUpdate(Object obj)方法
 * nodeRemove(int index)方法
 * nodeFind(int index)方法
 * 创建first和last属性，类型为Node，存放第一和最后一个节点。并且创建
 * Add（）方法添加
 * Update（）方法修改
 * Remove()方法删除
 * Find（）方法查询
 */
public class MyLinkedList {

    //成员变量
    private int size;
    Node first;
    Node last;


    //内部类：节点
    private static class Node{
        //成员变量
        Node prev;
        Object item;
        Node next;

        //构造方法
        public Node(Node prev, Object item, Node next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }

        //这里重写toString方法，会互相调用，形成死循环
//        @Override
//        public String toString() {
//            return "Node{" +
//                    "prev=" + prev +
//                    ", item=" + item +
//                    ", next=" + next +
//                    '}';
//        }
    }


    //成员方法
    // * nodeAdd(int index，Object obj)方法
    // * nodeUpdate(Object obj)方法
    // * nodeRemove(int index)方法
    // * nodeFind(int index)方法

    //增加节点
    //访问方法，不提供index值，添加到集合末尾
    public void add(Object obj) {
        if (isFirst()) {
            addFirst(obj);
            return;
        }
        addLast(obj);//添加到末尾
    }
    //提供index值，添加到index位
    public void add(int index, Object obj){
        if(index > size + 1 || index <= 0){
            System.out.println("输入值应在数组长度范围内。");
        }
        if(isFirst()){
            addFirst(obj);
            return;
        }
        //若集合不为空
        //向集合末尾+1添加元素
        if(index == size + 1){
            addLast(obj);
            return;
        }
        //向集合其他位置添加
        nodeAdd(index, obj, first);

    }
    //判断当前集合是否为空
    private boolean isFirst(){
        return first == null;
    }
    //作为第一个元素增加
    private void addFirst(Object obj){
        first = new Node(null, obj, null);
        last = first;
        size++;
    }
    //将obj添加到集合末尾+1位置
    private void addLast(Object obj){
        Node temp = new Node(last, obj,null);
        last.next = temp;
        last = temp;
        size++;
    }
    //将obj增加至index位，利用递归实现
    private void nodeAdd(int index, Object obj, Node node){

        if(index > 1){
            nodeAdd(index - 1, obj, node.next);
        }

        if(first == last){//集合只有一个元素，在之前添加
            first = new Node(null, obj, last);
            last.prev = first;
            size++;
            return;
        }
        if(node == first){//在多元素集合的第一位插入
            Node temp = new Node(null, obj, first);
            first.prev = temp;
            first = temp;
            size++;
            return;
        }
        if(node == last){//在多元素集合的最后一位插入
            Node temp = new Node(last, obj, null);
            last.next = temp;
            last = temp;
            size++;
            return;
        }
        //在多元素之中插入
        System.out.println(node.item);
        Node temp = new Node(node.prev, obj, node);
        node.prev.next = temp;
        node.prev = temp;
        System.out.println(""+temp.prev.item+temp.item +temp.next.item );
        size++;
    }



    //打印所有元素
    public void showAll(MyLinkedList myLinkedList){
        Node node = myLinkedList.first;
        System.out.print("first:" + node.item);
        System.out.println("\tsize:" + myLinkedList.size);
        for(int i = 0; i<myLinkedList.size; i++){
            System.out.print(node.item);
            System.out.print("\t");
            node = node.next;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                "\n, first=" + "Node{" + "prev=" + first.prev + ", item=" + first.item + ", next=" + first.next + '}'+
                "\n, last=" + "Node{" + "prev=" + last.prev + ", item=" + last.item + ", next=" + last.next + '}' +
                '}';
    }

    @Test
    public void test01(){
        MyLinkedList myLinkedList = new MyLinkedList();
        //自动向集合尾部添加
        myLinkedList.add("a");
        showAll(myLinkedList);
        //自动向集合尾部添加
        myLinkedList.add("b");
        showAll(myLinkedList);
        //自动向集合尾部添加
        myLinkedList.add("c");
        showAll(myLinkedList);
        //向集合头部添加
        myLinkedList.add(1,"A");
        showAll(myLinkedList);
        //向集合长度+1添加
        myLinkedList.add(myLinkedList.size+1,"d");
        showAll(myLinkedList);

        myLinkedList.add(2,"B");
        showAll(myLinkedList);

        //System.out.println(myLinkedList);
        //System.out.println(myLinkedList.size);
        //myLinkedList.add(myLinkedList.size,"d");
        //System.out.println(myLinkedList);
    }

}
