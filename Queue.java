public class Queue<T> extends LinkedList<T>{
    // use a linkedlist 
    // to implement this class
    private LinkedList<T> list;
    public Queue(){
        this.list = new LinkedList<T>();
    }
    public void insert(T t){
        list.add(t);
    }

    public void delete(){
        list.pollLast();
    }
}

