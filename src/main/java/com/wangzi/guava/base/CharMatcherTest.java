package com.wangzi.guava.base;

import com.google.common.base.CharMatcher;

import junit.framework.TestCase;

public class CharMatcherTest extends TestCase {
	
	public void test(){
		String str = "This is 1 2 3 hello  world test!";
		//移除control字符
		String noControl = CharMatcher.JAVA_ISO_CONTROL.removeFrom(str);
		System.out.println(noControl);
		//只保留数字
		String digits = CharMatcher.DIGIT.retainFrom(str);
		System.out.println(digits);
		//去除两端的空格，并把中间的连续空格替换成单个空格
		String space = CharMatcher.BREAKING_WHITESPACE.trimAndCollapseFrom(str, ' ');
		System.out.println(space);
		//用*号替换所有数字
		String noDigits = CharMatcher.JAVA_DIGIT.replaceFrom(str, "*"); 
		System.out.println(noDigits);
		//只保留字母
		String letter = CharMatcher.JAVA_LETTER.retainFrom(str);
		System.out.println(letter);
		// 只保留数字和小写字母
		String lowerAndDigit = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(str);
		System.out.println(lowerAndDigit);
		
	}
}
