package Mercado;
import java.util.Scanner;

class Login
{
    private static String login="admin", senha="123456", ent="";
    static void login()
    {
        System.out.print("\nBem vindo, faca login ou digite sair para sair.\n\n");
        Scanner obj=new Scanner(System.in);
        while(login.equals(ent)==false)
        {
            System.out.print("\nDigite o login:\n\n");
            ent=obj.nextLine();
            if(login.equals(ent)==false)
            {
                System.out.print("\nLogin incorreto.\n\n");
            }
            if(ent.equalsIgnoreCase("sair"))
            {
                System.exit(0);
            }
        }
        while(senha.equals(ent)==false)
        {
            System.out.print("\nDigite a senha:\n\n");
            ent=obj.nextLine();
            if(senha.equals(ent)==false)
            {
                System.out.print("\nSenha incorreta.\n\n");
            }
            if(ent.equalsIgnoreCase("sair"))
            {
                System.exit(0);
            }
        }
    }
}
