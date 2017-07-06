import org.junit.Assert;
import org.junit.Test;

public class TestStack {

	@Test
	public void testIntegerStack() {
		int max = 5;
		int initialVal = 20;
		MyStack <Integer> s = new MyStack<Integer>(max);
		for (int i = 0; i< max; i++) {
			MyStack<Integer>.Node<Integer> n = s. new Node<Integer>(i+initialVal);
			s.push(n);
		}
		int val = 0;
		for (int i = 0; i< max; i++) {
			val = s.pop().getVal();
			System.out.println("Popped: " + val);
		}
		Assert.assertEquals(val, initialVal);
	}
	
	
	@Test
	public void testIntegerStackException() {
		int max = 5;
		MyStack <Integer> s = new MyStack<Integer>(max);
		try {
			for (int i = 0; i< max+1; i++) {
				MyStack<Integer>.Node<Integer> n = s. new Node<Integer>(i+20);
				s.push(n);
			}
		} catch (StackOverflowError e) {
			String expectedMessage = "Stack is full";
			Assert.assertEquals( "Exception message must be correct", expectedMessage, e.getMessage() );
		}
	}
	
	@Test
	public void testStringStack() {
		int max = 5;
		String initialVal = "Hello";
		MyStack <String> s = new MyStack<String>(max);
		for (int i = 0; i< max; i++) {
			MyStack<String>.Node<String> n = s. new Node<String>(initialVal + i);
			s.push(n);
		}
		String val = initialVal + "0";
		String actual = "";
		for (int i = 0; i< max; i++) {
			actual = s.pop().getVal();
			System.out.println("Popped: " + actual);
		}
		Assert.assertEquals(val, actual);
	}
}
