package com.kostyukov;

public class Node extends ListItem
{
	@Override
	ListItem nextItem()
	{
		return this.nextItem;
	}
	
	@Override
	ListItem setNextItem(ListItem item)
	{
		this.nextItem = item;
		return this.nextItem;
	}
	
	@Override
	ListItem previousItem()
	{
		return this.previousItem;
	}
	
	@Override
	ListItem setPreviousItem(ListItem item)
	{
		this.previousItem = item;
		return previousItem;
	}
	
	@Override
	int compareTo(ListItem item)
	{
		if (item != null)
			return ((String) super.getCurrentItem()).compareTo((String) item.getCurrentItem());
		else
			return -1;
	}
	
	public Node(Object item)
	{
		super(item);
	}
}