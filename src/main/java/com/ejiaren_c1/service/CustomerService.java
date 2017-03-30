package com.ejiaren_c1.service;

import java.util.Map;

import com.ejiaren_c1.comment.BootResult;
import com.ejiaren_c1.pojo.TCustomer;

public interface CustomerService {
	TCustomer geTbItemById(String itemId);
	BootResult getItemList(int page,int rows);
	BootResult getItemListByCustname(Map<String, String> search_map);
//	BootResult addCustomer(Map<String, String> customer_info);
	BootResult addCustomer(TCustomer customer);
	void customerEdit(TCustomer customer);
	BootResult customerDelete(String itemId);
}
