
import java.util.NoSuchElementException;
public class LinkedStack implements Stack {
    private Node top;
    private int size;

    public boolean isEmpty() {
        return (size == 0);
    }

    public Object peek() {

        if (size == 0)
            throw new NoSuchElementException();
        return top.object;
    }

    public Object pop() {
        if (size == 0)
            throw new NoSuchElementException();
        Object oldTop = top.object;
        top = top.next;
        --size;
        return oldTop;
    }
    public  Object bottom() {
        if (size == 0)
            throw new NoSuchElementException();
        Node p = top;
        while(p.next != null )
            p = p.next;
        return p.object;
    }

    public void push(Object object) {
        top = new Node(object, top);
        ++size;
    }

    public int size() {
        return size;

    }
    public String toString() {
        if (size == 0)
            return "()";
        StringBuilder sb = new StringBuilder("("+top.object);
        for (Node p = top.next; p != null; p = p.next)
            sb.append("," + p.object);
        return sb + ")";
    }

    public Object[] toArray() {
        Object[] a = new Object[size];
        int i = 0;
        for (Node p = top; p != null; p = p.next)
            a[i++] = p.object;
        return a;
    }

    private static class Node {
        Object object;
        Node next;

        Node(Object object, Node next) {
            this.object = object;
            this.next = next;
        }
    }
}
