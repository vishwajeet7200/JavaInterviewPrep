import java.util.Scanner;
 
public class Shashank {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int[] input2 = new int[input1];
 
        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }
 
        int lastModified = lastModifiedBowl(input1,input2);
        System.out.println(lastModified);
    }
 
    public static int lastModifiedBowl(int input1,int[] input2) {
        int carry = 1; 
        int lastModified = 0;
        for (int i = input1 - 1; i >= 0; i--) {
            input2[i] += carry;
            
            if (input2[i] > 9) {
                input2[i] = 0;
                carry = 1;
                lastModified = i + 1;
            } else {
                carry = 0;
                lastModified = i + 1;
                break;
            }
        }
        if (carry == 1) {
            return 0;
        }
        return lastModified;
    }
}
