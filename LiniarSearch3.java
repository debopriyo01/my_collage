package arreys;
import java.util.Scanner;
public class LiniarSearch3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr1[]=new int[6];
		int arr2[]=new int[6];
		int arr3[]=new int[12];
		int element=0;
		System.out.println("Enter the elements in the arrey");
     for(int i=0;i<arr1.length;i++) {
	arr1[i]=input.nextInt();
}
     System.out.println("Enter the elements in the arrey");
     for(int i=0;i<arr2.length;i++) {
	arr2[i]=input.nextInt();
}
     
 System.out.println("Enter the elemnt now :");    
     element=input.nextInt();
     
 for(int i=0;i<6;i++) {
	 arr3[i]=arr1[i];

 }
 for(int i=0;i<=12;i++) {
	 arr3[i+6]=arr2[i];

 }
     
  System.out.println("The index of the elemnt is ");   
     for(int i=0;i<arr3.length;i++) {
    	 
    	 if(element==arr3[i]) {
    		 
    		 System.out.println("index"+i);
    	 }
     }
     
     }

}
