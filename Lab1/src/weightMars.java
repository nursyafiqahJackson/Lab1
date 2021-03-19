import java.util.Scanner;

public class weightMars {

public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);

	System.out.println("How much weight is you in earth ?:(kg) ");
	
	double weight = input.nextDouble();
	double earth = (weight*1);
	double mars = (weight*.38);
	
	
	System.out.println(" Your weight " + earth+" kg on Earth\n");
	System.out.println(" Your weight " + mars +" kg on Mars\n");

}
}
