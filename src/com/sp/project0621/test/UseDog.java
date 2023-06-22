class UseDog {
	public static void main(String[] args) {
		Dog d=new Dog();
		int x=7;

		d.setName("아지"); //아지는 객체 heap영역에 @                    call by value
		d.setFood(new Food()); //heap에 올라감과 동시에 주소값@    call by reference
		d.setAge(x);
	}
}
