package br.ufpb.dcx.aps.atividades.atv05;

public class Campo {
    private String id;
    private String nome;
    private String valor;

    public Campo(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.valor = "";
    }

    public Campo(String id) {

        this.id = id;
        this.nome = "";
        this.valor = "";
    }

    public String getId() {

        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
    public String getValor(){
        return valor;
    }
    public boolean isPreenchido(){
        if(getValor() == ""){
            return false;
        }
        return true;
    }
}
