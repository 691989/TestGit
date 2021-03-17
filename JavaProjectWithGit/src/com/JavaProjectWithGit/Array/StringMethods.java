package com.JavaProjectWithGit.Array;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Dhananjay";
		String str1="Snehal";
		
		//Various String methods
		
		/*(1).charAt(int index)*/
		System.out.println("Returns the character of specified index as str.charAt(0):"+str.charAt(0));//Returns the character of specified index
		
		/*(2).int length()*/
		System.out.println("Returns the length of str1:"+str.length());
		
		/*(3).String substring(int beginIndex)*/
		System.out.println("Returns substring from specified index up to end of the string:"+str.substring(1));
		
		/*(4).String substring(int beginindex,int endindex)*/
		System.out.println("Returns substring from beginindex to endindex of the string:"+str.substring(0, 8));	
		
		/*(5). Boolean startsWith()String prefix*/
		System.out.println("Return true if the string starts with the given prefix:"+str.startsWith("D"));
		
		/*(6). Boolean endsWith(String suffix)*/
		System.out.println("Returns true if string ends with the given prefix:"+str.endsWith("ay"));
		
		/*(7).Boolean equals(Object str)*/
		System.out.println("Returns ture if both the strings equal.it is case sensitive:"+str.equals(str1));
		System.out.println("Returns ture if both the strings equal.it is case sensitive:"+str.equals("Dhananjay"));
		System.out.println("Returns ture if both the strings equal.it is case sensitive:"+str.equals("DhananjAY"));
		
		/*(8).Boolean equalIgnoreCase(Object str)*/
		System.out.println("Returns true if both the strings are equal.it is not case sensitive:"+str.equalsIgnoreCase("DHANANJAY"));
		
		/*(9).int indexOf(int ch)*/
		System.out.println("Return index of first occurence of specified char:"+str.indexOf('a'));
		
		
		/*(10).int lastIndexOf(int ch)*/
		System.out.println("Return index of last occurence of specified char:"+str.lastIndexOf('a'));
		
		/*(11).*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
