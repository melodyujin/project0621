package com.sp.project0621.use;

import com.sp.project0621.animal.Cat;

class UseCat {
	public static void main(String[] args) {
		Cat c = new Cat();

		c.setAge(5); //setter를 통해 데이터 변경
		int age = c.getAge(); //getter를 통해 데이터 접근
		
		System.out.println("나이는 "+age);

		//고양이의 이름을 뮤로 바꾸고(setter), 
		c.setName("뮤");

		//바뀐 이름도 조회하여(getter) 출력하시오
		String name = c.getName();

		System.out.println(name);
	}
}
