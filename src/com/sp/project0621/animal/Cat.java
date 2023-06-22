package com.sp.project0621.animal;
//은닉화란? 변수는 private으로 숨기고, 이 변수에 대한 변경이나
//값의 조회를 위한 메서드를 제공해주는 클래스 정의 기법
//== encapsulation
public class Cat {
	//private으로 접근제한자를 부여하며, 외부의 그 어떤 누구도
	//이 데이터를 사용할 수 없다..
	private String name;
	private int age;

	//은닉화된 변수에 대해 제공될 메서드명은 명명 규칙이 있다.
	//1) 값을 변경할때 사용되는 메서드를 가리켜 setter
	//2) 값을 조회하고 즉 얻어오고싶을때 사용되는 메서드는 getter

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
