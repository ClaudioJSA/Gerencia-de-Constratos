/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudgestaodecontratos;

import java.time.LocalDate;

/**
 *
 * @author Cláudio Juliano Santos Alcantara <Claudio Juliano at Cláudio Juliano>
 */

public class Contrato {
    private Long id;
    private String redacao;
    private LocalDate ultimaatualizacao;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRedacao() {
        return redacao;
    }

    public void setRedacao(String redacao) {
        this.redacao = redacao;
    }

    public LocalDate getUltimaatualizacao() {
        return ultimaatualizacao;
    }

    public void setUltimaatualizacao(LocalDate ultimaatualizacao) {
        this.ultimaatualizacao = ultimaatualizacao;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", redacao=" + redacao + ", ultimaatualizacao=" + ultimaatualizacao + "}\n";
    }
    
    
}
