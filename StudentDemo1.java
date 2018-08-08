package com.hpit.demo;
/*
 * 使用常量的语法定义 PI保存圆周率的值。保留小数点后两位
 * 使用输出语句输出：圆周率是3.14
 */
public class StudentDemo1 {
	public static void main(String[] args) {
		//定义常量并赋值
		final float PI=3.14f;//f作用告知Eclipse工具不要按照double存储
		//使用
		System.out.println("圆周率是"+PI);//+作用：合并输出的结果
		
//		PI=4.56;//不能修改
	}
}
