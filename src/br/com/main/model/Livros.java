package br.com.main.model;

public class Livros {
    private String[] nome = new String[100];
    private String[] autor = new String[100];
    private int control =0;

    public void Add(String nome, String autor){

            this.nome[control] = nome;
            this.autor[control] = autor;
            this.control += 1;
    }
    public void PrintAll(){

        for(int i=0; i<control;i++) {
            System.out.println("\n Livro: " + (i+1));
            System.out.println(" Livro: " + nome[i] + "\n Autor: " + autor[i]);
        }
    }
}
