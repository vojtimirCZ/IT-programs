
public class Queue<T> {
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
		if (head == null)
			return null;
		Node<T> last = head;// nalezení posledního prvku
		while (last.getNext() != null)
			last = last.getNext();
		Node<T> beforeLast = head;// nalezení pøedposledního prvku
		if (last != head) {
			while (beforeLast.getNext() != last)
				beforeLast = beforeLast.getNext();
		}
		beforeLast.setNext(null);// smaž napojení pøedposledního prvku na poslední
		return last.getValue();

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Objednáno:\n");
		Node<T> node = head;
		while (node != null) {
			sb.append(node.getValue());
			sb.append('\n');
			node = node.getNext();
		}
		return sb.toString();
	}

}
