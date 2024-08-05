package com.CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue_ {

	public static void main(String[] args) {
		
		Queue <Integer> que = new PriorityQueue<>();
		que.add(22);
		que.add(2);
		que.add(332);
		
		System.out.println(que);
		
		que.remove();
		System.out.println(que);
		
		que.remove();
		System.out.println(que);
		
		
		

	}

}
