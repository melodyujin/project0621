/*자동차를 정의하되, 최대한 현실을 반영*/
package com.sp.project0621.traffic;
//자동차가 바퀴를 가지고 있다
//Car has a wheel , 객체가 다른 객체를 보유하고 있는 모습
//has a 관계라 한다...
public class Car{
	//차가 바퀴를 가진다..
	//Car has a wheel
	Wheel w;
	Handle h;

	/*
	생성자(Constructor)란?
	- 메서드이다
	- 객체가 생성될 때, 즉 new연산자가 호출되어질 때 무조건적으로 호출되는 메서드
	-왜 사용하나?
		일반 데이터(문자,숫자,논리값)와는 달리 객체는 초기화 과정이 
		복잡하고 거대하다.. 따라서 로직 차원으로 초기화가 필요하기 때문
	- 생성자는 무조건 new 연산자 뒤에 강제호출이 일어나기 때문에
		생성자 호출을 피할 수는 없다..
	- 생성자는 일반 메서드가 아니기에 반환형 자체가 없다..
		만일 void 및 반환형을 넣어버리면, 그 때부터 그냥 일반메서드가 되어 버린다..
		즉 생성능력 상실한다..(에러도 안남 ㅜㅜ)
	*/
	/*
	디폴트 생성자 
	지원목적??? 최소한의 에러만 발생하지 않도록 존재시킴...
				new 연산자 뒤에 강제호출되는 생성자 메서드로 인하여,
				에러가 발생하는 것을 방지..
				즉 개발자가 생성자를 정의하지 않으면 최소한 에러는 나지 않아야하므로
				디폴트 생성자가 지원된다..
			하지만, 개발자가 생성자를 적극적으로 정의한다면, 
				디폴트 생성자는 존재하지 않게 된다 
	*/
	public Car(){
		System.out.println("내가 정의한 생성자");
		//현재 이 자동차가 태어날때, 보유한 모든 객체들을 메모리에 올려준다
		w=new Wheel();
		h=new Handle();
	}
	
}
