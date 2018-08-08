package com.hpit.demo;
/*
 * 直接书写数据都统称为常量
 * 特点：一旦定义，不允许修改
 * 举例：圆周率 3.14
 * 
 * 弊端：
 *  1、重复代码
 *  2、不能修改值，不满足人类社会中某些数据变化趋势
 * 
 * java常量定义语法：
 * 提供定义常量名
 * 张三  453454464
 */
public class Demo1 {
	public static void main(String[] args) {
		//12存到一个常量名
		final int aa=12;//定义常量，并给初始值 保存学生年龄
		//写代码
		//输出快捷生成方式:sysout alt+/ 回车
		System.out.println(aa);//int
		
		
//		aa=200;//修改，常量不允许修改
		
		//12输出一次 重复代码，冗余。维护起来麻烦
		System.out.println(aa);
		
		
		System.out.println("helloWorld");
		System.out.println('好');//char
		System.out.println(true);//boolean
		System.out.println(12.44);//double
	}
}
