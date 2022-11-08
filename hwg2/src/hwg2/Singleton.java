package hwg2;

public class Singleton {
	private static Singleton uniqueInstance;
	// other useful instance variables here
	private Singleton() {
		System.out.println("hessah");
		
	}
	public static Singleton getInstance(){
	if (uniqueInstance == null){
	uniqueInstance =  new Singleton();
	
	
	}
    
	return uniqueInstance;
	}
	// other useful methods here
private int Num;
	
	public int getNum() {
		return this.Num ; 
	}
	
	public void setNum(int Number) {
		if (Number>0) {
			this.Num = Number ; 
			System.out.println("this number is positive" +  Number);
		}
		else {
			System.out.println("it is negtive");
		}
	}
	}


