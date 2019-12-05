package Mercado;

import java.util.ArrayList;

import static Mercado.Funcionarios.listar_funcionarios;
import static Mercado.Login.login;

import static Mercado.Produtos.gerenciar_produtos;
import static Mercado.Produtos.listar_produtos;
import static Mercado.Materiais.gerenciar_materiais;
import static Mercado.Funcionarios.gerenciar_funcionarios;
import static java.lang.System.exit;

public class Main
{
        static ArrayList<Produtos> produtos1 = new ArrayList<>();
        static Materiais materiais= new Materiais();
        static ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        static int i=0;
        static int l=0;
        public static void main(String[] args)
        {
            login();
            System.out.print("\nLogin aceito.\n\n");
            boolean flag=true;
            while(flag)
            {
                flag=gerencia();
            }
        }
        static boolean gerencia()
        {
            System.out.print("\nEscolha uma opcao:\n\n" +
                    "1 Gerenciar produtos" +
                    "\n" +
                    "2 Listar produtos" +
                    "\n" +
                    "3 Gerenciar numero de carrinhos, caixas e sacolas" +
                    "\n" +
                    "4 Gerenciar funcionarios"+
                    "\n"+
                    "5 Listar funcionarios" +
                    "\n" +
                    "10 Sair.\n\n");
            int ent = Erros.erros1();
            switch(ent)
            {
                case 1:
                {
                    gerenciar_produtos();
                    gerencia();
                    break;
                }
                case 2:
                {
                    listar_produtos();
                    gerencia();
                    break;
                }
                case 3:
                {
                    gerenciar_materiais();
                    gerencia();
                    break;
                }
                case 4:
                {
                    gerenciar_funcionarios();
                    gerencia();
                    break;
                }
                case 5:
                {
                    listar_funcionarios();
                    gerencia();
                    break;
                }
                case 10:
                {
                    exit(0);
                }
                default:
                {
                    System.out.print("\nOpcao invalida.\n\n");
                    break;
                }
            }
            return true;
        }
}
