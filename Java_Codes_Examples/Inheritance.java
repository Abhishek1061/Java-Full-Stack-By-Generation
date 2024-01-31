
public class Inheritance {
	public static void main(String[] args) {
		
		Puppy dog = new Puppy();
		dog.task();
		dog.nature();
		dog.type();
	}

}

class Animal{
	public void nature() {
		System.out.println("Security");
	}
}

class Dog extends Animal{
	void task() {
		System.out.println("Barking");
	}
}

class Puppy extends Dog{
	void type() {
		System.out.println("Baby");
	}
}


