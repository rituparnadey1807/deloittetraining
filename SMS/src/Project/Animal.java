package Project;

 class Test {

	public Test()
	{
		System.out.println("Animal cons");
	}
	public void eat() {
		System.out.println("Animal eats food");
	}
}
	 class Men extends Test
	{
		public Men()
		{
			System.out.println("Men cons");
		}
		public void eat()
		{
			System.out.println("Men eat veg and nonveg");
		}
	}

	 class Dog extends Test
		{
			public Dog()
			{
				System.out.println("Dog cons");
			}
			public void eat()
			{
				System.out.println("Dog eats pedigree");
			}
		}
	 public class Animal
	 {
		 public static void main(String args[])
		 {
			 Test a=new Men();
			 a.eat();
			  a=new Dog();
			 a.eat();
		 }
		 
	 }