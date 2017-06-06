package com.wangzi.guava.collect;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

import junit.framework.TestCase;

public class ComparisonChainTest extends TestCase{
	public void test(){
		
	}
}
class Student implements Comparable<Student>{

	private String lastName;
	private String firstName;
	private int zipCode;

	//jdk
//	public int compareTo(Student other) {
//		int cmp = lastName.compareTo(other.lastName);
//	    if (cmp != 0) {
//	      return cmp;
//	    }
//	    cmp = firstName.compareTo(other.firstName);
//	    if (cmp != 0) {
//	      return cmp;
//	    }
//	    return Integer.compare(zipCode, other.zipCode);
//	}
	
	//guava比较优雅
	public int compareTo(Student other) {
		return ComparisonChain.start()
	            .compare(this.lastName, other.lastName)
	            .compare(this.firstName, other.firstName)
	            .compare(this.zipCode, other.zipCode, Ordering.natural().nullsLast())
	            .result();

	}
	
}