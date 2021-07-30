package br.com.main;
import br.com.main.model.Livros;

public class Index {
    public static void main(String[] args){
        /*
            Estudando  Linguagem Java;

        */// obj;
        Livros lv = new Livros();

        // adiciona novo Livro a biblioteca;
        lv.Add("Harry Potter e a Pedra Filosofal","J. K. Rowling");
        lv.Add("Harry Potter e a Câmara Secreta","J. K. Rowling");
        lv.Add("Harry Potter e o Prisioneiro de Askaban","J. K. Rowling");
        lv.Add("Harry Potter e o Cálice de Fogo","J. K. Rowling");
        lv.Add("Harry Potter e a Ordem da Fênix","J. K. Rowling");
        lv.Add("Harry Potter e o Enigma do Príncipe","J. K. Rowling");
        lv.Add("Harry Potter e as Relíquias da Morte","J. K. Rowling");

        // imprime todos os livros da biblioteca;
        lv.PrintAll();
    }
}