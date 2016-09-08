package total;
import java.util.*;
public class Linear {
			int size, search;
			int[] array;
			
			Scanner in = new Scanner(System.in);
			public void aSize(){
				System.out.print("Enter the size of an Array: ");
				size = in.nextInt();
				array = new int[size];
			}
			public void aRandom(){
				Random rand = new Random();
				System.out.print("\n");
				for(int i=0; i<array.length; i++){
					array[i] = rand.nextInt(100);
					System.out.println("Array[" +i+ "] = " + array[i]);
				}
			}
			public void aSearch(){
				int i;
				System.out.print("\n");
				System.out.print("Enter the number you want to search: ");
				search = in.nextInt();
				for (i = 0; i < array.length; i++){
					if(search == array[i]){
						System.out.println("The number has been found in Array["+i+"]");
						break;
					}
				}
				if (i == array.length){
					System.out.print("Value not found.");
				}
			}
			public static void main (String[] args){
				Linear yonde = new Linear();
				
				yonde.aSize();
				yonde.aRandom();
				yonde.aSearch();
			}
}
