package deque;

public class LinkedListDeque<Item> {
//    the implementation of list
    /*list node*/
    private static class IntNode<Item>{
        private IntNode prev;
        private IntNode next;
        private Item item;
        public IntNode(IntNode p, Item i , IntNode n){
            prev = p;
            item = i;
            next = n;
        }
    }


    /*this is sentinel */
    private IntNode sentinel;

    private int size;

    public LinkedListDeque(Item x){
        IntNode first = new IntNode(sentinel,x,sentinel);
        sentinel.next = first;
        sentinel.prev = first;
        size = 1;
    }

    public LinkedListDeque(){
        size = 0;
        sentinel = new IntNode(null,null,null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }



//    start of insert operation
    public void addFirst(Item x){
        /* set new IntNode*/
        IntNode elem = new IntNode(sentinel, x, sentinel.next);
        /* change link point */
        /*
        assign knowledge
        * 1. the process of evaluation , this is address bit.
        * 2. assignment changes the content of this frame.
        *
        * */
        /*change value of the later node*/
        sentinel.next.prev = elem;
        /*change value of the former node*/
        sentinel.next = elem;
        size++;
    }

    public void addLast(Item x){
        IntNode elem = new IntNode(sentinel.prev,x,sentinel);
        sentinel.prev.next = elem;
        sentinel.prev = elem;
        size++;
    }
//    end of insert operation



//    test if it is empty
    public boolean isEmpty(){
        if(this.size == 0) return true;
        else return false;
    }



//    get size
    public int size(){
        return size;
    }



//    start of get operation
    public Item get(int index){
        /*when we using this frame , we must assign Item type into this frame*/
        IntNode<Item> p = this.sentinel;

        if(index == 0){
            return  (Item)this.sentinel.next.item;
        }

        if(index > this.size){
            return null;
        }

        for(int i = 1; i < index ; i++){
            if(p.next == null){
                return null;
            }
            p = p.next;
        }

        return p.item;
    }

//    end of the get operation


//    print element of this list
    public void printDeque(){
        for(int i = 0; i < this.size; i++){
            Item val = this.get(i);
            System.out.println(val +  " ");
        }
    }

//    start of remove operation
    public Item removeFirst(){
        if(size == 0){
            return null;
        } else {
            IntNode ele = this.sentinel.next;
            this.sentinel.next.next.prev = this.sentinel;
            this.sentinel.next = this.sentinel.next.next;
            size--;

            return (Item) ele.item;
        }
    }

    public Item removeLast(){
        if(size == 0){
            return null;
        }
        IntNode ele = this.sentinel.prev;
        this.sentinel.prev.prev.next = this.sentinel;
        this.sentinel.prev = this.sentinel.prev.prev;
        size--;
        return (Item)ele.item;
    }
//    end of remove operation



}
