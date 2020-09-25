package com.kostyukov;

public abstract class ListItem
{
	private Object previousItem;
	private Object nextItem;
	private Object currentItem;
	
	public abstract void moveToNextItem();
	
	public abstract void moveToPreviousItem();
	
	public abstract void addItem(Object item);
	
	public abstract void removeItem(Object item);
	
	public abstract int compareTo(Object item);
	
	public ListItem(Object item)
	{
		currentItem = item;
	}
}
