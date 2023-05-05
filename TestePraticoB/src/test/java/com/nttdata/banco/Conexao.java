package com.nttdata.banco;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection conectaBD() {

        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/banco_teste_automacao?user=root&password=admin";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + erro.getMessage());

        }

        return conn;
    }
}

