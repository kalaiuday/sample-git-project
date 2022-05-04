package org.kalai.model;

public class FibonacciSequence {

	int sequencesize;
	double fibonaccisequence[];

	public FibonacciSequence(int sequencesize) {
		super();
		this.sequencesize = sequencesize;
		fibonaccisequence = new double[sequencesize];
	}
	
	public double[] fibonacci()
	{
		fibonaccisequence[0]=0;
		fibonaccisequence[1]=1;
		for(int j=2; j< sequencesize; j++)
		{
			fibonaccisequence[j] = fibonaccisequence[j-1]+ fibonaccisequence[j-2];
			
		}
		return fibonaccisequence;
	}
}


