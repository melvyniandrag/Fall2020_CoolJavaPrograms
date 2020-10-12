
public class outlier {

    static int find(int[] integers) {
        int oddcount = 0, odd = 0, evencount = 0, even = 0;
        for (int i : integers) {
            if (i % 2 == 0) {
                even = i;
                evencount++;
            } else {
                odd = i;
                oddcount++;
            }
            if (evencount > 0 && oddcount > 0) {
                if (evencount > 1) {
                    return odd;
                } else if (oddcount > 1) {
                    return even;
                }
            }
        }
        return evencount > 1 ? odd : even;
    }

    public static void main(String[] args) {
    	// An array (which will have a length of at least 3, 
	// but could be very large) containing integers. 
	// The array is either entirely comprised of odd 
	// integers or entirely comprised of even integers 
	// except for a single integer N. Write a method 
	// that takes the array	as an argument and returns 
	// this "outlier" N. 

	int[] exampleTest = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 

	int found = find(exampleTest); 

	System.out.println(found); 
    } 
}
