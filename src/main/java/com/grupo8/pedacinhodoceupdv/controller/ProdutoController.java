package com.grupo8.pedacinhodoceupdv.controller;

import java.util.List;
import com.grupo8.pedacinhodoceupdv.db.ProdutoDao;
import com.grupo8.pedacinhodoceupdv.model.Produto;

public class ProdutoController {

    // SALVAR
    public static String salvar(Produto produto) {

        String resposta = null;

        // Tenta fazer a insercao
        try {
            // ProdutoMock.salvar(produto);
            ProdutoDao.salvar(produto);
        } catch (Exception e) {
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }

        return resposta;
    }

    // PROCURAR/LISTAR
    public static List<Produto> procurar(String nome) {
        List<Produto> listaResposta = null;

        // Tenta fazer a busca dos dados
        try {

            if (nome == null || "".equals(nome)) {
                // listaResposta = ProdutoMock.listar();
                listaResposta = ProdutoDao.listar();
            } else {
                // listaResposta = ProdutoMock.procurar(nome);
                listaResposta = ProdutoDao.procurar(nome);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }

    // ATUALIZAR
    public static String atualizar(Produto produto) {
        String resposta = null;

        try {
            // tenta fazer a atualização
            // ProdutoMock.atualizar(produto);
            ProdutoDao.atualizar(produto);
        } catch (Exception e) {
            // em caso de erro retorna para a classe que chamou com o erro
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    // EXCLUIR
    public static String excluir(Integer id) {
        String resposta = null;

        try {
            // tenta excluir
            // ProdutoMock.excluir(id);
            ProdutoDao.excluir(id);
        } catch (Exception e) {
            // em caso de erro retorna erro para a classe que chamou
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    // OBTER
    public static Produto obter(Integer id) {

        // Instancia produto para retornar no fim da funcao
        Produto produto = new Produto();

        try {
            // tenta obter o produto procurado
            // produto = ProdutoMock.obter(id);
            produto = ProdutoDao.obter(id);
        } catch (Exception e) {
            // em caso de erro imprime erro
            e.printStackTrace();
        }

        return produto;

    }
}
