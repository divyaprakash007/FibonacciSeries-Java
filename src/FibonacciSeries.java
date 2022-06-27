public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 200;
        int i=0,j=1,sum;
        while(i<num){
            System.out.print(i+" ");
            sum = i+j;
            i = j;
            j = sum;
        }
    }
 }
