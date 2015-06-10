package com.liuhao.restful;

public class RestfulImpl implements Restful {

	public void sayHello() {
		System.out.println("liuhao saying hello");
	}
	
	public String sayHello2(String name){
		return "winner is "+name;
	}
}
