package com.wangzi.guava.collect;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import junit.framework.TestCase;

public class BiMapTest extends TestCase{
	
	public void test(){
		BiMap<String, String> biMap = HashBiMap.create();
		biMap.put("星期一", "Monday");
		biMap.put("星期二", "Tuesday");
		biMap.put("星期三", "Wednesday");
		biMap.put("星期四", "Thursday");
		biMap.put("星期五", "Friday");
		biMap.put("星期六", "Saturday");
		biMap.put("星期天", "Sunday");
		System.out.println("星期一的英文名为：" + biMap.get("星期一"));
		System.out.println("Monday的中文名为：" + biMap.inverse().get("Monday"));
		
	}
}
