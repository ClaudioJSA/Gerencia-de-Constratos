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
public class ContratoDao extends Dao<Contrato>{

    public static final String TABLE = "contrato";
    

    @Override
    public String getSaveStatment() {
        
        return "insert into " + TABLE + "(id, redacao, ultimaatualizacao, idendereco) values (?, ?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        
        return "update " + TABLE + "set id = ?, redacao = ?, ultimaatualizacao = ? where id = ?";
    }
    
    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Contrato e) {
        try {
                pstmt.setString(1, e.getRedacao());

                 if (e.getId() != null) {
                    pstmt.setLong(2, e.getId());
                }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
