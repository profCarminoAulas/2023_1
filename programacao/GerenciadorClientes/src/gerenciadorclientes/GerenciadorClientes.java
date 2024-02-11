/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciadorclientes;

import java.util.Scanner;

/**
 *
 * @author profj
 */
public class GerenciadorClientes {
    private int quantidadedeClientes;
    private int capacidade; 
    private Cliente[] clientes;
    
    public GerenciadorClientes( int recebeCapacidade ){
        this.capacidade = recebeCapacidade; 
        clientes = new Cliente[ this.capacidade ];
        this.quantidadedeClientes = 0;
    }
    
    public void adicionarCliente( Cliente recebeCliente ){
        if( this.quantidadedeClientes < this.capacidade){
            this.clientes[this.quantidadedeClientes] = recebeCliente;
            //this.quantidadedeClientes = this.quantidadedeClientes + 1;
            //this.quantidadedeClientes += 1;
            this.quantidadedeClientes++;
            System.out.println("Cliente inserido com sucesso...");
        } else {
            System.out.println("Limite de clientes atingido..");
        }
    }
    
    public void alterarCliente( String nome, Cliente recebeCliente){
        // busca sequencial
        for( int i = 0; i < this.quantidadedeClientes; i++){     
            if(this.clientes[i].lerNome().equals(nome)){
                this.clientes[i] = recebeCliente;
                System.out.println("Dados alterados com sucesso...");
                return; 
            }
        }
        System.out.println("Cliente não encontrado...");
    }
    
    public void listarClientes(){
        System.out.println("Listagem de clientes");
        for( int i =0; i < this.quantidadedeClientes; i++){
            Cliente cliente = clientes[i];
            System.out.println("Nome....: " + cliente.lerNome());
            System.out.println("Endereco: " + cliente.getEndereco());
            System.out.println("Idade...: " + cliente.getIdade());
            System.out.println("------------------------");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao gerenciador de cliente ...");
        // solicita ao usuário digitar a capacidade do vetor de clientes
        System.out.println("Digite a capacidade para cliente: ");
        int novaCapacidade = entrada.nextInt();
        entrada.nextLine(); // limpar buffer
        
        GerenciadorClientes gerenciador = new GerenciadorClientes(novaCapacidade);
        
        int opcao=0; 
        
        do {
            System.out.println("Menu");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Alterar cliente");
            System.out.println("3. Listar clientes");
            System.out.println("4. Sair");
            
            opcao = entrada.nextInt();
            entrada.nextLine(); // limpar buffer
            if( opcao == 1 ){
                System.out.print("Nome....: ");
                String nome = entrada.nextLine();
                System.out.print("Idade...: ");
                int idade =entrada.nextInt();
                entrada.nextLine();
                System.out.print("Endereco:");
                String endereco = entrada.nextLine();
                gerenciador.adicionarCliente(new Cliente(nome, idade, endereco));
            } else if(opcao == 2 ){
                System.out.print("Nome do cliente a alterar:");
                String nome = entrada.nextLine();
                System.out.print("Novo nome:....: ");
                String novoNome = entrada.nextLine();
                System.out.print("Novo endereco.: ");
                String novoEndereco = entrada.nextLine();
                System.out.print("Nova Idade....: ");
                int novaIdade = entrada.nextInt();
                gerenciador.alterarCliente(
                        nome, 
                        new Cliente(novoNome, novaIdade, novoEndereco));
                
            } else if(opcao == 3 ){ 
                gerenciador.listarClientes();
            }

        } while(opcao != 4);
    }
    
}
