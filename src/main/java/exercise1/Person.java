package exercise1;

public class Person {
	private String name;
	private int age;

	// constructeur
	public Person(String name, int age) {
		this.name = "juda";
		this.age = 21;
	}

	//getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

/*
	// constructeur
	public Person (){
		age=15;
		String name = "juda";
	}

	protected Person(String name, int age){
		this.age = age;
		this.name = name;
	}

	// accesseur

	public int getAge() {return age;}

	public String getName() {return name;}

}

// alt + insert
*/
