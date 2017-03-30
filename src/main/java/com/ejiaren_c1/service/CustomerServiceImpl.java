package com.ejiaren_c1.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ejiaren_c1.comment.BootResult;
import com.ejiaren_c1.mapper.TCustomerMapper;
import com.ejiaren_c1.pojo.TCustomer;
import com.ejiaren_c1.pojo.TCustomerExample;
import com.ejiaren_c1.pojo.TCustomerExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private TCustomerMapper itemMapper;

	@Override
	public TCustomer geTbItemById(String itemId) {

		System.out.println(itemId);

		TCustomerExample example = new TCustomerExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);

		List<TCustomer> list = itemMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			TCustomer item = list.get(0);
			return item;
		}
		return null;
	}

	@Override
	public BootResult getItemList(int page, int rows) {
		// 查询商品列表
		TCustomerExample example = new TCustomerExample();
		// 分面处理
		PageHelper.startPage(page, rows);
		List<TCustomer> list = itemMapper.selectByExample(example);
		// 创建一个返回值对象
		BootResult result = new BootResult();
		result.setRows(list);
		PageInfo<TCustomer> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		System.out.println(pageInfo.getTotal());
		return result;
	}

	public static boolean isBlankOrNull(String value) {
		return StringUtils.isEmpty(value) || "null".equals(value);
	}

	@Override
	public BootResult getItemListByCustname(Map<String, String> search_map) {

		// 查询商品列表
		TCustomerExample example = new TCustomerExample();
		Criteria criteria = example.createCriteria();

		Set<Map.Entry<String, String>> set = search_map.entrySet();
		System.out.println("------------------------------");
		for (Map.Entry<String, String> entry : set) {

			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + ":" + value);

			if (!isBlankOrNull((String) entry.getKey())) {
				if (key.equals("custname")) {
					criteria.andCustnameLike("%" + value + "%");
				}
				if (key.equals("customerintentcountry")) {
					criteria.andCustomerintentcountryLike("%" + value + "%");
				}
				if (key.equals("customerintenttime")) {
					criteria.andCustomerintenttimeLike("%" + value + "%");
				}
				if (key.equals("customertime")) {
					criteria.andCustomertimeLike("%" + value + "%");
				}
				if (key.equals("meettime")) {
					criteria.andMeettimeLike("%" + value + "%");
				}

				if (key.equals("customerphone")) {
					criteria.andCustomerphoneEqualTo(value);
				}
				if (key.equals("customeraddress")) {
					criteria.andCustomeraddressEqualTo(value);
				}
				if (key.equals("resources")) {
					criteria.andResourcesEqualTo(value);
				}
				if (key.equals("customerlevel")) {
					criteria.andCustomerlevelEqualTo(value);
				}
				if (key.equals("status")) {
					criteria.andStatusEqualTo(value);
				}
			}
		}
		List<TCustomer> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			BootResult result = new BootResult();
			result.setRows(list);
			return result;
		}
		return null;
	}

	

	@Override
	public BootResult customerDelete(String itemId) {
		itemMapper.deleteByPrimaryKey(itemId);
		return getItemList(1, 20);
	}

	public BootResult addCustomer(TCustomer customer) {
		itemMapper.insert(customer);
		return getItemList(1, 20);
	}

	public void customerEdit(TCustomer customer) {
		itemMapper.updateByPrimaryKey(customer);
	}
}
