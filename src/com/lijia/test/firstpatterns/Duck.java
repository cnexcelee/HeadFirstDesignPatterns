package com.lijia.test.firstpatterns;

/**
 * 鸭子超类
 * @author lijia
 *
 */
public abstract class Duck {
	/**
	 * 嘎嘎叫
	 */
	public void quack(){
		System.out.println(" quack quack !!!");
	}
	
	/**
	 * 游泳
	 */
	public void swim(){
		System.out.println(" swim ");
	}

	/**
	 * 显示鸭子
	 * description ：因为每一种鸭子都有不同的外观所以方法是抽象的
	 */
	public abstract void display();
}
