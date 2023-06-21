public class info2{ 
	public static void main(String args[]){
		
		
		Human2 Bob = new Human2();
		Bob.setName("Bob Brown"); //first version
		Bob.getAge();
		Bob.setAge(12);	//directly assigns age and calculates birth year
		
		Human2 Mae = new Human2(); 
		Mae.name= "Mae Gomez"; //second version for setting name
		System.out.println("Name: " + Mae.name);
		Mae.setBDay(18, 5, 2005); //also calculates the age
		
		Human2 Tom = new Human2();
		Tom.setName("Tom White");
		Tom.setBDay(31, 3, 1987); 
		
		
	}
	
	
}