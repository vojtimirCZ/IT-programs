
public class Stack<T> {
	Node<T> head;

	public void push(T t) {
		if (head == null) {
			head = new Node<T>(t);
		} else {
			Node<T> nhead = new Node<T>(t);
			nhead.setNext(head);
			head = nhead;
		}
	}

	public T pop() {
		int size = 0;
		head = head.getNext();
		size--;
		return head.getValue();

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Zadáno:\n");
		Node<T> node = head;
		while (node != null) {
			sb.append(node.getValue());
			sb.append('\n');
			node = node.getNext();
		}
		return sb.toString();
	}
}
