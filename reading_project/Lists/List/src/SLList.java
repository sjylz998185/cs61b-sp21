public class SLList {
    public static class IntNode{
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;

        }
    }
    private IntNode first ;
    private IntNode sentinel = new IntNode(0,null);
    private int size;
    public SLList(int x){
        first = new IntNode(x, null);
        sentinel.next = first;
        if(first != null)
        size++;
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
        size++;
    }

    public int getFirst(){
        if(this == null) {
            System.out.println("this is empty list");
            return 0;
        }
        return first.item;
    }

    public int size(){
        if(this == null) {
            System.out.println("this is empty list");
            return 0;
        }
        IntNode p = this.first;
        int count = 0;
        while(p.next != null){
            p = p.next;
            count++;
        }
        return count;
    }

/*    *//* it is method of SLList , but its first is ListNode
    different type can't recursion *//*
    private int sizeRec() {
        IntNode m = this.first;
        if (m == null) {
            return 1;
        }
        *//*SLList is wrapper of the first IntNode, so we don't use sizeRec*//*
        return 1 + m.sizeRec();
    }*/

    /*but we can to set methods about IntNode*/
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }

        return 1 + size(p.next);
    }

    public int sizeRec(){
        if(this == null) {
            System.out.println("this is empty list");
            return 0;
        }
        return size(this.first);
    }

    public int sizeProp(){
        if(this == null) {
            System.out.println("this is empty list");
            return 0;
        }
        return size;
    }

    public void addLast(int x){
        IntNode p = first;

        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

}
