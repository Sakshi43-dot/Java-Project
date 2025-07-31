public class Main 
{
    public static void main(String [] args)   
    {
        String s = "aasak";
        String s1="";
        s1=s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("After removing string: " +s1);
        
    }
}
        