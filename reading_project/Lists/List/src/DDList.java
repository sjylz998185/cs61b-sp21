public class SLList {
    public static class IntNode{
        public int item;
        public IntNode next;
        private IntNode prev;

        public IntNode(int i, IntNode n, IntNode p){
            item = i;
            next = n;
            prev = p;
        }
    }
    private IntNode first ;
    private IntNode last;

    private IntNode sentinel = new IntNode(0,null,null);
    private int size;
    public SLList(int x){
        first = new IntNode(x, sentinel,sentinel);
        sentinel.next = first;
        sentinel.prev = first;
        size = 1;
    }

    public void addFirst(int x){
        IntNode temp = first;
        first = new IntNode(x, sentinel , first);
        temp.prev = first;
        sentinel.next = first;
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

    public void addLast(int x) {
        size += 1;
        IntNode temp = last;
        last = new IntNode(x,sentinel,last);
        temp.next = last;
        sentinel.next = last;
    }

    public void removeLast(){
        size--;


    }
}
