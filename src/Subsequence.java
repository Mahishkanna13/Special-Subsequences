import java.util.Scanner;

public class Subsequence {
    public static int Sequence(String Letter)
    {
        int a_count=0,result=0;
        for(int i=0;i<Letter.length();i++)
        {
            if(Letter.charAt(i)=='a' || Letter.charAt(i)=='A' )
            {
                a_count++;
            }
            if(Letter.charAt(i)=='g' || Letter.charAt(i)=='G' )
            {
                result=result+a_count;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Letter=scanner.nextLine();
        System.out.println(Sequence(Letter));
    }
}
