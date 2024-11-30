package com.vinay.D10_math_for_dsa;

public class D12_binary_search_square_root {
    public static void main(String[] args) {
        int n=36;
        int precision=3;
        System.out.println(sqrt(n,precision));
    }

    //O(log(n))
    private static double sqrt(int n, int precision) {
        int s=0;
        int e=n;
        double root=0.0;

        while (s<=e){
            int m=s+(e-s)/2;

            if(m*m ==n){
                return m;
            }
            if(m*m > n){
                e=m-1;
            }else {
                s=m+1;
            }
        }
        double incr=0.1;
        for(int i =0;i<precision;i++){
            while(root*root <=n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }

}
