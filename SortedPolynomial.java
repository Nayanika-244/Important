import java.io.*;

import java.util.*;

class SortPolynomial
{
	ArrayList<Integer> sortPolynomial(ArrayList<Integer> x , int a, int b, int c){

	if(x==null)
	return null;

	Integer poly = a*x.get(0)*x.get(0) + b*x.get(0)+c;
	ArrayList<Integer> less = new ArrayList<Integer>();
	less.add(poly);
	ArrayList<Integer> more = new ArrayList<Integer>();

	for(int i=1;i<x.size();i++)
	{
	Integer varPoly = a*x.get(i)*x.get(i) + b*x.get(i)+c;
	if(varPoly > poly)
		more.add(varPoly);
	else 
		less.add(varPoly);
	poly = varPoly;
	}
	ArrayList<Integer> resultant = new ArrayList<Integer>();
	resultant.addAll(less);
	resultant.addAll(more);

	return resultant;


	}
	public static void main(String[] args)
	{
		SortPolynomial sp = new SortPolynomial();
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		x.add(i);

		ArrayList<Integer> res = sp.sortPolynomial(x,2,3,-1);
		for(int num:res)
		System.out.println(num);

	}
}