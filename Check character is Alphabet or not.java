public class Main 
{
    public static void main(String [] args)   
    {
        char c = 'B';
        if((c>='a'  && c<='z') || (c>='A' && c<='Z'))
        {
            System.out.println("It is Alphabet: " + c);
        }
        else
        {
            System.out.println("It is not an Alphabet: " + c);
        }
    }
}     