public class Main 
{
    public static void main(String [] args)   
    {
        String s="arora";
        String s1="";
        
        for(int i=s.length()-1;i>=0; i--)
        {
            s1=s1+s.charAt(i);
        }
        if(s.equals(s1))
        {
            System.out.println("IS PALINDROME: " +s1);
        }
        else
        {   System.out.println("NOT PALINDROME: " +s1);
            
        }
    }
}