import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Produto produto = new Produto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Conferencia de Estoque:");

        System.out.print("nome do produto: ");
        produto.produto = sc.nextLine();
        System.out.print("preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("quantidade: ");
        produto.quantidade = sc.nextInt();
        System.out.println();

        System.out.println("Estoque de Hoje: " + produto);

        System.out.println("Digite a quantidade que será adicionada: ");
        int quantidade = sc.nextInt();
        produto.AddProduto(quantidade);

        System.out.println("Estoque Atualizado: " + produto);
        System.out.println();

        System.out.print("Deseja retirar do Estoque: ");
        char opcao = sc.next().charAt(0);

        if (opcao == 's'){
            System.out.println("Digite a quantidade á ser retirado: ");
            int remove = sc.nextInt();
            produto.RemoveProduto(remove);
        }
        else {

        }
        System.out.println(produto);




        sc.close();
    }
}