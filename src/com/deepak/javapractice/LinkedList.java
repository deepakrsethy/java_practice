package com.deepak.javapractice;

public class LinkedList {
	
	public Node head;	
	
	public class Node{
		public int data;
		public Node next;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public LinkedList insert(LinkedList linkedList, int data) {
		Node newNode = new Node(data);
		if(linkedList.head == null) {
			linkedList.head = newNode;
		}else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return linkedList;
	}
	
	public void printLinkedList(LinkedList linkedList) {
		Node currentNode = linkedList.head;
		if(currentNode == null) {
			System.out.println("Empty List");
		}
		while(currentNode!= null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}
	
	public LinkedList insertAtGivenPosition(LinkedList linkedList, int index, int data) throws Exception {
		Node newNode = new Node(data);
		Node currentNode = linkedList.head;
		Node prev = null;
		//case1 : index 0. So the new node will be the head node
		if(index == 0 && currentNode!=null) {
			newNode.next = currentNode;
			linkedList.head = newNode;
		}
		
		//case 2 : index >0 
		int counter =0;
		while(currentNode!=null) {
			if(counter == index) {
				newNode.next = currentNode;
				prev.next = newNode;
				break;
			}else {
				prev = currentNode;
				currentNode = currentNode.next;
				counter++;
			}
		}
		if(currentNode == null) {
			//case 3 : index = size of linkedlist+1
			if(index == counter)
				prev.next = newNode;
			else
				//case 4: index is more than size of linkedlist+1
				throw new Exception("Index exceeds ");
		}
		
		return linkedList;
	}
	
	public LinkedList deleteAtPosition(LinkedList linkedList, int index) throws Exception {
		Node current = linkedList.head;
		Node prev = null;
		
		
		if(current == null) {
			throw new Exception("Empty linkedList");
		}
		
		//Case1 : Delete head Node
		if(current!=null && index ==0) {
			linkedList.head = current.next;
		}
		
		//case2 : Delete at index
		int counter = 0;
		while(current != null) {
			if(index == counter) {
				prev.next = current.next;
				break;
			}else {
				prev = current;
				current = current.next;
				counter++;
			}
		}
		
		//case3 : index exceeds the size of linked list
		if(current == null) {
			throw new Exception("Index exceeds ");
		}
		
		return linkedList;
	}

	public LinkedList findAndDeleteByKey(LinkedList list, int key) {
		
		Node current = list.head;
		Node prev = null;
		if(current == null) {
			System.out.println("Empty List");
		}
		if(current!=null && current.data == key) {
			list.head = current.next;
			System.out.println("Found at deleted");
			return list;
		}
		
		while(current !=null && current.data!=key) {
			prev = current;
			current = current.next;
		}
		
		if(current != null) {
			prev.next = current.next;
			System.out.println("Found at deleted");
		}
		
		if(current == null) {
			System.out.println("Not Found");
		}
		
		return list;
	}
	public static void main(String[] args) {		
		LinkedList linkedList = new LinkedList();
		linkedList = linkedList.insert(linkedList, 10);
		linkedList = linkedList.insert(linkedList, 20);
		linkedList = linkedList.insert(linkedList, 30);
		linkedList = linkedList.insert(linkedList, 40);
		linkedList = linkedList.insert(linkedList, 50);
		System.out.println("Linked list:");
		linkedList.printLinkedList(linkedList);
		
		
		try {
			System.out.println("Linked list after inserting at position:");
			linkedList.insertAtGivenPosition(linkedList, 5, 5);
			linkedList.printLinkedList(linkedList);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Linked list after deleting at position:");
			linkedList.deleteAtPosition(linkedList, 6);
			linkedList.printLinkedList(linkedList);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		linkedList.findAndDeleteByKey(linkedList, 10);
		linkedList.printLinkedList(linkedList);
		
	}
}
