package datastructures;

public class StackPushPickInLap{
private int stackCapacity ;
private String stackArr[]; 
private int top ;


public StackPushPickInLap(int capacity){

	top = -1;
	stackCapacity = capacity;
	stackArr = new String[stackCapacity];
}


public void push(String com){

//int k = -1;

	System.out.println("Before Pushed element is:" + com);
	

	if(top == stackCapacity -1){
		System.out.println("Stack is full");
		return;
	}
	
	stackArr[++top] = com;
	
	System.out.println("Pushed element is:" + stackArr[top] );
	
}

public String pick(){
	
	String c1 = null;
	
	if(top == -1){
		System.out.println("Stack is empty");
	}
	else{
		c1 = stackArr[top];
		System.out.println("Picked element is:" + c1);
	}
	return c1;
}

/** public String pop(){
	
	int k=stackArr.length -1;
	String c1 = null;
	
	System.out.println("Length of Stack array is:" + k);
	
	if(top == -1){
		System.out.println("Stack is empty");
	}
	else{
		//k=k-1;
		c1 = stackArr[top--];
		System.out.println("Popped element is:" + c1);
	}
	return c1;
}**/


public static void main(String args[]){

	StackPushPickInLap s = new StackPushPickInLap(18);
	s.push("A");
	s.push("B");
	s.push("C");	
	s.push("C2");
	//s.push("C3");
	s.push("D");
	s.push("P");
	s.push("Q");
	s.push("T");
	s.push("T1");
	s.push("W");
	//s.push("X");
	s.push("Y");
	s.push("Z");
	
	//s.pop();
	
	s.pick();
	
}


}