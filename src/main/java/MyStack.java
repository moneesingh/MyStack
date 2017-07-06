import java.util.EmptyStackException;

public class MyStack<E> {
	
	Node<E> top;
	Node <E> node;
	int max;
	int count = 0;
	
	MyStack (int max) {
		this.max = max;
	}
	
	class Node<E> {
		Node<E> next;
		E val;
		
		Node (E v) {
			next = null;
			val = v;
		}
		
		E getVal() {
			return val;
		}
	}
	
	public Node<E> pop() {
		if (top!=null) {
			Node<E> temp = top;
			top = top.next;
			count--;
			return temp;
		}
		else {
			throw new EmptyStackException();
		}
	}
	
	public void push(Node<E> n) {
		if (count < max) {
			if (top == null) {
				n.next = null;
			} else {
				n.next = top;
			}
			count++;
			top = n;
			System.out.println("Pushed: " + n.val);
		} else {
			throw new StackOverflowError("Stack is full");
		}
	}
}