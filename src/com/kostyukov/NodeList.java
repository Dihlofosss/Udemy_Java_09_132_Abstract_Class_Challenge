package com.kostyukov;

public interface NodeList
{
	ListItem selectRoot();
	boolean addItem(ListItem item);
	boolean removeItem(ListItem item);
	void traverse(ListItem root);
}
