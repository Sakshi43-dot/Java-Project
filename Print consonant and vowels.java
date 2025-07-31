public class Main  
{
    public static void main(String [] args)   
    {
        String s="Zeyaaa";
        String s1="aeiou";
        String s3="";
        String s4="";
        for(int i=0;i<s.length();i++)
        {
        if(s1.contains(s.valueOf(s.charAt(i))))
        {
            s3= s3+s.charAt(i);
            
        }
        else
        {
              s4= s4+s.charAt(i);
        }
    
        }
        System.out.println("Vowel: "+s3);
        System.out.println("Consonant: "+s4);
        
       
       
    }
}