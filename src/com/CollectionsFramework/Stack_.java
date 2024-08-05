package com.CollectionsFramework;

import java.util.Stack;

public class Stack_ {

	public static void main(String[] args) {

		
		Stack <String> Stack = new Stack<>();
		Stack.push("satyam");
		Stack.push("satya");
		Stack.push("saty");
		Stack.push("sat");
		Stack.push("sa");
		
		System.out.println(Stack);
		System.out.println(Stack.peek());
		Stack.pop();
		System.out.println(Stack.peek());
		Stack.pop();
		
//		System.out.println(" ");
		System.out.println(Stack);
		
	    // using foreach 
		for(String element : Stack) {
			System.out.print(element+",");
		}
		
		System.out.println(Stack.toArray());

	    Stack <Integer> Stack1 = new Stack<>();
	    Stack1.push(21);
	    Stack1.push(211);
	    Stack1.push(212);
	    Stack1.push(211);
	    Stack1.push(212);
	    Stack1.push(212);
	    System.out.println(Stack1);
	    
	    Stack1.pop();
	    System.out.println(Stack1);
	    
	    
	    
	    
	    
	}

}
