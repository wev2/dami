package Clases;

import java.util.Scanner;

public class Calculator {
	  private Scanner myTeclado;
	  
	  public Scanner getMyTeclado() {
		return myTeclado;
	}

	
	public Calculator() {
		
		this.myTeclado = new Scanner(System.in);
	}

	public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public double divide(int a, int b) {
	      /*  if (b == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero");
	        }*/
	        return (double) a / b;
	    }
	    public void closeScanner()
	    {
	    	if (myTeclado!=null)
	    		myTeclado.close();
	    	myTeclado=null;
	    }
	    

}