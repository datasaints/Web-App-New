package com.datasaints.dao;

import java.util.ArrayList;

import com.datasaints.domain.Item;

public interface ItemDao {
	public boolean addItem(Item item);
	
	public boolean updateLocation(String id, String newLocation);

	public boolean deleteItem(String id);
	
	public Item getItem(String id);
	
	// public ArrayList<Item> findItem(Item toFind);
	
	public int getItemCount(int whatToGet);
	
	public int getItemCount(String location, int whatToGet);

}
