package br.sesi.bank.bank_java_jdbc.domain.cliente;

public class Cliente {

    public String nome;
    public String email;
    public String cpf;

    public Cliente(DadosCadastroCliente dados){
        this.nome = dados.nome;
        this.email = dados.email;
        this.cpf = dados.cpf;
    }

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getCpf(){
        return cpf;
    }
}
