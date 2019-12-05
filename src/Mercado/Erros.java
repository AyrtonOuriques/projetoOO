package Mercado;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

class Erros
{
    private static Scanner obj = new Scanner(System.in);
    static int erros1()
    {
        int ent;
        while(true)
        {
            try
            {
                ent=obj.nextInt();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.print("\nDigite um numero.\n\n");
                String inutil=obj.nextLine();
            }
        }
        return ent;
    }
    static double erros2()
    {
        double ent;
        while(true)
        {
            try
            {
                ent=obj.nextDouble();
                break;
            }
            catch(InputMismatchException e)
            {
                System.out.print("\nDigite um numero.\n\n");
                String inutil=obj.nextLine();
            }
        }
        return ent;
    }
    static String errocpf()
    {
        String ent=ent=obj.nextLine();;
        while(true)
        {
            ent=obj.nextLine();
            if(ent.length()==9 && Pattern.matches("[a-zA-Z]+", ent)==false)
            {
                break;
            }
            System.out.print("\nDigite um cpf valido.\n\n");
        }
        return ent;
    }
}
