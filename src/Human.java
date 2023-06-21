import java.util.Scanner;

public class Human {

	//variables
	String name;
	int age, bYear;
	static int number;
	Scanner scan = new Scanner ( System.in );
	
	
	static void newHuman() {
		Human.number=Human.number+1;
	}
	//constructor
	public Human(String n, int a) {
		name=n;
		age=a;
		if (age<=18&&age>=13) {
			System.out.println(name+ " is " + age + " a teenager");}
		else if (age>18) {
			System.out.println(name+ " is " + age + " an adult");	}
		else if (age<13) {
			System.out.println(name+ " is " + age + " year/s old");	
			}
		
		System.out.println("What year is it?: " );
		int year = scan.nextInt();
		bYear = year - age; 
		System.out.println("Born in the year: " + bYear);
		 
		newHuman();
	}
	
	public void doing() {
		if(age>6&&age<=18) 
			System.out.println(name + " is doing homework"+"\n");
		
		if(age>=20)
			System.out.println(name + " is working"+"\n");
	}
	
	int n=1; // n is a counter
	public void counts() {
			System.out.println(name + " is counting to 5: ");
				
			//while(n<=5) 
			for(int n=1; n<=5; n++){
				System.out.println(n);
				//n++;
				}
			
		
	
	}
}