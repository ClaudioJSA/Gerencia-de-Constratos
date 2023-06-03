/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudgestaodecontratos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Cláudio Juliano Santos Alcantara <Claudio Juliano at Cláudio Juliano>
 * @param <T> Entity data type
 */
public abstract class Dao<T> implements IDao<T> {

    public static final String DB = "GestaoDeContratos";

    @Override
    public Long saveOrUpdate(T e) {

        Long id = 0L;

        if (((Entity) e).getId() == null || ((Entity) e).getId() == 0) {
            try ( PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(getSaveStatment(),Statement.RETURN_GENERATED_KEYS)) {

                composeSaveOrUpdateStatement(preparedStatement, e);
                System.out.println(">> SQL: " + preparedStatement);
                preparedStatement.executeUpdate();
                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                if (resultSet.next()) {
                    id = resultSet.getLong(1);
                }
                System.out.println("Saved.\n");
            } catch (Exception ex) {
                System.out.println(">> " + ex);
            }
        } else {
            try ( PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(getUpdateStatment())) {

                composeSaveOrUpdateStatement(preparedStatement, e);
                System.out.println(">> SQL: " + preparedStatement);
                preparedStatement.executeUpdate();
                id = ((Entity) e).getId();
            } catch (Exception ex) {
                System.out.println("Exception: " + ex);
            }
        }
        return id;
    }
}