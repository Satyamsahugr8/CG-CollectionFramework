package com.CollectionsFramework;

import java.util.*;

public class AddzeroinputN {
	
	public ArrayList<Integer> makeArrayListInt(int n){
		List <Integer> list = new ArrayList<>();
		for(int i=0 ; i<n ; i++){
			list.add(0);
		}
		return (ArrayList<Integer>) list;
	}
	
	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		
		Collections.reverse(list);
		return (ArrayList<Integer>) list;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		for(int i=0 ; i<list.size(); i++){
			if( list.get(i)==m ){ 
				list.remove(i);
				list.add(i,n);
			}
		}
	
		return list;
	}






	public static void main(String[] args) {
	       
		   AddzeroinputN e = new AddzeroinputN();
		   System.out.println(e.makeArrayListInt(6));
		   
		   ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		   System.out.println(e.reverseList(list));
		   
		   System.out.println(e.changeList(list, 28, 20));
		    
		}

	}


