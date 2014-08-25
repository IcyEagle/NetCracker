public class Boxter {

    public static void main(String[] args) {
        Box<Number> nBox = new BoxImpl<Number>();
        Box<Integer> iBox = new BoxImpl<Integer>();

        nBox.put(iBox); //will this compile, or you will get an error during execution??
    }
}

interface Box<T> {
    public T get();

    public void put(T element);

    public void put(Box<T> box);
}

class BoxImpl<T> implements Box<T> {
    // ...
}