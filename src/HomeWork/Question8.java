package HomeWork;

final class Question8 {
   public static void main(String [] args){
	   char [][] studentanswer = {
			   { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
			   { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
			   { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
			   { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
			   { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
			   { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
			   { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
			   { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
	   
	   char[] answers = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
	   
	  
	   for (int i =0; i<studentanswer.length; i++){
		   int correctcnt=0;
		   for(int j=0; j<studentanswer[i].length; j++){
			   if(studentanswer[i][j]==answers[j])
			   {
				 correctcnt++;  
			   }
			   
		   }
		  System.out.printf("Student %d's correct count is %d \n",i,correctcnt); 
	   }
   }
}

  

