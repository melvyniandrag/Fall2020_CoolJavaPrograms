public class average {

	public static void main(String[] args) {
		int [] arr = {12,13,14};
		int [] arr2 = {10,20,30,40};
		mean(arr);
		mean(arr2);
		

	}
	
	public static void mean(int[] arr) {
		 int sum = 0;
		
		 for(int i = 0; i < arr.length; i++) {
		 sum = sum + arr[i];	 
			 
		 }
		 
		 System.out.println(sum/arr.length);
		
	}

}

