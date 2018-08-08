package com.hpit.demo;
/*
 * 定义变量保存学生姓名、年龄、性别、身高、婚否
 */
public class Demo2 {
	public static void main(String[] args) {
		//姓名
		String studentName="林黛玉";
		
		//年龄
		int studentAge=18;
		
		//性别 
		char studentSex='女';
		
		
		//身高  m单位
		double studentHeight=1.56;
		
		
		//婚否  是  否
		boolean isMerry=false;
		
		System.out.println("学生\n姓名是："+studentName+"学生年龄\t是："+studentAge);
		System.out.println("性别是："+studentSex);
		System.out.println(isMerry+"结婚");
	}
}
