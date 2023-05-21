package chapter18;

public class Box<T> {
    T[] n;
    public Box(T[] n) {
        this.n = n;
    }
    public T get(int i) {
        if (i < 0 || i >= n.length) return null;
        return n[i];
    }
}
