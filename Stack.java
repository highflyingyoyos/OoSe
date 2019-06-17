package Uebungsblatt08;

/*
 * erbt von ArrayList, damit die Methoden, welche das Interface List fordert, indirekt implementiert sind
 * 
 * @Peter: frag mal warum wir den ganzen Spökes von wegen Interface erbt von List, machen sollten, sehe den Sinn gerade so gar nich
 */

public class Stack<E> extends java.util.ArrayList<E> implements Structure<E> {

	private StackNode<E> first;

	public Stack(E pData) {
		first = new StackNode<E>(pData);
	}

	public Stack() {

	}

	private class StackNode<E> {
		private E data;
		private StackNode<E> next;

		public StackNode(E pData, StackNode<E> pNext) {
			data = pData;
			next = pNext;
		}

		public StackNode(E pData) {
			data = pData;
		}

		public E getData() {
			return data;
		}

		public StackNode<E> getNext() {
			return next;
		}

		public void setData(E pData) {
			data = pData;
		}

		public void setNext(StackNode<E> pNext) {
			next = pNext;
		}
	}

	public void print() {
		StackNode<E> current = first;
		while (current != null) {
			System.out.print(current.getData() + ", ");
			current = current.getNext();
		}
		System.out.print("\n");
	}

	@Override
	public void push(E pData) {
		StackNode<E> newFirst = new StackNode<E>(pData, first);
		first = newFirst;
	}

	@Override
	public E pop() {
		if (first == null)
			return null;
		E data = first.getData();
		first = first.getNext();
		return data;
	}

	

}
