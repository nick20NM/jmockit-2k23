package com.alpha.www.JMockit.example1;

public class SuperClass {

	String data;

	public SuperClass(String data) {
		throw new IllegalArgumentException("Don't Call Me!");
	}
}
