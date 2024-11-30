package com.vinay.D10_math_for_dsa;

public class D11_seive {
    public static void main(String[] args) {
        int n= 50;
        boolean[] primes=new boolean[n+1];
        sieve(n,primes);
    }
    static void sieve(int n, boolean[] prime){
        for(int i =2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.println(i+" ");
            }
        }
    }
}
