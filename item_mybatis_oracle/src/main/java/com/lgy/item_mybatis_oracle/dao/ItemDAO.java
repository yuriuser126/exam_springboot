package com.lgy.item_mybatis_oracle.dao;

import java.util.ArrayList;

import com.lgy.item_mybatis_oracle.dto.ItemDTO;

//public class ItemDAO {
public interface ItemDAO {
	public void write(String name, String price, String description);
	public ArrayList<ItemDTO> list();
	
}
