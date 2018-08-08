package com.hpit.demo;

public class StudentDemo2 {
	public static void main(String[] args) {
		//商品名称 
		String goodsName="铅笔";
//ctrl+/单价   
		float goodsPrice=1.24f;
//		库存
		int count=1200;
		

//		是否过期
		boolean isOk=false;
		
		System.out.println("商品名称\t单价\t库存\t是否过期");
		System.out.println(goodsName+"\t"+goodsPrice+"\t"+count+"\t"+isOk);
		
		/*ctrl +shift + / 添加多行注释
		 * ctrl+shift+\  取消多行注释
		 *    
		*/
	}
}
