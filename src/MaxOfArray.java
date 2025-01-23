import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of elements in a array");
		limit=sc.nextInt();
		
		int[] arr = new int[limit];
		
		
		System.out.println("enter the array elements");
		for(int i=0;i<limit;i++) {
			 arr[i] = sc.nextInt();
			 }
		
		int max=0;
		
		for(int i=0;i<limit;i++) {
			if (arr[i] > max) 
                max = arr[i]; 
        }
		
		
		System.out.println("max ="+max);
		
			System.out.println("Ajay Dilip Pandhavale");

	}

}
