package addon_DSA;

public class Stack {
	int mystack[]=new int[5];
	int top =-1;
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("stack overflow");
		}
		else
		{
			mystack[++top]=num;
		}
	}
	public void pop()
	{
		if(top<0) {
			System.out.println("understack");
	
		}
		else
		{
			System.out.println(mystack[top]+"popped out");
			--top;
		}
	}
		public void display() {
	    for(int i=0;i< mystack.length;i++) {
	    System.out.print(mystack[i]+" ");
		}
		}
public static void main(String[]args){
   Stack s=new Stack();	
   s.push(2);
   s.push(5);
   s.push(7);
   s.push(8);
   s.push(9);
  
   s.display();
   s.pop();
   s.display();
	    {
	    	
		
			
		}
		
	}

}
