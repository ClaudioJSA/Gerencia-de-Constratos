/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudgestaodecontratos;

import java.sql.PreparedStatement;


/**
 *
 * @author Cláudio Juliano Santos Alcantara <Claudio Juliano at Cláudio Juliano>
 * @param <T> Data type
 */
public interface IDao<T> {

    // Save
    public String getSaveStatment();

    public String getUpdateStatment();

    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, T e);

    public Long saveOrUpdate(T e);

}