package arreys;
import java.util.Scanner;
public class LiniarSearch1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int arr[]=new int[4];
int search;
int found=0;
		System.out.println("Enter the elemnts of the arrey: ");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the value of search");
		
		search=input.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) 
			{
				found=1;
				break;
			}
			else 
			{
				found=0;
			}
		}
		
	System.out.println(found);
		
		
		
		
	}

}
