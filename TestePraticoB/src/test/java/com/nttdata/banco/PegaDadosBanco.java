package com.nttdata.banco;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PegaDadosBanco {

    public static String nomeDoPoduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String nomeDoProduto = null;
        while (result.next()) {
            nomeDoProduto = result.getString("NAME_PRODUCT");
            System.out.println(nomeDoProduto);

        }
        return nomeDoProduto;

    }

    public static String customizationDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String customizationDoProduto = null;
        while (result.next()) {
            customizationDoProduto = result.getString("CUSTOMIZATION");
            System.out.println(customizationDoProduto);

        }
        return customizationDoProduto;

    }

    public static String displayDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String displayDoProduto = null;
        while (result.next()) {
            displayDoProduto = result.getString("DISPLAY");
            System.out.println(displayDoProduto);

        }
        return displayDoProduto;

    }

    public static String displayResolutionDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String displayResolutionDoProduto = null;
        while (result.next()) {
            displayResolutionDoProduto = result.getString("DISPLAY_RESOLUTION");
            System.out.println(displayResolutionDoProduto);

        }
        return displayResolutionDoProduto;

    }

    public static String displaySizeDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String displaySizeDoProduto = null;
        while (result.next()) {
            displaySizeDoProduto = result.getString("DISPLAY_SIZE");
            System.out.println(displaySizeDoProduto);

        }
        return displaySizeDoProduto;

    }

    public static String memoryDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String memoryDoProduto = null;
        while (result.next()) {
            memoryDoProduto = result.getString("MEMORY");
            System.out.println(memoryDoProduto);

        }
        return memoryDoProduto;

    }

    public static String operatingSystemDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String operatingSystemDoProduto = null;
        while (result.next()) {
            operatingSystemDoProduto = result.getString("OPERATING_SYSTEM");
            System.out.println(operatingSystemDoProduto);

        }
        return operatingSystemDoProduto;

    }

    public static String processadorDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String processadorDoProduto = null;
        while (result.next()) {
            processadorDoProduto = result.getString("PROCESSOR");
            System.out.println(processadorDoProduto);

        }
        return processadorDoProduto;

    }

    public static String touchscreenDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String touchscreenDoProduto = null;
        while (result.next()) {
            touchscreenDoProduto = result.getString("TOUCHSCREEN");
            System.out.println(touchscreenDoProduto);

        }
        return touchscreenDoProduto;

    }

    public static String weightDoProduto() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String weightDoProduto = null;
        while (result.next()) {
            weightDoProduto = result.getString("WEIGHT");
            System.out.println(weightDoProduto);

        }
        return weightDoProduto;

    }

    public static String corParaEcolha() throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "select * from massas";

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();
        //System.out.println("Foiii");
        String corParaEcolha = null;
        while (result.next()) {
            corParaEcolha = result.getString("COLOR");
            System.out.println(corParaEcolha);

        }
        return corParaEcolha;

    }

    public static void alteraCor(String cor) throws SQLException {
        Connection connection;
        connection = new Conexao().conectaBD();

        String sql = "UPDATE massas SET COLOR='" + cor + "'where IDMASSAS='2'";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.executeUpdate();
        //System.out.println("Foiii");
        //String corParaEcolha = null;
        // while (result.next()) {
        //     corParaEcolha = result.getString("COLOR");
        //    System.out.println(corParaEcolha);

    }


}

