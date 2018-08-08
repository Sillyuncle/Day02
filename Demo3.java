package com.hpit.demo;
/*
 * 学习使用用户输入的值给变量赋值
 */
//1步 导入Scanner家
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		//2、安装监听器
		Scanner input=new Scanner(System.in);
		
		//3、实现监听
		//3-1 提问题
		System.out.println("请输入您的账号：");
		//3-2 回答
		String userName=input.next();
		
		
		//4-1 提问
		System.out.println("请输入密码：");
		//4-2回答  答案一定要存到变量中
		int userPassword=input.nextInt();
		
		
		System.out.println("您输入的信息如下：");
		System.out.println("账号是："+userName);
		System.out.println("密码是："+userPassword);
	}
}
