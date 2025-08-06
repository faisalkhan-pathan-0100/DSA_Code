package DSA;

public class FiveWayToWriteInfiniteLoop {

	//way 5 recursive  call 
    public static void loop(){
        System.out.println("Hello World");
        loop();
    }
	public static void main(String[] args) {
 		
        //way 1
        while(true)
		{
		    System.out.println("Hello World");
		}

        //way 2 by always true condition
		 while(1==1){
		     System.out.println("Hello World");
		 }

        //way 3
        for( ; ;){
            System.out.println("Hello World");
        }
        
        //way 4 maintain i smaller then stopping condition always
        for(int i = 0; i<5; i++){
            System.out.println("Hello World");
            i--;
        }
        
        //way 5 recursive  call 
		loop();
	}
}
