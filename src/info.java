
public class info{ 
	public static void main(String args[]){
		
		Human Bob = new Human("Bob Brown",35);
		Bob.doing();
		Human Mae = new Human("Mae Gomez",18); 
		Mae.doing();
		
		Human Tom = new Human("Tom Hank",9);
		Tom.doing();
		Tom.counts();
		
		System.out.println("There are "+ Human.number + " people");
	}
	
	
}