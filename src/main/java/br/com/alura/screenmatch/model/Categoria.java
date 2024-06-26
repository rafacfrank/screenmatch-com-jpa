package br.com.alura.screenmatch.model;

public enum Categoria {

    ACAO("action"),
    ROMANCE("romance"),
    COMEDIA("comedy"),
    DRAMA("drama"),
    CRIME("crime");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}
