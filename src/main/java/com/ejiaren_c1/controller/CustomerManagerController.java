package com.ejiaren_c1.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejiaren_c1.comment.BootResult;
import com.ejiaren_c1.pojo.TCustomer;
import com.ejiaren_c1.service.CustomerService;
import com.ejiaren_c1.utils.Constants;
import com.ejiaren_c1.utils.UtilsTool;

@Controller
public class CustomerManagerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/tables")
	// @ResponseBody
	public String item_list(Model model, @RequestParam(required = false, defaultValue = "1") Integer page,
			@RequestParam(required = false, defaultValue = "20") Integer rows) {
		model.addAttribute("list", customerService.getItemList(page, rows));
		return "tables";
		// System.out.println(customerService.getItemList(page,rows).getRows().size());
		// BootResult bootResult = customerService.getItemList(page, rows);
		// return bootResult;
	}

	@RequestMapping("/login")
	public String login(){
		return "login";
	}

	@RequestMapping("/find")
	public String findByCustname(Model model, HttpServletRequest request) {
		
		Map<String, String> map = new HashMap<String, String>();
		Enumeration<?> paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName = (String) paramNames.nextElement();

			String[] paramValues = request.getParameterValues(paramName);
			if (paramValues.length == 1) {
				String paramValue = paramValues[0];
				if (paramValue.length() != 0) {
					map.put(paramName, paramValue);
				}
			}
		}

		model.addAttribute("list", customerService.getItemListByCustname(map));
		return "tables";
	}

	@RequestMapping("/add_customer_infos")
	public String add_customer_infos(Model model, TCustomer customer) {

		System.out.println(customer.getCustname() + ":" + customer.getCustomerphone());
		if (customer.getId() == null) {
			customer.setId(UUID.randomUUID().toString().replace("-", ""));
			customer.setAlert(0);
			customer.setCustomertime(UtilsTool.getTimer());
		}
		model.addAttribute("list", customerService.addCustomer(customer));
		
		return "redirect:/tables";
	}
	
	@RequestMapping(value="/show_customer/{customer_id}")
	public String show_customer(@PathVariable String customer_id, Model model) {
		System.out.println("要修改的用户id为:" + customer_id);
		model.addAttribute("customer", customerService.geTbItemById(customer_id));
		model.addAttribute("map", Constants.customer_level_map);
		model.addAttribute("intent_time_map", Constants.customer_intent_time);  
		model.addAttribute("customer_level", Constants.customer_level);  
		model.addAttribute("customer_language", Constants.customer_language);  
		model.addAttribute("customer_intent_degree", Constants.customer_intent_degree); 
		return "customer_edit";
	}
	
	
	
	
	@RequestMapping("/edit_customer_infos")
	public String edit_customer_infos(Model model,TCustomer customer) {
		
		System.out.println(customer.getCustname()); 
		System.out.println(customer.getCustomeraddress()); 
		
		customerService.customerEdit(customer);
		model.addAttribute("list", customerService.getItemList(1, 20)); 
		
		return "redirect:/tables";
	}
	
	@RequestMapping("/delete_customer/{customer_id}")
	public String delete_customer(@PathVariable String customer_id, Model model) {
		System.out.println("要删除的用户id为:" + customer_id);
		model.addAttribute("list", customerService.customerDelete(customer_id));
		return "redirect:/tables";
	}
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		BootResult bootr = customerService.getItemList(1, 20);
//		request.getSession().setAttribute("leftview_type_arrList", Constants.public_lift_view_type);
		request.getSession().setAttribute("customer_count", bootr.getTotal());
		return "index";
	}
	
	@RequestMapping("/index")
	public String in_index(HttpServletRequest request) {
		BootResult bootr = customerService.getItemList(1, 20);
		request.getSession().setAttribute("customer_count", bootr.getTotal());
		return "index";
	}
	
	
	@RequestMapping("/customer_add")
	public String customer_add(Model model) {
		model.addAttribute("map", Constants.customer_level_map);
		model.addAttribute("intent_time_map", Constants.customer_intent_time);
		model.addAttribute("customer_level", Constants.customer_level);  
		model.addAttribute("customer_language", Constants.customer_language);  
		model.addAttribute("customer_intent_degree", Constants.customer_intent_degree); 
		return "customer_add";
	}
	
	
}
