package br.DigitalHouse;

public class main {
    public static void main(String[] args) {

        CRUD livro = new CRUD();
        livro.cadastrar();

        livro.consultar();

        System.out.println(livro.toString());
    }
}
