
public class interview {
	
	public static void main(String[] args) {
		
		String s = "Welcome To The Java";
		int locount=0;
		int upcount=0;char c;
		for (int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			
			if (c>=65 && c<=90)
			{
				upcount = upcount+1;
			}
			else
				
			{
				locount=locount+1;
			}
		}
			
		System.out.println(locount);
		System.out.println(upcount);
	}
	
		
	

}
