package deque;

public class ArrayDeque<Item> implements MaxArrayDeque<Item> {
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

    @Override
    public void addLast(Item x){
        if(size == items.length){
            resize(size * 2);
        }
        items[size] = x;
        size++;
    }

    @Override
    public void addFirst(Item x){
        if(size == items.length){
            resize(size * 2);
        }
        for(int i = items.length ; i != 0 ; i--){
            items[i] = items[i-1];
        }
        items[0] = x;
    }

    @Override
    public boolean isEmpty(){
        if(items[0] == null) return true;
        else return false;
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void printDeque(){
        if(isEmpty()){
            return ;
        }else{
            for(int i = 0; i < size; i++){
                System.out.println(items[i] + " ");
            }
        }
    }


    @Override
    public Item removeFirst(){
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

    @Override
    public Item removeLast(){
        if(size < items.length / 4 && size > 4) {
            resize(items.length / 4);
        }
        Item last = items[size];
        items[size-1] = null;
        return  last;
    }

    @Override
    public Item get(int x){
        return items[x];
    }

}
