package View;

import Model.Categoria;
import Model.Produto;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static Produto produto;
    private static DateTimeFormatter formatter;
    private static Scanner scanner;

    public static void main(String[] args) {

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        scanner = new Scanner(System.in);
        produto = new Produto();

        while (true){
            System.out.println("-------------------------------------");
            System.out.println("Escolha a opção:" +
                    "\n 1 - Cadastrar" +
                    "\n 2 - Exibir" +
                    "\n 3 - Atualizar" +
                    "\n 4 - Remover" +
                    "\n 5 - Sair");
            System.out.println("-------------------------------------");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    exibirProduto();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
    private static void exibirProduto(){
        System.out.println("Código: " + produto.getCodigo());
        System.out.println("Nome: " + produto.getDescricao());
        System.out.println("Valor:" + produto.getValor());
        System.out.println("Validade: " + produto.getValidade());
    }

    private static void cadastrarProduto() {
        System.out.println("Informe o nome: ");
        String descricao = scanner.nextLine();
        produto.setDescricao(descricao);
        System.out.println("Informe o valor: ");
        float valor = scanner.nextFloat();
        scanner.nextLine();
        produto.setValor(valor);
        System.out.println("Informe a validade: ");
        String validade = scanner.nextLine();
        LocalDate dataValidade = LocalDate.parse(validade, formatter);
        produto.setValidade(dataValidade);
        System.out.println("Informe a Categoria:" +
                "\n1 - Alimentício" +
                "\n2 - Limpeza" +
                "\n3 - Higiene" +
                "\n4 - Bebida");
        int nCategoria = scanner.nextInt();
        scanner.nextLine();
        Categoria categoria;
        if(nCategoria == 1){
            categoria = Categoria.ALIMENTICIO;
        }else if(nCategoria == 2){
            categoria = Categoria.LIMPEZA;
        } else if (nCategoria == 3) {
            categoria = Categoria.HIGIENE;
        }else{
            categoria = Categoria.BEBIDA;
        }
        produto.setCategoria(categoria);
    }
}