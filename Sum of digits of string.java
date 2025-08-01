public class Main 
{
    public static void main(String[]args)
    {
        String s="Saks#123m44gsf" ;
        int sum =0;
        
         for(int i=0;i<s.length();i++)
         {
              int a = s.charAt(i);
             
             if((a >= 48 &&  a <= 57))
                 {
                     sum = sum + a -'0';
                 }
            
        }
        System.out.println("sum of numbers in string: "+sum);
    }
}