package com.sp.project0621.use;

import com.sp.project0621.animal.Cat;

class UseCat {
	public static void main(String[] args) {
		Cat c = new Cat();

		c.setAge(5); //setter�� ���� ������ ����
		int age = c.getAge(); //getter�� ���� ������ ����
		
		System.out.println("���̴� "+age);

		//������� �̸��� �·� �ٲٰ�(setter), 
		c.setName("��");

		//�ٲ� �̸��� ��ȸ�Ͽ�(getter) ����Ͻÿ�
		String name = c.getName();

		System.out.println(name);
	}
}
