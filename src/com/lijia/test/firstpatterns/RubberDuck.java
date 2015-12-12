package com.lijia.test.firstpatterns;

/**
 * 橡皮鸭
 * 
 * @author lijia
 *
 */
public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("RubberDuck");
	}
	/**
	 * 橡皮鸭吱吱叫
	 */
	@Override
	public void quack() {
		super.quack();
		System.out.println("quack zhizhi ");
	}

}
