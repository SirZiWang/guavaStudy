package com.wangzi.guava.base;

import java.util.Date;

import com.google.common.base.Objects;

import junit.framework.TestCase;

public class ObjectsTest extends TestCase{
	/**
	 * google guava库的com.google.common.base.Objects类
	 * 提供了一个静态方法equals可以避免我们自己做是否为空的判断，
	 */
	public void test(){
		Object obj = new Object();
		Object obj2 = null;
		boolean flag = Objects.equal(obj, obj2);
		System.out.println(flag);
	}
	/**
	 * Objects toString()
	 */
	public void test2(){
		People people = new People();
		people.setName("Tom");
		people.setGender("male");
		people.setBrithday(new Date());
		System.out.println(people.toString());
	}
	
	public static class People{
		private String name;
		private String gender;
		private Date brithday;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getBrithday() {
			return brithday;
		}
		public void setBrithday(Date brithday) {
			this.brithday = brithday;
		}
		
		@SuppressWarnings("deprecation")
		@Override
		public String toString() {
			return Objects.toStringHelper(this.getClass())
					.add("name", name)
					.add("gender",gender)
					.add("brithday", brithday).toString();
		}
		
	} 
}
