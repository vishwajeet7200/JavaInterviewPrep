import java.util.*;

public class HelloWorld {
    //5,2,7,1,8,27,4,5
    public static void bubbleSort(int[] a,int n){
        boolean flag;
        for(int i=0;i<n-1;i++){
            flag=false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag)
                break;
        }
        System.out.println("bubble sort");
    }
    
    public static void selectionSort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            int lb=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[lb])
                    lb=j;
            }
            int temp=a[lb];
            a[lb]=a[i];
            a[i]=temp;
        }
        System.out.println("selection sort");
    }
    
    public static void insertionSort(int[] a,int n){
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("insertion sort");
    }
    
    public static void merge(int[] a,int p,int q,int r){
        int n1=(q-p)+1;
        int n2=r-q;
        
        int[] a1=new int[n1];
        int[] a2=new int[n2];
        
        for(int i=0;i<n1;i++){
            a1[i]=a[p+i];
        }
        for(int i=0;i<n2;i++){
            a2[i]=a[q+i+1];
        }
        int i=0,j=0;
        int k=p;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                a[k]=a1[i];
                i++;
            }else{
                a[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=a1[i];
            i++;
            k++;
        }
        while(j<n1){
            a[k]=a2[j];
            k++;
            j++;
        }
    }
    
    public static void mergeSort(int[] a,int l,int r){
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    
    public static int partition(int[] a,int start,int end){
        int pivot=a[end];
        int pindex=start;
        for(int i=start;i<end;i++){
            if(a[i]<=a[end]){
                int temp=a[i];
                a[i]=a[pindex];
                a[pindex++]=temp;
            }
        }
        int temp=a[end];
        a[end]=a[pindex];
        a[pindex]=temp;
        return pindex;
    }
    
    public int randomRangeMath(int start, int end) {
        int range = end - start; // calculate our range:  5
        double randomDouble = Math.random(); // returns a double: 0.3
        double calc = (randomDouble * range) + start; // calculation returns 6.5
        long number = Math.round(calc); // 6.5 is rounded up to 7
        
        return (int) number;
    }
    
    public static void quickSort(int[] a,int start,int end){
        if(start<end){
            int pivot=partition(a,start,end);
            quickSort(a,start,pivot-1);
            quickSort(a,pivot+1,end);
        }
    }
    
    public static void main(String[] args) {
        int[] a=new int[] {5,2,7,1,8,27,4,5};
        quickSort(a,0,a.length-1);
        //mergeSort(a,0,a.length-1);
        //insertionSort(a,a.length);
        //selectionSort(a,a.length);
       // bubbleSort(a,a.length);
        Arrays.stream(a).forEach(i -> 
        System.out.println(i));
    }
}