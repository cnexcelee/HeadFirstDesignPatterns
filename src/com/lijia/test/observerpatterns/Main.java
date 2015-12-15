package com.lijia.test.observerpatterns;

public class Main {
	
	public static void main(String[] args) {
		//初始化被观察者 电视台为湖南卫视
		TvStation huNanTV = new TvStation();
		//初始化光中
		Viewers viewer = new Viewers(huNanTV);
		//观众正在收看的节目
		viewer.display();
		//电视台改了播放节目
		huNanTV.changeProgram("变形计");
		viewer.display();
	}
}
