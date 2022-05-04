package org.kalai.model;


public class CallFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  FibonacciSequence fs = new  FibonacciSequence(50);
		  double answer[]=fs.fibonacci();
		  
		  for(int i=0;i<answer.length;i++)
		  {
			  System.out.print(answer[i] + ", ");
		  }
		 

	}

}
