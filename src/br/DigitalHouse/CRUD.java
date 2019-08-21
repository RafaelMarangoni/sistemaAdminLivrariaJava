package br.DigitalHouse;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD extends Livro implements Cadastrar, Deletar {
    ArrayList<Livro> livro = new ArrayList<>();


    @Override
    public void deletar() {
        Scanner deletar = new Scanner(System.in);
        System.out.println("Qual livro voce quer deletar ???");
        String deletar_livro = deletar.next();
        //remove(deletar_livro);
        System.out.println("livro"+ deletar_livro + "foi deletado");
    }

    @Override
    public void cadastrar() {
        Scanner adicionar = new Scanner(System.in);
        System.out.println("Digite o nome do Livro:");
        String nome_livro = adicionar.next();
        System.out.println("digite o codigo do livro:");
        int codigo_livro = adicionar.nextInt();
        System.out.println("digite o autor do livro:");
        String autor = adicionar.next();
        System.out.println("digite o ano de lançamento do livro:");
        int lancamento = adicionar.nextInt();
        System.out.println("digite o codigo da ISBN do livro:");
        int codigo_ISBN= adicionar.nextInt();
        System.out.println("digite o estoque do livro:");
        int  estoque = adicionar.nextInt();

        Livro cadastro = new Livro();
        cadastro.setTitulo(nome_livro);
        cadastro.setCodigo(codigo_livro);
        cadastro.setAutor(autor);
        cadastro.setAno_de_lancamento(lancamento);
        cadastro.setCodigo_ISBN(codigo_ISBN);
        cadastro.setEstoque(estoque);

        livro.add(cadastro);



    }

    public void consultar(){
        Scanner consulta = new Scanner(System.in);
        System.out.println("Qual livro voce esta procurando ?");
        String titulo = consulta.next();
            for (int i = 0; i < livro.size();i++) {
                if(livro.get(i).getTitulo().equals(titulo)  &&  livro.get(i).getEstoque() > 0){
                    System.out.println("nos temos o esse livro em estoque");
                  compra();
                }else{
                    System.out.println("desculpe, nós nao possuimos esse livro, gostaria de fazer uma encomenda");
                }
            }


        }

        public void compra(){
        Scanner compra = new Scanner(System.in);
            System.out.println("Quantos livros o você deseja ?");
            int quantidade = compra.nextInt();
            if (getEstoque()>0){
                setEstoque(getEstoque() - quantidade);
            }
        }




}
