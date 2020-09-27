package com.kostyukov;

public abstract class ListItem
{
	protected ListItem previousItem = null;
	protected ListItem nextItem = null;
	protected Object currentItem;
	
	abstract ListItem nextItem();
	abstract ListItem setNextItem(ListItem item);
	abstract ListItem previousItem();
	abstract ListItem setPreviousItem(ListItem item);
	abstract int compareTo(ListItem item);
	
	public ListItem(Object item)
	{
		currentItem = item;
	}
	
	public Object getCurrentItem()
	{
		return currentItem;
	}
	
	public void setCurrentItem(Object currentItem)
	{
		this.currentItem = currentItem;
	}
}
