package HomeWork;

import java.util.Arrays;

public class RemoveDups {
	public static void main (String [] args){
		String arr[] = {"horse", "dog", "cat", "horse","dog","cat","man"};
		String newarr[] = new String[arr.length];
		
		
		int newarrindex =0;
		
		for(String i : arr){
			boolean checkdups= false;
			for (int j=0; j<=newarrindex; j++) {
				if(i == newarr[j])
				{
					checkdups=true;
				}
				
			}
			
			if(!checkdups){
				newarr[newarrindex]=i;
				newarrindex ++;
			}

		}
//		System.out.println(newarrindex);
		String finalarr[] = new  String[newarrindex];
//		System.out.println("New array is: "+Arrays.toString(newarr));
		System.arraycopy(newarr, 0, finalarr,0,newarrindex);
		System.out.println("New array is: "+Arrays.toString(finalarr));
		
		
	}
	

}
