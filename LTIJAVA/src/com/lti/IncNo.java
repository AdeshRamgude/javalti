package com.lti;

import java.util.Scanner;

public class IncNo {
public static void main(String[] args) {
	int n,flag=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
    int max=n%10;
    n=n/10;
    while(n>0){
        int d=n%10;
        if(max<d){
            flag++;
            break;
        }
        max=d;
       n=n/10;
    }
    if(flag>=1)
	System.out.println("No");
	else
	System.out.print("yes");
}
}
