package com.kostyukov;

public class CustomLinkedList implements NodeList
{
	private ListItem root = null;
	
	public CustomLinkedList(ListItem root)
	{
		this.root = root;
	}
	
	@Override
	public ListItem selectRoot()
	{
		return root;
	}
	
	@Override
	public boolean addItem(ListItem item)
	{
		if (root == null)
		{
			root = item;
			return true;
		}
		
		ListItem currentItem = root;
		while (currentItem != null)
		{
			int compare = currentItem.compareTo(item);
			if (compare < 0)
			{
				if (currentItem.nextItem() != null)
				{
					currentItem = currentItem.nextItem();
				}
				else
				{
					currentItem.setNextItem(item);
					item.setPreviousItem(currentItem);
					return true;
				}
			}
			else if (compare > 0)
			{
				if (currentItem.previousItem() != null)
				{
					currentItem.previousItem().setNextItem(item);
					item.setPreviousItem(currentItem.previousItem());
					item.setNextItem(currentItem);
					currentItem.setPreviousItem(item);
				}
				else
				{
					item.setNextItem(root);
					root.setPreviousItem(item);
					root = item;
				}
				return true;
			}
			else
			{
				System.out.println(item.getCurrentItem().toString() + " is already on the list");
				return false;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean removeItem(ListItem item)
	{
		if (item == null)
		{
			System.out.println("Error, nothing to delete");
			return false;
		}
		System.out.println("Deleting " + item.getCurrentItem());
		
		ListItem currentItem = root;
		while (currentItem != null)
		{
			int compare = currentItem.compareTo(item);
			if (compare == 0)
			{
				if (currentItem == root)
				{
					root = currentItem.nextItem();
					root.setPreviousItem(null);
					return true;
				}
				if (currentItem.previousItem() != null)
					currentItem.previousItem().setNextItem(currentItem.nextItem());
				if (currentItem.nextItem() != null)
					currentItem.nextItem().setPreviousItem(currentItem.previousItem());
				return true;
			}
			else if (compare < 0)
			{
				currentItem = currentItem.nextItem();
			}
			else
				break;
		}
		System.out.println("Item " + item.getCurrentItem() + " is not in the list");
		return false;
	}
	
	@Override
	public void traverse(ListItem root)
	{
		if (root == null)
		{
			System.out.println("List is empty");
			return;
		}
		
		while (root != null)
		{
			System.out.println(root.getCurrentItem());
			root = root.nextItem();
		}
	}
}
