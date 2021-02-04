package com.base;

public class A {
	int age = 30;
	public static void main(String[] args) {
		A a = null;//NullPointerException발생하지 않음
		//사용하면 그때 발생함.
		//a = new A();
		System.out.println(a.age);//30
		System.out.println("여기는 보이나요?");//30
	}

}
