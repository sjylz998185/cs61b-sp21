package deque;

public class ArrayDeque<Item> {
    private Item[] items = (Item [])new Object[8];

    private int size;

    public ArrayDeque(){
        size = 0;
    }

    public void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        for(int i = 0; i < size ; i++){
            a[i] = items[i];
        }
        items = a;
    }

    public void addLast(Item x){
        if(size == items.length){
            resize(size * 2);
        }
        items[size] = x;
        size++;
    }

    public void addFirst(Item x){
        if(size == items.length){
            resize(size * 2);
        }
        for(int i = items.length ; i != 0 ; i--){
            items[i] = items[i-1];
        }
        items[0] = x;
    }

    public boolean isEmpty(){
        if(items[0] == null) return true;
        else return false;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        if(isEmpty()){
            return ;
        }else{
            for(int i = 0; i < size; i++){
                System.out.println(items[i] + " ");
            }
        }
    }


    public Item removeFirst(Item x){
        if(size < items.length / 4 && size > 4){
            resize(items.length / 4);
        }
        Item first = items[0];
        for(int i = 0 ; i < size ; i++){
            items[i] = items[i+1];
        }
        items[size-1] = null;
        return first;
    }

    public Item removeLast(Item x){
        if(size < items.length / 4 && size > 4) {
            resize(items.length / 4);
        }
        Item last = items[size];
        items[size-1] = null;
        return  last;
    }

    public Item get(int x){
        return items[x];
    }

}
