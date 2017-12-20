package com.lesson;

public class Fibonacci {
	
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
    	fibonacci.print(Integer.parseInt(args[0]));
    	
    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(String.valueOf(calc(i + 1)));
        }
    }

    private int calc(int n) {
        // write the awesome code
    	
    	int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			
			if(i==0) {
				array[i]=0;
			}
			else if(i==1) {
				array[i]=1;
			}
			else {
				array[i] = array[i-1] + array[i-2];
			}
		}

    	int index = array.length-1;
    	return (int)array[index];
    	
    	
    }
}