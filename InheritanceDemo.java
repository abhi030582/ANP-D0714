package com.example;

class Animal
{
	public void speak()
	{
		System.out.println("Animal speak");
	}
	public void run()
	{
		System.out.println("Animal run");
	}
}
class Cat extends Animal
{
	//overriding
	public void speak()
	{
		System.out.println("Cat can Mew...");
	}
	public void run()
	{
		System.out.println("Cat can run fast...");
	}
}


public class InheritanceDemo {
	public static void main(String []str)
	{
		Cat obj = new Cat();
		obj.speak();
		obj.run();
		
	}

}
