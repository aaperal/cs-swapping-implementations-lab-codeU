package com.flatironschool.javacs;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class ListClientExample {
	private ArrayList list;
	
	public ListClientExample() {
		list = new List();
	}

	public List getList() {
		return list;		
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		System.out.println(list);
	}
}
