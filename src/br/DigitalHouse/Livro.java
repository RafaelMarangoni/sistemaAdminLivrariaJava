package br.DigitalHouse;

import java.util.ArrayList;

public class Livro {
    int codigo;
    String titulo;
    String autor;
    int ano_de_lancamento;
    int codigo_ISBN;
    int estoque;




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_de_lancamento() {
        return ano_de_lancamento;
    }

    public void setAno_de_lancamento(int ano_de_lancamento) {
        this.ano_de_lancamento = ano_de_lancamento;
    }

    public int getCodigo_ISBN() {
        return codigo_ISBN;
    }

    public void setCodigo_ISBN(int codigo_ISBN) {
        this.codigo_ISBN = codigo_ISBN;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano_de_lancamento=" + ano_de_lancamento +
                ", codigo_ISBN=" + codigo_ISBN +
                ", estoque=" + estoque +
                '}';
    }
}
