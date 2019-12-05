package Mercado;
import java.util.Scanner;
import static Mercado.Main.gerencia;
class Produtos
{
    private int Quantidade;
    private double preco;
    private String nome;
    private double novopreco=0.0;
    private static Scanner obj = new Scanner(System.in);
    private static void adicionar_produto()
    {
        Produtos objeto= new Produtos();
        System.out.print("\nDigite o nome do produto:\n\n");
        Main.produtos1.add(objeto);
        Main.produtos1.get(Main.i).nome=obj.nextLine().toLowerCase();
        System.out.print("\nDigite a quantidade do produto:\n\n");
        Main.produtos1.get(Main.i).Quantidade=Erros.erros1();
        System.out.print("\nDigite o preco do produto:\n\n");
        Main.produtos1.get(Main.i).preco=Erros.erros2();
        Main.i++;
        System.out.print("\nProduto adicionado.\n\n");
    }
    static void listar_produtos()
    {
        int j;
        if(Main.produtos1.size()==0)
        {
            System.out.print("\nNenhum produto no estoque.\n\n");
            gerencia();
        }
        else
        {
            for(j=0;j<Main.i;j++)
            {
                System.out.print("\nProduto: " + Main.produtos1.get(j).nome+
                        "\nQuantidade: " + Main.produtos1.get(j).Quantidade +
                        "\n");
                if (Main.produtos1.get(j).novopreco!=0)
                {
                    System.out.print("Em promocao!" +
                            "\n"+ "De "+ Main.produtos1.get(j).preco+ " Por " + Main.produtos1.get(j).novopreco+"\n");
                }
                else
                {
                    System.out.print("Preco: " + Main.produtos1.get(j).preco+"\n");
                }
            }
        }
    }
    static void gerenciar_produtos()
    {
            String ent="";
            int k;
            if (Main.produtos1.size()==0)
            {
                System.out.print("\nNenhum produto no estoque.Adicione um produto:\n\n");
                adicionar_produto();
            }
            else
            {
                System.out.print("\nEscolha uma opcao:\n\n" +
                        "1 Adicionar um novo produto\n" +
                        "\n" +
                        "2 Gerenciar produto existente\n"+
                        "\n" +
                        "3 Voltar\n\n");
                k=Erros.erros1();
                switch (k)
                {
                    case 1:
                    {
                        adicionar_produto();
                        break;
                    }
                    case 2:
                    {
                        listar_produtos();
                        System.out.print("\nDigite o nome do produto:\n\n");
                        ent=obj.nextLine().toLowerCase();
                        int j;
                        for(j=0;j<Main.i;j++)
                        {
                            while (Main.produtos1.get(j).nome.equalsIgnoreCase(ent))
                            {
                                System.out.print("\nEscolha uma opcao:\n\n" +
                                        "1 Adicionar mais do produto\n" +
                                        "\n" +
                                        "2 Remover estoque do produto\n" +
                                        "\n" +
                                        "3 Deletar produto\n" +
                                        "\n" +
                                        "4 Mudar preço do produto\n" +
                                        "\n" +
                                        "5 Colocar produto em promocao\n" +
                                        "\n" +
                                        "6 Remover produto da promocao\n" +
                                        "\n" +
                                        "7 Voltar\n" +
                                        "\n\n");
                                k=Erros.erros1();
                                switch (k)
                                {
                                    case 1:
                                    {
                                        System.out.print("\nDigite a quantidade para adicionar do produto:\n\n");
                                        System.out.print("\nQuantidade disponivel:"+ Main.produtos1.get(j).Quantidade+"\n\n");
                                        Main.produtos1.get(j).Quantidade= Main.produtos1.get(j).Quantidade + Erros.erros1();
                                        System.out.print("\nProduto adicionado.\n\n");
                                        gerencia();
                                        break;
                                    }
                                    case 2:
                                    {
                                        System.out.print("\nDigite a quantidade do produto a ser removida:\n\n");
                                        System.out.print("\nQuantidade disponivel:"+ Main.produtos1.get(j).Quantidade+"\n\n");
                                        Main.produtos1.get(j).Quantidade= Main.produtos1.get(j).Quantidade - Erros.erros1();
                                        if(Main.produtos1.get(j).Quantidade<0)
                                        {
                                            Main.produtos1.get(j).Quantidade=0;
                                        }
                                        System.out.print("\nProduto removido.\n\n");
                                        gerencia();
                                        break;
                                    }
                                    case 3:
                                    {
                                        Main.produtos1.remove(j);
                                        Main.i--;
                                        System.out.print("\nProduto removido.\n\n");
                                        gerencia();
                                        break;
                                    }
                                    case 4:
                                    {
                                        System.out.print("\nDigite o novo preco:\n\n");
                                        System.out.print("\nPreco atual:"+ Main.produtos1.get(j).preco+"\n\n");
                                        Main.produtos1.get(j).preco=Erros.erros2();
                                        System.out.print("\nProduto modificado.\n\n");
                                        gerencia();
                                        break;
                                    }
                                    case 5:
                                    {
                                        System.out.print("\nDigite o a porcentagem de desconto:\n\n");
                                        System.out.print("\nPreco atual:"+ Main.produtos1.get(j).preco+"\n\n");
                                        Main.produtos1.get(j).novopreco= Main.produtos1.get(j).preco * (1.0-(0.01*Erros.erros2()));
                                        System.out.print("\nPromocao feita.\n\n");
                                        gerencia();
                                        break;
                                    }
                                    case 6:
                                    {
                                        if (Main.produtos1.get(j).novopreco!=0)
                                        {
                                            Main.produtos1.get(j).novopreco=0;
                                            System.out.print("\nProduto modificado.\n\n");
                                        }
                                        else
                                        {
                                            System.out.print("\nProduto nao esta em promocao.\n\n");
                                        }
                                        gerencia();
                                        break;
                                    }
                                    case 7:
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
                        if (j==Main.i)
                        {
                            System.out.print("\nProduto nao encontrado.\n\n");
                        }
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
                        gerencia();
                        break;
                    }
                }
            }
    }
}

