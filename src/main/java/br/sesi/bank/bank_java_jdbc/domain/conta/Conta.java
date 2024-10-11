package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.Cliente;

import java.math.BigDecimal;

public class Conta {
    private Integer numero;
    private BigDecimal valor;
    private Cliente titular;

    public Conta(Integer numero, BigDecimal valor, Cliente titular){
        this.numero = numero;
        this.valor = valor;
        this.titular = titular;
    }
    public boolean possuiSaldo(){
    return true;
    }

    public void sacar(BigDecimal numero){
    }

    public void depositar(BigDecimal numero){
    }

    public Integer getNumero(){
        return numero;
    }

    //public BigDecimal getSaldo(){
    //}

    public Cliente getTitular(){
        return titular;
    }

}
