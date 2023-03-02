import java.util.*;

public class MyStack {
	private int count;
	private int items[] = new int[5];

	public void push(int item) {
		if (count == items.length)
			throw new StackOverflowError();
		items[count++] = item;
	}

	public int pop() {
		if (isEmpty())
			throw new IllegalStateException();
		return items[--count] = 0;
	}

	public int length() {
		return count;
	}

	@Override
	public String toString() {
		var content = Arrays.copyOfRange(items, 0, count);
		return Arrays.toString(content);
	}

	public int peek() {
		if (isEmpty())
			throw new IllegalStateException();
		return items[count - 1];
	}

	public boolean contains(int item) {
		for (int i = 0; i < items.length; i++)
			if (items[i] == item)
				return true;
		return false;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.toString()); // [10, 20, 30, 40]
		stack.pop(); // remove the last element(40)
		System.out.println(stack.toString()); // [10,20,30]
		System.out.println(stack.peek()); // 30
		System.out.println(stack.length()); // 3
		System.out.println(stack.contains(40));// flase
	}
}