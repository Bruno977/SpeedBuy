package com.example.speedbuy;

public class Lojas {
    private String nome;
    private String foto;
    private String estrela;

    public Lojas(String nome, String foto){
        this.nome = nome;
        this.foto = foto;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstrela() {
        return estrela;
    }

    public void setEstrela(String estrela) {
        this.estrela = estrela;
    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
