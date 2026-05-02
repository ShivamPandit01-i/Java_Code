package ClassWork;

public class PsumQuestionn {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] psum = new int[20];

        psum[0] = a[0];

        for(int i = 1 ; i<= 19 ; i++){
            psum[i] = a[i]+psum[i-1];


        }
        for(int i = 0 ; i<=19;i++){
            System.out.println(psum[i]);
        }
        //i=15 ,j=5,

        System.out.println(psum[14]-psum[4-1]);








    }
}