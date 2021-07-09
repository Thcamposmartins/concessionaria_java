package View;
import java.util.Scanner;
import java.util.ArrayList;

import Model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int op = 0;

        List<String> produto = new Arraylist<>();
        List<String> cliente = new Arraylist<>();
        List<String> venda = new Arraylist<>();
		
        System.out.println("Selecione a opção desejada: ");  
		System.out.println("\n 1 - Cadastrar um Produto");
        System.out.println("\n 2 - Editar Produto");
		System.out.println("\n 3 - Cadastrar Cliente");
        System.out.println("\n 4 - Editar Cliente");
		System.out.println("\n 5 - Cadastrar Venda");
		System.out.println("\n 6 - Relatorios");
		op = in.nextInt();
		
        switch(op) {
		
            case 1:
                Scanner tipoVeiculo = new Scanner(System.in);
                String nome, cor, categoria;
                Double preco;
                Veiculo cadastrarVeiculo;
                
                System.out.println("Qual o nome do veiculo?");
                nome = atributoVeiculo.nextLine();
                System.out.println("Qual a cor do veiculo?");
                cor = atributoVeiculo.nextLine();
                System.out.println("Qual a categoria do veiculo (Hatch, Sedan, SUV ou Picape)?");
                categoria = atributoVeiculo.nextLine();
                System.out.println("Qual o preco do veiculo?");
                preco = atributoVeiculo.nextDouble();
                cadastrarVeiculo.CadastrarVeiculo(nome, cor, categoria, preco);
                produto.add(cadastrarVeiculo);
                }
    
            case 2:
                System.out.println("Selecione o produto que deseja editar: ");
                
                for(String veiculo : produto) {
                    System.out.println(indexOf.veiculo + " - " + veiculo);
                }
                
                Scanner valor = new scanner(System.in);
                Scanner atributoVeiculo = new Scanner(System.in);
                int position;
                Veiculo editarVeiculo;
                System.out.println("Digite a posicao do produto que deseja editar: ");
                position = valor.nextInt();
                System.out.println("O produto que voce ira editar eh o de posicao: " + produto.get(position));
                produto.remove(position);
                System.out.println("Qual o nome do veiculo?");            
                nome = atributoVeiculo.nextLine();
                System.out.println("Qual a cor do veiculo?");
                cor = atributoVeiculo.nextLine();
                System.out.println("Qual a categoria do veiculo (Hatch, Sedan, SUV ou Picape)?");
                categoria = atributoVeiculo.nextInt();
                System.out.println("Qual o preco do veiculo?");
                preco = atributoVeiculo.nextDouble();

                editarVeiculo.CadastrarVeiculo(nome, cor, categoria, preco);;
                produto.add(position, editarVeiculo);
                break;
    
            case 3:
    
    
                break;
            case 4:
    
    
                break;
            case 5:
    
    
                break;
            case 6:
    
    
                break;
        
                
            default: System.out.println("\n Opcao invalida! Escolha a opçao digitando um numero de 1 a 6");
        }
}
