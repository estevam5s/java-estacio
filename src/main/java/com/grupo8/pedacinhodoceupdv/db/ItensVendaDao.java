package com.grupo8.pedacinhodoceupdv.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.grupo8.pedacinhodoceupdv.model.ItemVenda;

public class ItensVendaDao {
    public static void salvar(ItemVenda itemVenda)
            throws SQLException, Exception {

        String sql = "INSERT INTO DBPEDACINHODOCEU.TBITEMVENDA(idVenda, idItem, "
                + "nomeProduto, idProduto, qtdItens, valor, valorTotal) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?);";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConnectionUtils.obterConexao();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, itemVenda.getIdVenda());
            preparedStatement.setInt(2, itemVenda.getIdItem());
            preparedStatement.setString(3, itemVenda.getNome());
            preparedStatement.setInt(4, itemVenda.getId());
            preparedStatement.setInt(5, itemVenda.getQuantidade());
            preparedStatement.setFloat(6, itemVenda.getValor());
            preparedStatement.setFloat(7, itemVenda.getValorTotal());

            preparedStatement.execute();
        } finally {

            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static List<ItemVenda> obterItens(Integer id)
            throws SQLException, Exception {

        String sql = "SELECT idVenda, idItem, nomeProduto, idProduto, qtdItens, "
                + "valorTotal, valor FROM DBPEDACINHODOCEU.TBITEMVENDA WHERE idVenda =?";

        List<ItemVenda> listaItensVenda = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaItensVenda == null) {
                    listaItensVenda = new ArrayList<ItemVenda>();
                }
                ItemVenda itemVenda = new ItemVenda();
                itemVenda.setIdVenda(result.getInt("idVenda"));
                itemVenda.setIdItem(result.getInt("idItem"));
                itemVenda.setNome(result.getString("nomeProduto"));
                itemVenda.setId(result.getInt("idProduto"));
                itemVenda.setQuantidade(result.getInt("qtdItens"));
                itemVenda.setValorTotal(result.getFloat("valorTotal"));
                itemVenda.setValor(result.getFloat("valor"));

                listaItensVenda.add(itemVenda);
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaItensVenda;
    }
}
