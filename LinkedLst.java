import java.util.*;
public class LinkedLst
{
	Node head;//Head of list
	public static class Node
	{
		
		private int data;
		private Node next;
		public Node(int n)
		{
			data=n;
			next=null;
		}

	}
	public static LinkedLst insertAtBeg(LinkedLst list,int n)
	{
		Node newer=new Node(n);
		if(list.head==null)
			list.head=newer;
		else
		{
			newer.next=list.head;
			list.head=newer;
		}
		return(list);
	}
	public static LinkedLst insertAtEnd(LinkedLst list,int n)
	{
		Node newer=new Node(n);
		if(list.head==null)
		{
			list.head=newer;
		}
		else
		{
			Node current=list.head.next;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newer;
		}
		return list;
	}
	public static LinkedLst insertAt(LinkedLst list,int pos,int n)
	{
		Node newer=new Node(n);
		Node current=list.head;
		for(int i=1;i<pos-1;i++)
		{
			current=current.next;
		}
		newer.next=current.next;
		current.next=newer;
		return list;
	}
	public static LinkedLst deleteList(LinkedLst list,int pos)
	{
		Node current=list.head;//First Node
		for(int i=2;i<pos;i++)
		{
			current=current.next;
		}
		current.next=current.next.next;
		return list;
	}
	public static void printList(LinkedLst list)
	{
		Node current=list.head;
		while(current.next!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}

public static void main(String[] args)
{
	LinkedLst list=new LinkedLst();
	list=insertAtBeg(list,7);
	list=insertAtBeg(list,8);
	list=insertAtBeg(list,10);
	list=insertAtEnd(list,6);
	list=insertAtEnd(list,5);
	list=insertAtEnd(list,4);
	list=insertAt(list,2,9);
	deleteList(list,7);
	printList(list);


}
}