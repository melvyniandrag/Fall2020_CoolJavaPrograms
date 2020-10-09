import java.io.File;
import java.util.Scanner;

public class polish {
        public static void main(String[] args) throws Exception {

                Scanner sc = new Scanner(new File("input.txt"));

                for (; sc.hasNext();) {
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        int result = mul(a, b);
                        System.out.println(a+"\t"+b+" = "+result);
                }
        }

        private static int mul(int a, int b) {

                int m = a;
                int n = b;
                int result = 0;
                while (n > 0) {
                        if (n % 2 != 0) {
                                result += m;
                        }

                        m *= 2; 
                        n /= 2; 
                }
                return result;
        }
}
