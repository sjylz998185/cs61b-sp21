package deque;

public interface MaxArrayDeque<Item> {
    public void addFirst(Item item);

    public void addLast(Item item);

    default public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        else return false;
    }

    public int size();

    public void printDeque();

    public Item removeFirst();

    public Item removeLast();

    public Item get(int index);







}
