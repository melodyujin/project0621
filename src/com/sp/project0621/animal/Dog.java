//javac -d 바이너리루트 대상.java
//java 패키지명.클래스 (확장자x)
package com.sp.project0621.animal;

public class Dog {
	/*
	자바에서는 return 값이 없는 메서드명 앞에는 반드시
	void를 명시해야 하고, return 값이 있을 때는 해당 return값과
	동일한 자료형을 명시해야 한다
	*/

	//void란? 해당 메서드에는 return이 없다는 뜻이다
	public void eat(){
	}
	public int getLegs(){
		return 4;
	}
	public boolean isBoy(){ //남자인지
		return false;
	}
}
