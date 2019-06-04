public class DoubleList {

	private DoubleNode current;
	private DoubleNode head;
	private DoubleNode last;

	private class DoubleNode {

		private double value;
		private DoubleNode previous;
		private DoubleNode next;

		public DoubleNode(double pValue, DoubleNode pNext, DoubleNode pPrevious) {
			value = pValue;
			next = pNext;
			previous = pPrevious;
		}

		public DoubleNode(double pValue, DoubleNode pNext) {
			value = pValue;
			next = pNext;
		}

		public DoubleNode(double pValue) {
			value = pValue;
		}

		public DoubleNode(DoubleNode pNext) {
			next = pNext;
		}

		public void setNext(DoubleNode pNext) {
			next = pNext;
		}

		public void setPrevious(DoubleNode pPrevious) {
			next = pPrevious;
		}

		public void setValue(double pValue) {
			value = pValue;
		}

		public DoubleNode getNext() {
			return next;
		}

		public DoubleNode getPrevious() {
			return previous;
		}

		public double getValue() {
			return value;
		}
	}

	public DoubleList() {

	}

	public DoubleList(DoubleNode pHead) {
		head = pHead;
		last = head;
		current = head;
	}

	public void add(double pValue) {
		DoubleNode node = new DoubleNode(pValue);

		last.setNext(node);
		node.setPrevious(last);
		last = node;

	}

	public void insertFirst(double pValue) {
		DoubleNode toInsert = new DoubleNode(pValue, head);
		head.setPrevious(toInsert);
		head = toInsert;

	}

	public void insert(double pValue, int pN) {
		setCurrent(pN);

		DoubleNode toInsert = new DoubleNode(pValue, current.getNext(), current.getPrevious());
		current.setNext(toInsert);
		toInsert.getNext().setPrevious(toInsert);
	}

	public double get(int pN) {
		setCurrent(pN);

		return getCurrent();
	}

	public void remove(int pN) {
		setCurrent(pN);

		current.getPrevious().setNext(current.getNext());
		current.getNext().setPrevious(current.getPrevious());
		current = current.getNext();
	}

	public double getCurrent() {
		return current.getValue();
	}

	public void setCurrent(int pN) {
		current = head;

		if (pN >= 0) {
			for (int i = 0; i < pN; i++) {
				if (current.getNext() != null) {
					current = current.getNext();
				} else {
					setCurrent(pN - i);
				}
			}

		} else {
			current = last;

			for (int i = -1; i > pN; i--) {
				if (current.getPrevious() != null) {
					current = current.getPrevious();
				} else {
					setCurrent(pN - i);
				}
			}

		}
	}

	public String toString() {
		StringBuilder retString = new StringBuilder();
		if (head == null)
			return retString.toString();
		else {
			current = head;
			retString.append(current.getValue());
			while (current.getNext() != null) {
				current = current.getNext();
				retString.append(";");
				retString.append(current.getValue());
			}
			return retString.toString();
		}
	}

}
