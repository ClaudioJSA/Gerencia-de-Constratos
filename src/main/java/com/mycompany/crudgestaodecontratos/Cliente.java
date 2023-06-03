/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudgestaodecontratos;

/**
 *
 * @author Cláudio Juliano Santos Alcantara <Claudio Juliano at Cláudio Juliano>
 */
public class Cliente {
    private Long id;
    private Long Cpf;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpf() {
        return Cpf;
    }

    public void setCpf(Long Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", Cpf=" + Cpf + ", nome=" + nome + "}\n";
    }
    
}
