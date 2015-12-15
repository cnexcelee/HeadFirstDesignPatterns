package com.lijia.test.observerpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * 电视台类
 */
public class TvStation implements Subject {
	
	List<Observer> observers;
	private String program = "";
	
	public TvStation() {
		observers = new ArrayList<Observer>();
	}
	/**
	 * 注册观察者
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	/**
	 * 移除观察者
	 */
	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if(index >= 0)
			observers.remove(observer);
	}
	/**
	 * 通知观察者更新数据
	 */
	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(program);
		}
	}
	/**
	 * 修改节目
	 * @param programName
	 */
	public void changeProgram(String programName){
		this.program = programName;
		notifyObserver();
	}
}
