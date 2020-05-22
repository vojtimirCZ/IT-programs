
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
		Node<T> last = head;// nalezen� posledn�ho prvku
		while (last.getNext() != null)
			last = last.getNext();
		Node<T> beforeLast = head;// nalezen� p�edposledn�ho prvku
		if (last != head) {
			while (beforeLast.getNext() != last)
				beforeLast = beforeLast.getNext();
		}
		beforeLast.setNext(null);// sma� napojen� p�edposledn�ho prvku na posledn�
		return last.getValue();

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Objedn�no:\n");
		Node<T> node = head;
		while (node != null) {
			sb.append(node.getValue());
			sb.append('\n');
			node = node.getNext();
		}
		return sb.toString();
	}

}
