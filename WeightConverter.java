package JavaBasics;
import java.util.*;
public class WeightConverter {
	static double weight;
	Scanner sc;
	WeightConverter(){
		//default
		sc = new Scanner(System.in);
	}
	private void convert() {
		System.out.println("****Weight Converter from lb to KG*****");
		System.out.println("Enter Weight in pounds");
		weight = sc.nextDouble();
	}
	private void display() {
		System.out.println(+weight +"  "+"lb is  " +(weight/2.2) +"  KG");
	}
	public static void main(String[] args) {
		WeightConverter w1;
		w1 = new WeightConverter();

		try {
			w1.convert();
			w1.display();
		}
		catch(Exception ex) {System.out.println(ex);}	
	}	
}
