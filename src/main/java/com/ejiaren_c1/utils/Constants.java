package com.ejiaren_c1.utils;

import java.util.ArrayList;
import java.util.TreeMap;

public class Constants {

	public static TreeMap<String, String> customer_level_map = new TreeMap<String, String>();
	public static TreeMap<String, String> m_level = new TreeMap<String, String>();
	public static TreeMap<String, String> c_meetlevel = new TreeMap<String, String>();
	public static ArrayList<String> customer_intent_time = new ArrayList<String>();
	public static ArrayList<String> customer_level = new ArrayList<String>(); 
	public static ArrayList<String> customer_language = new ArrayList<String>();
	public static ArrayList<String> m_time_level = new ArrayList<String>();  
	public static ArrayList<String> customer_intent_degree = new ArrayList<String>();
	public static ArrayList<String> public_lift_view_type = new ArrayList<String>();
	
	static{
		customer_level_map.put("0", "首次");
		customer_level_map.put("1", "近期");
		customer_level_map.put("2", "远期");
		customer_level_map.put("3", "紧急");
		customer_level_map.put("4", "未接通");
		customer_level_map.put("10", "未接通2");
		customer_level_map.put("11", "未接通3");
		customer_level_map.put("12", "未接通4");
		customer_level_map.put("5", "空号");
		customer_level_map.put("6", "无效");
		customer_level_map.put("7", "其他");
		customer_level_map.put("8", "约见");
		customer_level_map.put("9", "签约");
		customer_level_map.put("13", "预咨询");
		customer_level_map.put("14", "TMK有效");
		
		
		customer_intent_time.add("2017春季");
		customer_intent_time.add("2017秋季");
		customer_intent_time.add("2018春季");
		customer_intent_time.add("2018秋季");
		customer_intent_time.add("2019春季");
		customer_intent_time.add("2019秋季");
		customer_intent_time.add("2020春季");
		customer_intent_time.add("2020秋季");
		customer_intent_time.add("2021春季");
		customer_intent_time.add("2021秋季");
		
		customer_level.add("初中及以前");
		customer_level.add("初二");
		customer_level.add("初三");
		customer_level.add("高一");
		customer_level.add("高二");
		customer_level.add("高三");
		customer_level.add("高中毕业已工作");
		customer_level.add("本科大一");
		customer_level.add("本科大二");
		customer_level.add("本科大三");
		customer_level.add("本科大四");
		customer_level.add("大学已毕业	");
		customer_level.add("9-12年级");
		customer_level.add("硕士");
		customer_level.add("博士");
		customer_level.add("博士后");
		
		customer_language.add("雅思");
		customer_language.add("托福");
		customer_language.add("SSAT（美国中考)");
		customer_language.add("SAT（美国高考)");
		customer_language.add("GRE（美国中考)");
		customer_language.add("GMAT（美国中考)");
		customer_language.add("其他");
		
		m_time_level.add("1");
		m_time_level.add("8");
		m_time_level.add("3");
		m_time_level.add("9");
		m_time_level.add("13");

		c_meetlevel.put("6", "无效");
		c_meetlevel.put("8", "约见");
		c_meetlevel.put("9", "签约");
		
		customer_intent_degree.add("小学");
		customer_intent_degree.add("初中");
		customer_intent_degree.add("高中");
		customer_intent_degree.add("大学");
		customer_intent_degree.add("硕士");
		customer_intent_degree.add("博士");
		
		m_level.put("", "");
		m_level.put("1", "一星（无效)");
		m_level.put("2", "两星（远期)");
		m_level.put("3", "三星（普通)");
		m_level.put("4", "四星（近期)");
		m_level.put("5", "五星（重点)");
		m_level.put("6", "六星（签约)");
		
		public_lift_view_type.add("tables");
		public_lift_view_type.add("customer_add");
		public_lift_view_type.add("public_lift_view_type");
	}
}
