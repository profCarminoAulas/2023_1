/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author profj
 */
public class Genero {
    private int idGenero;
    private String nome;

    // Construtor
    public Genero(int idGenero, String nome) {
        this.idGenero = idGenero;
        this.nome = nome;
    }

    // Métodos Getters e Setters
    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: " + idGenero + " | Nome: " + nome;
    }
}
