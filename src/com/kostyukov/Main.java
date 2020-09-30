package com.kostyukov;

public class Main
{
	public static void main(String[] args)
	{
		CustomLinkedList linkedList = new CustomLinkedList(null);
		
		String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
		
		String[] data = stringData.split(" ");
		for (String s : data)
		{
			linkedList.addItem(new Node(s));
		}
		
		linkedList.traverse(linkedList.selectRoot());
		
		linkedList.removeItem(new Node("Adelaide"));
		
		linkedList.traverse(linkedList.selectRoot());
		
		linkedList.removeItem(new Node("Default City"));
	}
}
