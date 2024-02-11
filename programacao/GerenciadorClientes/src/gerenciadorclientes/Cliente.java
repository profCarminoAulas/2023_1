/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadorclientes;

/**
 *
 * @author profj
 */
public class Cliente {
    private String nome; 
    private int idade; 
    private String endereco; 
    
    public String lerNome(){ // ler é igual a get
        return this.nome; 
    }
    
    public void atribuirNome( String recebeNome){ // atribuir é igual a set
        this.nome = recebeNome; 
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade( int recebeIdade ){
        this.idade = recebeIdade;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco( String recebeEnd ){
        this.endereco = recebeEnd;
    }
    
    public Cliente( String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade; 
        this.endereco = endereco;
    }
}
