public class Main 
{
    public static void main(String[]args)
    {
        String s="Saks#123m44gsf" ;
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i) >=65 && s.charAt(i) <= 90) || (s.charAt(i) >=97 && s.charAt(i) <= 122))
                {
                    s1 = s1 + s.charAt(i);
                }
            
        }
        System.out.println("Updated string: "+s1);
    }
}