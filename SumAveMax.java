package total;
import java.util.*;
public class SumAveMax {
	int[] array;
	int size = 0;
	int sum = 0;
	double average = 0;
	
	Scanner in = new Scanner(System.in);
	public void aSize(){
		System.out.print("Size of the Array: ");
		size = in.nextInt();
		array = new int[size];
	}
	public void aRandom(){
		Random rand = new Random();
		System.out.print("\n");
		for(int i=0; i<array.length; i++){
			array[i] = rand.nextInt(100);
			System.out.println("Random[" +i+ "] = " + array[i]);
		}
	}
	public void total(){
		System.out.print("\n");
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		System.out.print("The sum of the numbers is: "+sum);
	}
	public void average(){
		average = sum / array.length;
		System.out.print("\n");
		System.out.println("The average is: "+average);
	}
	public void max(){
		int max = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
			}
		}
		System.out.println("The Max is: "+max);
	}
	public static void main(String[] args){
		SumAveMax yonde = new SumAveMax();
		
		yonde.aSize();
		yonde.aRandom();
		yonde.total();
		yonde.average();
		yonde.max();
	}
}
