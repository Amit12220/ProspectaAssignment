import java.util.*;

public class Ques_2 {
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		CSVfun(input);
		
	}
	
	public static void CSVfun(String input)
	{
		
		String []arr=input.split(",");
		if(arr.length==0)
		{
			System.out.println("Input is not appropriate");
			return;
		}
		
		Map<String,String> part=new LinkedHashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			String []cellinternal=arr[i].split(":");
			if(cellinternal.length!=2)
			{
				System.out.println("Input is not appropriate");
				return;
			}
			
			String Part1=cellinternal[0];
			String val=cellinternal[1];
		}
	}

}
Ques_2-What type of errors you would you check for?
Ans-I will check for input is taking properly or not and
    try to handle exception if raise by any reason.
    
 Ques_3-How might a user break your code?
 Ans-user break my code by dividing each part of the code into different section	
 and each section contain similar type of data.
