class UseDog {
	public static void main(String[] args) {
		Dog d=new Dog();
		int x=7;

		d.setName("����"); //������ ��ü heap������ @                    call by value
		d.setFood(new Food()); //heap�� �ö󰨰� ���ÿ� �ּҰ�@    call by reference
		d.setAge(x);
	}
}
