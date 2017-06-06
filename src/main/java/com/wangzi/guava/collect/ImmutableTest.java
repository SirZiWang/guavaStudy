package com.wangzi.guava.collect;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

import junit.framework.TestCase;

/**
 * 不可变集合的使用和普通集合一样，只是不能使用他们的add，remove等修改集合的方法。
 */
public class ImmutableTest extends TestCase{
	
	/**
	 * 使用builder进行创建
	 */
	public void test(){
		Set<String> immutableNamedColors = ImmutableSet.<String>builder()
				.add("red", "green","black","white","grey")
				.build();
		for(String str : immutableNamedColors){
			System.out.println(str);
		}
	}
	/**
	 * 使用of静态方法进行创建
	 */
	public void test2(){
		Set<String> immutableNamedColors = ImmutableSet.of("red","green","black","white","grey");
		for (String color : immutableNamedColors) {
	        System.out.println(color);
	    }
	}
	
	/**
	 * 第三种方法使用copyOf静态方法创建：
	 */
	public void test3(){
		Set<String> immutableNamedColors = ImmutableSet.copyOf(new String[]{"red","green","black","white","grey"});
		for (String color : immutableNamedColors) {
	        System.out.println(color);
	    }
	}
}
