import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Interviewq {

    public static String rev(String str){
        StringBuilder revStr=new StringBuilder(str.length());
        for (int i = str.length()-1; i >=0; i--) {
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }

    public static Boolean prime(int n){
        if(n<=1) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }

    public static Integer fact(int n){
        return (n==0 || n==1)?1:n*fact(n-1);
    }

    public static Boolean palindrome(String str){
        int left=0,right=str.length()-1;
        while (left<right) {
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void fib(int n){
        int a=0,b=1;
        int sum;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            sum = a+b;
            a=b;
            b=sum;
        }
    }

    public static void largestAndSmallest(int[] a){
        int largest=Integer.MIN_VALUE,smallest=Integer.MAX_VALUE;
        for(int n:a){
            if(n>largest) largest=n;
            if(n<smallest) smallest=n;
        }
        System.out.println(largest+" "+smallest);
    }

    public static void removeDublicates(int[] a){
        Set<Integer> ans=new LinkedHashSet<>();
        for (int integer : a) {
            ans.add(integer);
        }
        System.out.println(ans);
        //alernate
        System.out.println(Arrays.toString(Arrays.stream(a).distinct().toArray()));
    }

    public static void firstNonRepeatedCharacter

    public static void main(String[] args) {
        int[] a={2,6,2,5,3,6,4,4};
        removeDublicates(a);
    }
}
