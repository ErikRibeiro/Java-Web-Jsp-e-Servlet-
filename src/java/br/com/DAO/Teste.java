/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;
import java.sql.SQLException;
/**
 *
 * @author erikr
 */
public class Teste extends DAO{
    public static void main(String[] args) throws SQLException {
        DAO dao = new DAO();
        dao.abrirBanco();
    }
}
