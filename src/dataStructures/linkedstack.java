package dataStructures;

 class linkedstackNode {
	
	linkedstackNode next;
	int num,info;
	public linkedstackNode(int el) {
		this(el, null);
		
	}

	public linkedstackNode(int el, linkedstackNode n) {
		info=el;
		next=n;
		
	}
}

public class linkedstack{
	
	linkedstackNode head;
	
	public linkedstack() {
		head=null;
	}
	public void insert(int el)
	{
		if (head==null) {
			head=new linkedstackNode(el);
			
		}
		else
		{
			head=new linkedstackNode(el,head);
			
		}
	}
	

	public int pop()
	{
		
		int temp=head.info;
		
		head=head.next;
		
		return temp;
	}
	
	
	public int peek()
	{
		int temp=head.info;
		return temp;
	}
	
	public static void main(String[] args) {
		
		linkedstack list= new linkedstack();
		list.insert(10);
		list.insert(20);
		System.out.println(list.peek());
		System.out.println(list.pop());
		System.out.println(list.peek());
		
	}
	
}
