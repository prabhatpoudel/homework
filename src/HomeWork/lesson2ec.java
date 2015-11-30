package HomeWork;

import java.util.Arrays;

public class lesson2ec {
	public static void main (String [] args)
	{
		int [] number ={1,2,3,4};
		
		System.out.println(Arrays.toString(encrypt(number)) );
		
int [] ennumber ={0,1,8,9};
		
		System.out.println(Arrays.toString(encrypt(ennumber)) );
	}
	

public static int[] encrypt (int[] input )
    {
	 int encrypt[]= new int [input.length];
	 int tempvalue;
	 for(int i =0 ; i<input.length; i++)
	 {
		encrypt[i]= (input[i]+7)%10;
	 }
	 
	 tempvalue= encrypt[2];
	 encrypt[2]=encrypt[0];
	 encrypt[0]=tempvalue;
	 
	 tempvalue= encrypt[3];
	 encrypt[3]=encrypt[1];
	 encrypt[1]=tempvalue;
	 
	 return encrypt;
    }

public static int[] decrypt (int[] input )
{
 int decrypt[]= new int [input.length];
 int tempvalue;
 for(int i =0 ; i<input.length; i++)
 {
	 decrypt[i]= (input[i]+3)%10;
 }
 
 tempvalue= decrypt[2];
 decrypt[2]=decrypt[0];
 decrypt[0]=tempvalue;
 
 tempvalue= decrypt[3];
 decrypt[3]=decrypt[1];
 decrypt[1]=tempvalue;
 
 return decrypt;
}
}
