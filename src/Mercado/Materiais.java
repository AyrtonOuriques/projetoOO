package Mercado;

import static Mercado.Main.gerencia;

class Materiais
{
    private int carrinhos=0;
    private int caixas=0;
    private int sacolas=0;
    static void gerenciar_materiais()
    {
        System.out.print("\nEscolha uma opcao:\n\n" +
                "1 Listar materiais\n" +
                "\n" +
                "2 Adicionar materiais\n"+
                "\n" +
                "3 Voltar\n\n");
        int ent = Erros.erros1();
        switch(ent)
        {
            case 1:
            {
                System.out.print("\nMateriais:\n\n" +
                        "1 Carrinhos: " + Main.materiais.carrinhos+
                        "\n" +
                        "2 Caixas: " + Main.materiais.caixas+
                        "\n" +
                        "3 Sacolas: " + Main.materiais.sacolas+"\n\n");
                break;
            }
            case 2:
            {
                System.out.print("\nAdicionar:\n\n" +
                        "1 Carrinhos." +
                        "\n" +
                        "2 Caixas. "+
                        "\n" +
                        "3 Sacolas.\n"+
                        "\n" +
                        "4 Voltar\n\n");
                ent = Erros.erros1();
                System.out.print("\nDigite a quantidade:\n\n");
                switch (ent)
                {
                    case 1:
                    {
                        Main.materiais.carrinhos= Main.materiais.carrinhos + Erros.erros1();
                        System.out.print("\nMaterial adicionado.\n\n");
                        break;
                    }
                    case 2:
                    {
                        Main.materiais.caixas= Main.materiais.caixas + Erros.erros1();
                        System.out.print("\nMaterial adicionado.\n\n");
                        break;
                    }
                    case 3:
                    {
                        Main.materiais.sacolas= Main.materiais.sacolas + Erros.erros1();
                        System.out.print("\nMaterial adicionado.\n\n");
                        break;
                    }
                    case 4:
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
