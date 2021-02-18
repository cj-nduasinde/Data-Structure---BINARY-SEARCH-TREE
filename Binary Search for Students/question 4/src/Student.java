import java.util.Scanner;

public class Student {
	   public int id;
	   public String name;
	   public float score;
	    
	   Student(){
		   
		   	System.out.println("Enter ID, Name and Score :");
		    this.id = Integer.parseInt(new Scanner(System.in).nextLine());
			this.name = new Scanner(System.in).nextLine();
		    this.score = Float.parseFloat(new Scanner(System.in).nextLine()); 

	   }
	     

}
