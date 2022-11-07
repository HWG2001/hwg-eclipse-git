package hwg2;

public class Singleton {
	private static Singleton uniqueInstance;
	// other useful instance variables here
	private Singleton() {
		System.out.println("hessah");
		
	}
	public static Singleton getInstance(){
	if (uniqueInstance == null){
	uniqueInstance = new Singleton();
	
	
	}
    
	return uniqueInstance;
	}
	// other useful methods here
	}


