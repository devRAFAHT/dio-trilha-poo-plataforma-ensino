package br.com.dio.desafio.dominio;

import java.util.HashMap;
import java.util.Map;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private Map<String, String> comentarios = new HashMap<>();
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Map<String, String> getComentarios() {
        return comentarios;
    }

    public void listaComentarios(){
        System.out.println("\nComentários curso: " + getTitulo());

        if(getComentarios().isEmpty()){
            System.out.println("Esse curso ainda não possui comentários.");
        }else {
            for (Map.Entry<String, String> entry : comentarios.entrySet()) {
                System.out.println("\nAutor: " + entry.getKey() + "\nComentário: " + entry.getValue());
            }
        }
    }
}
