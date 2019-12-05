package Mercado;

import java.util.Scanner;
import static Mercado.Main.gerencia;
class Funcionarios extends Pessoa
{
    private double salario;
    private String funcao;
    private static Scanner obj = new Scanner(System.in);
    private static void contratar_funcionario()
    {
        System.out.print("\nDigite o nome do funcionario:\n\n");
        Funcionarios objeto= new Funcionarios();
        Main.funcionarios.add(objeto);
        Main.funcionarios.get(Main.l).nome=obj.nextLine().toLowerCase();
        System.out.print("\nDigite a funcao do funcionario:\n\n");
        Main.funcionarios.get(Main.l).funcao=obj.nextLine();
        System.out.print("\nDigite o cpf do funcionario:\n\n");
        Main.funcionarios.get(Main.l).cpf=Erros.errocpf();
        System.out.print("\nDigite o salario do funcionario:\n\n");
        Main.funcionarios.get(Main.l).salario=Erros.erros2();
        Main.l++;
    }
    static void listar_funcionarios()
    {
        int j;
        if(Main.funcionarios.size()==0)
        {
            System.out.print("\nNenhum Funcionario contratado.\n\n");
            gerencia();
        }
        for(j=0;j<Main.l;j++)
        {
            System.out.print("\nFuncionario " +Main.funcionarios.get(j).nome+
                    "\nFuncao: " + Main.funcionarios.get(j).funcao+
                    "\nSalario: " + Main.funcionarios.get(j).salario+
                    "\nCPF: " + Main.funcionarios.get(j).cpf
                    +"\n\n");
        }
    }
    static void gerenciar_funcionarios()
    {
        String ent ="";
        int k;
        if (Main.funcionarios.size()==0)
        {
            System.out.print("\nNenhum funcionario contratado.Contrate um:\n\n");
            contratar_funcionario();
        }
        else
        {
            System.out.print("\nEscolha uma opcao:\n\n" +
                    "1 Contratar novo funcionario\n" +
                    "\n" +
                    "2 Gerenciar funcionario existente\n"+
                    "\n" +
                    "3 Voltar\n\n");
            k=Erros.erros1();
            switch (k)
            {
                case 1:
                {
                    contratar_funcionario();
                    break;
                }
                case 2:
                {
                    listar_funcionarios();
                    System.out.print("\nDigite o nome do funcionario:\n\n");
                    ent=obj.nextLine().toLowerCase();
                    int j;
                    for(j=0;j<Main.l;j++)
                    {
                        while (Main.funcionarios.get(j).nome.equalsIgnoreCase(ent))
                        {
                            System.out.print("\nEscolha uma opcao:\n\n" +
                                    "1 Demitir funcionario\n" +
                                    "\n" +
                                    "2 Promover ou rebaixar funcionario\n" +
                                    "\n" +
                                    "3 Voltar\n\n");
                            k=Erros.erros1();
                            switch (k)
                            {
                                case 1:
                                {
                                    Main.funcionarios.remove(j);
                                    Main.l--;
                                    System.out.print("\nFuncionario demitido.\n\n");
                                    gerencia();
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("\nDigite o novo cargo do funcionario:\n\n");
                                    Main.funcionarios.get(j).funcao=obj.nextLine();
                                    System.out.print("\nDigite o novo salario do funcionario:\n\n");
                                    Main.funcionarios.get(j).salario=Erros.erros2();
                                    System.out.print("\nFuncionario modificado.\n\n");
                                    gerencia();
                                    break;
                                }
                                case 3:
                                {
                                    gerencia();
                                    break;
                                }
                                default:
                                {
                                    System.out.print("\nOpcao invalida.\n\n");
                                    break;
                                }
                            }
                        }
                    }
                    if (j==Main.l)
                    {
                        System.out.print("\nFuncionario nao encontrado.\n\n");
                    }
                }
             }
        }
    }
}
