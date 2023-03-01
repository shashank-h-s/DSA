
import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            var previous = getprevious(last);
            last = previous;
            last.next = null;

        }
        size--;
    }

    private Node getprevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

    public int sizeIs() {
        return size;
    }

    public int[] toArray() {
        int[] arr = new int[size];
        int index = 0;
        var current = first;
        while (current != null) {
            arr[index++] = current.value;
            current = current.next;
        }
        return arr;
    }

    public void reverse() {
        if (isEmpty())
            return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthNodeElement(int k) {
        if (isEmpty())
            throw new IllegalArgumentException();
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.removeLast();
        list.addFirst(10);
        System.out.println(list.contains(40));
        System.out.println(list.sizeIs());
        System.out.println(list.indexOf(30));
        int[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));
        list.reverse();
        int[] reverseLinkeList = list.toArray();
        System.out.println(Arrays.toString(reverseLinkeList));
        // kth node means
        // k=1 means last element of linkedlist
        // k=2 means last second element of linkedlist
        System.out.println(list.getKthNodeElement(1));
        System.out.println(list.getKthNodeElement(3));
    }
}
