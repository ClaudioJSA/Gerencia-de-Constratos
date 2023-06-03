/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudgestaodecontratos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Cláudio Juliano Santos Alcantara <Claudio Juliano at Cláudio Juliano>
 */

public class ClienteDao extends Dao<Cliente>{

    public static final String TABLE = "cliente";
    

    @Override
    public String getSaveStatment() {
        
        return "insert into " + TABLE + "(id, cpf, nome) values (?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set id = ?, cpf = ?, nome = ? where id = ?";
    }
    
    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Cliente e) {
        try {
                pstmt.setString(1, e.getNome());
                pstmt.setLong(2, e.getCpf());

                 if (e.getId() != null) {
                    pstmt.setLong(3, e.getId());
                }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
