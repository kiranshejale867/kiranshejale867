1.First program

public class Palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}



2.Second program


class A
{
 
    static int findSum(String str)
    {
        String temp = "0";
        int sum = 0;
 
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
 
        if (Character.isDigit(ch))
                temp += ch;
 
        else {
              sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
 
        return sum + Integer.parseInt(temp);
    }
 
    public static void main(String[] args)
    {
        String str = "12abc20yz68";
        System.out.println(findSum(str));
    }



