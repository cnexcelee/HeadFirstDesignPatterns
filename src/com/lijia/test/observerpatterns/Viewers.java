package com.lijia.test.observerpatterns;

/**
 * 观众
 */
public class Viewers implements Observer {

	Subject subject;
	String message = "天天向上";
	
	/**
	 * 实例化观察者的时候传入被观察者
	 * 方便 注册和注销
	 * @param subject
	 */
	public Viewers(Subject subject){
		this.subject = subject;
		subject.registerObserver(this);
	}
	/**
	 * 更新
	 */
	@Override
	public void update(String message) {
		this.message = message;
	}
	/**
	 * 展示数据
	 */
	public void display(){
		System.out.println("您正在收看 ： " + message);
	}
	/**
	 * 关闭电视，不再收看节目
	 */
	public void closeTv(){
		subject.removeObserver(this);
	}

}
