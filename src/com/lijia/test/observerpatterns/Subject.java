package com.lijia.test.observerpatterns;

/**
 * 主题接口
 * @author lijia
 *
 */
public interface Subject {
	/**
	 * 注册观察者
	 */
	void registerObserver(Observer observer);
	/**
	 * 移除观察者
	 */
	void removeObserver(Observer observer);
	/**
	 * 通知所有观察者
	 */
	void notifyObserver();
	
}
