package com.wangzi.guava.base;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;

import junit.framework.TestCase;

public class JoinerTest extends TestCase{
	/**
	 * 通过空格将hello和world合并起来
	 */
	public void test1(){
		
		String joinResult = Joiner.on(" ").join(new String[]{"Hello", "world"});
		System.out.println(joinResult);
	}
	/**
	 * 通过Joiner进行二次合并
	 */
	public void test2(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "1");
		map.put("b", "2");
		String mapJoinResult = Joiner.on(",").withKeyValueSeparator("=").join(map);
		String url = Joiner.on("&").withKeyValueSeparator("=").join(ImmutableMap.of("id", "123", "name", "green"));
		final Map<String, String> join = Splitter.on("&").withKeyValueSeparator("=").split("id=123&name=green");
		for(Map.Entry<String, String> entry : join.entrySet()){
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
		System.out.println(url);
		System.out.println(mapJoinResult);
	}
	/**
	 * String类型数组或集合用','分割
	 */
	public void test3(){
		String[] str = new String[]{"a","b","c",null,"d"};
		String strJoin = Joiner.on(",").skipNulls().join(str);
		System.out.println(strJoin);
		
		//对于null进行打印NA来替换
		String strJoin2 = Joiner.on(",").useForNull("NA").join(str);
		System.out.println(strJoin2);
	}
	/**
	 * appendTo使用
	 */
	public void test4(){
		StringBuilder builder = new StringBuilder();
		Joiner joiner = Joiner.on(",").skipNulls();
		joiner.appendTo(builder, "Hello", "Guava");
		System.out.println(builder); 
	}
}
