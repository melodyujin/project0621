package com.sp.project0621.traffic;

class UseCar {
	public static void main(String[] args) {
		//자동차 1대의 인스턴스 만들기..
		Car car=new Car();
		System.out.println("car is "+car);
		System.out.println("wheel is "+car.w);
		System.out.println("handle is "+car.h);
	}
}
