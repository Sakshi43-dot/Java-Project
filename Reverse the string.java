public class Main  
{
    public static void main(String [] args)   
    {
        String s="Sakshi";
        
        
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}