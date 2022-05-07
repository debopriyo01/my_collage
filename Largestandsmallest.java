package arreys;
import java.util.Scanner;
public class Largestandsmallest {
	
	public static void main(String[] args) {
		int arr[]=new int[6];
		int max=arr[0];
		int min=arr[0];
	    
		Scanner input=new Scanner(System.in);
		
	System.out.println("Enter the elements of the arrey;-");
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=input.nextInt();
}
	
	for(int i=0;i<5;i++) {
		
		for(int j=1;j<6;j++) {
			
			max=arr[0];
			if(max<arr[j]) {
				
				max=arr[j];
			}
		}
	}
for(int i=0;i<arr.length-1;i++) {
		
		for(int j=1;j<arr.length;j++) {
			
			min=arr[i];
			if(min>arr[i+1]) {
				
				min=arr[i+1];
			}
		}
	}
System.out.println("The largest no is "+max);
System.out.println("The min no is"+min);
}
}

			

	
	



