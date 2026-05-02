import java.util.Scanner;

class Power{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        long n = sc.nextLong();

        if(n<=0){
            System.out.println("Not a power of 2");
        }
        else {
            while(n%2==0){
                n= n/2;
            }
            System.out.println(n == 1? "Power of 2": "Not a power of 2");
        }
        sc.close();
    }
}
