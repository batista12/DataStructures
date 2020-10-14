public class MyNode<k> {
	private k key;
	private MyNode next;
	public MyNode(k key) {
		this.key=null;
		this.next=null;
	}
	public MyNode getNext() {
		return next;
	}
	public void setNext(MyNode next) {
		this.next=next;
	}

}
