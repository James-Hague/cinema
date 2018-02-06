package cinemas;

public class MainClass {

	
	public static void main(String[] args){
		
		Movies haryPotter = new Movies("harry ptter", "horror", "12a");
		Movies Terminator = new Movies("Terminator","Action", "16");
		Movies octopussy = new Movies("bond","Action", "18");
		Movies Avengers = new Movies("avengers","Action", "16");
		Movies Howtotrainyourdragon = new Movies("dragons","Kids", "8");
		
		
		ServiceClass sc = new ServiceClass();
		
		sc.addMethod(1, haryPotter);
		sc.addMethod(2, Terminator);
		sc.addMethod(3, octopussy);
		sc.addMethod(4, Avengers);
		sc.addMethod(5, Howtotrainyourdragon);
		
		
		
		System.out.println(sc.convert());
		System.out.println(sc.convertSingle(4));
		
		
	}
	
}
