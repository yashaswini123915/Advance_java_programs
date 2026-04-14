package interview;

//5. Write a class “Programmer”. Give some properties and methods to it and show how you
//will access them in the main method by creating object(s) of this class.
class Programmer{
	private int age;
	private String name;
	
	Programmer(){
		
	}
	
	Programmer(int age, String name){
		this.age=age;
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void codes(String name) {
        System.out.println(this.name + " writes codes");
    }
	public void drinkcoffe(String name) {
        System.out.println(this.name + " drinks coffee and can then convert exponential complexity codes to polynomial");

	}

	
	
	
}


public class Test1 {
	public static void main(String args[]) {
		int age=24;
		String name="yashaswini";
		Programmer obj = new Programmer(age,name);
		obj.codes(name);
		obj.drinkcoffe(name);
		System.out.println("the name of the programmer is "+obj.getName());
		System.out.println("the age of the programmer is "+obj.getAge());
		
		

				
	}

}
