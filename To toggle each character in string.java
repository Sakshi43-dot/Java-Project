public class Main 
{
    public static void main(String [] args)   
    {
        String s = "SakSHI";
        String s1="";
        for(int i=0; i <s.length(); i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                s1=s1+Character.toLowerCase(s.charAt(i));    
            }
            else
            {
                 s1=s1+Character.toUpperCase(s.charAt(i));     
            }
        }
        System.out.println("Toggle is: " +s1);
    }
}
        