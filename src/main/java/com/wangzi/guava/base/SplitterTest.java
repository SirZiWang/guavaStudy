package com.wangzi.guava.base;

import java.util.List;
import java.util.Map;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import junit.framework.TestCase;

public class SplitterTest extends TestCase{
	/**
	 * 通过正则表达式进行拆分
	 */
	public void test(){
		String str = "this is my java program!";
		//正则表达式
		Splitter split = Splitter.onPattern("[o| ]+");
		Iterable<String> it = split.split(str);
		split.omitEmptyStrings(); //排除空字符
		split.trimResults(); //对截取后字符串进行trim
		for(String temp : it){
			System.out.println(temp);
		}
	}
	/**
	 * Splitter做二次拆分
	 */
	public void test2(){
		String str = "a=1,b=2,c=3,d=4";
		Map<String, String> map = Splitter.onPattern("[,;]{1,}").withKeyValueSeparator('=').split(str);
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(String.format("%s=%s", entry.getKey(), entry.getValue()));
		}
	}
	public void test3(){
		//limit(int) 限制拆分出来的数量
		String str = "hello is world";
		List<String> list = Lists.newArrayList(Splitter.on(" ").limit(2).split(str));
		System.out.println(list);
		list = Splitter.on(" ").limit(3).splitToList(str);
		System.out.println(list);
	}
}
