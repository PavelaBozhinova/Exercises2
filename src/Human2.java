public class Human2 {

	int age, bday, year=2023;
	String name;
			
	
	public int getAge() {
		System.out.println("How old is " + name + "?");
		return this.age;
		
	}
	// this method calculates the birth year with
	// the directly assigned age from the class "info"
	
	public void setAge(int a) {
		System.out.println("Age: " + a);
		this.age=a;
		if (a>0) {
			
			int bYear;
			bYear = year - a;
			System.out.println("Birth year: " + bYear );
			
			if (age<=18&&age>=13) {
				System.out.println("(teenager)"+ "\n");}
			else if (age>18) {
				System.out.println("(adult)"+ "\n");	}
			else if (age<13) {
				System.out.println("(child)" + "\n");	
				}
		}
	}
	
	//by setting the Birthday in class "info" 
	//this method prints the bday and age
	public int getBDay() {
		return this.bday; }
	
	public void setBDay(int d, int m, int y) {
		System.out.println(name + "´s Birthday is on: " + d +"."+ m +"." + y);
		this.bday=d;
		age = year - y;
		System.out.println("Age: " + age );
		
		if (age<=18&&age>=13) {
			System.out.println("(teenager)"+ "\n");}
		else if (age>18) {
			System.out.println("(adult)"+ "\n");	}
		else if (age<13) {
			System.out.println("(child)"+ "\n");	
			}
		
	}
	
	//the name is declared in the class "info"
	public String getName() {
		return this.name;
		
	}
	public void setName(String n) {
		this.name=n;
		System.out.println("Name: " + n);
	}
	
	
}
