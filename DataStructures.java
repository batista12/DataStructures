package com.capgemini.linkedlist;
public class MyLinkedList<k> {
public INode<k> head;
public INode<k> tail;
private int size;

public MyLinkedList(){
	this.head=null;
	this.tail=null;
}



public void add(INode<k> newNode) {
	if(this.head==null) {
		this.head=newNode;
	}
	if(this.tail==null) {
		this.tail=newNode;
	}else {
		INode<k> temp=this.head;
		this.head=newNode;
		this.head.setNext(temp);
	}
	
}

public void printMyNodes() {
	INode<k> node=this.head;
	if(node!=null) {
		System.out.println("List: "+node.getKey());
		while((node=node.getNext())!=null) {
			System.out.println("->"+node.getKey());
		}
	}

}

public static void main(String[] args) {
	MyLinkedList<Integer> list=new MyLinkedList<Integer>();
	MyNode<Integer> node3=new MyNode<Integer>(70);
	list.add(node3);
	MyNode<Integer> node2=new MyNode<Integer>(30);
	list.add(node2);
	MyNode<Integer> node1=new MyNode<Integer>(56);
	list.add(node1);
	list.printMyNodes();
}
}

interface INode<k>{
k getKey();
void setKey(k key);
INode<k> getNext();
void setNext(INode<k> next);
}

class MyNode<k> implements INode<k>{
private k key;
private MyNode<k> next;
public MyNode(k key) {
	super();
	this.key = key;
	this.next = null;
}
public k getKey() {
	return key;
}
public void setKey(k key) {
	this.key = key;
}
public MyNode<k> getNext() {
	return next;
}
public void setNext(INode<k> next) {
	this.next = (MyNode<k>) next;
}

}
