package com.grupo8.pedacinhodoceupdv.view;

import java.awt.Color;
import java.awt.Font;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import com.grupo8.pedacinhodoceupdv.controller.ProdutoController;
import com.grupo8.pedacinhodoceupdv.fonts.FontManager;
import com.grupo8.pedacinhodoceupdv.model.Produto;

public class ProdutoConsultaView extends javax.swing.JInternalFrame {
    // ==============================================================================
    // NAO MEXER
    // ==============================================================================
    // INICIALIZAÇÃO DOS COMPONENTES
    public ProdutoConsultaView() {
        initComponents();
    }

    // CÓDIGO GERADOR DA INTERFACE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoTabela = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        setPreferredSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(17, 128, 216));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(853, 29));
        jPanel2.setMinimumSize(new java.awt.Dimension(853, 29));
        jPanel2.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Consulta de Produto");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome do Produto");

        txtProdutoNome.setBackground(new java.awt.Color(255, 255, 255));
        txtProdutoNome.setForeground(new java.awt.Color(0, 0, 0));

        btnPesquisar.setBackground(new java.awt.Color(17, 128, 216));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        produtoTabela.setBackground(new java.awt.Color(255, 255, 255));
        produtoTabela.setForeground(new java.awt.Color(255, 255, 255));
        produtoTabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "Id", "Nome", "Categoria", "Quantidade", "Custo", "Valor"
                }) {
            Class[] types = new Class[] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                    java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        produtoTabela.setMinimumSize(new java.awt.Dimension(105, 400));
        produtoTabela.setPreferredSize(new java.awt.Dimension(225, 400));
        produtoTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(produtoTabela);
        if (produtoTabela.getColumnModel().getColumnCount() > 0) {
            produtoTabela.getColumnModel().getColumn(0).setResizable(false);
            produtoTabela.getColumnModel().getColumn(0).setPreferredWidth(3);
            produtoTabela.getColumnModel().getColumn(2).setResizable(false);
            produtoTabela.getColumnModel().getColumn(2).setPreferredWidth(10);
            produtoTabela.getColumnModel().getColumn(3).setResizable(false);
            produtoTabela.getColumnModel().getColumn(3).setPreferredWidth(5);
            produtoTabela.getColumnModel().getColumn(4).setResizable(false);
            produtoTabela.getColumnModel().getColumn(4).setPreferredWidth(5);
            produtoTabela.getColumnModel().getColumn(5).setResizable(false);
            produtoTabela.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(79, 32));
        btnSair.setMinimumSize(new java.awt.Dimension(79, 32));
        btnSair.setPreferredSize(new java.awt.Dimension(79, 32));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(0, 102, 51));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(79, 32));
        btnAlterar.setMinimumSize(new java.awt.Dimension(79, 32));
        btnAlterar.setPreferredSize(new java.awt.Dimension(79, 32));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(153, 0, 0));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(79, 32));
        btnDeletar.setMinimumSize(new java.awt.Dimension(79, 32));
        btnDeletar.setPreferredSize(new java.awt.Dimension(79, 32));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(txtProdutoNome)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnPesquisar)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ==============================================================================
    // DECLARAÇÕES
    // ==============================================================================
    // DECLARA O MODELO DE TABELA PARA SER USADO NA PESQUISA
    private DefaultTableModel tableModel;

    // INSTANCIA DA TELA DE CADASTRO/ALTERACAO DE PRODUTO
    ProdutoCadastroAlteracaoView produtoCadastroAlteracao;

    // ==============================================================================
    // FUNÇÕES
    // ==============================================================================
    // NAO ESTA SENDO USADO
    public void tableModelLimpar() {
        // NAO ESTA SENDO USADO
        if (tableModel == null) {
            // Obtém a tabela para trabalhar nela
            tableModel = (DefaultTableModel) produtoTabela.getModel();
        }
        // Limpa resultados anteriores
        tableModel.setRowCount(0);
    }

    // PESQUISAR PRODUTO
    public void pesquisar() {
        List<Produto> resultado = ProdutoController.procurar(
                txtProdutoNome.getText());

        // Obtém a tabela para trabalhar nela
        tableModel = (DefaultTableModel) produtoTabela.getModel();

        // Limpa resultados anteriores
        tableModel.setRowCount(0);

        if (resultado != null && resultado.size() > 0) {
            // Percorre a lista de resultados e os adiciona na tabela
            for (int i = 0; i < resultado.size(); i++) {

                // Obtém cada item da lista de resultados
                Produto produto = resultado.get(i);

                if (produto != null) {
                    // Cria array com resultados
                    Object[] dadosTabela = new Object[6];
                    // Cada dado na coluna correspondente
                    dadosTabela[0] = produto.getId();
                    dadosTabela[1] = produto.getNome();
                    dadosTabela[2] = produto.getCategoria();
                    dadosTabela[3] = produto.getQuantidade();
                    dadosTabela[4] = produto.getCusto();
                    dadosTabela[5] = produto.getValor();

                    // Adiciona a linha de dados na tabela
                    tableModel.addRow(dadosTabela);
                }
            }
        } else {

            // Caso a pesquisa não tenha retornado resultados
            JOptionPane.showMessageDialog(rootPane,
                    "Não existem resultados para a sua pesquisa!",
                    "Não há dados",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // ==============================================================================
    // EVENTOS
    // ==============================================================================
    // SAIR DA TELA
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }// GEN-LAST:event_btnSairActionPerformed

    // DELETAR PRODUTO
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeletarActionPerformed
        // verifica se tem dados na tabela visual
        if (produtoTabela.getSelectedRow() >= 0) {
            // Obtém a linha do item selecionado na tabela visual
            final int row = produtoTabela.getSelectedRow();

            // obtem nome do produto para confirmar exclusao
            String nome = (String) produtoTabela.getValueAt(row, 1);

            // Mostra o diálogo de confirmação de exclusão
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão",
                    JOptionPane.YES_NO_OPTION);

            // verifica se sim ou nao para exclusao
            if (respostaConfirmacao == JOptionPane.YES_OPTION) {
                // Obtém o ID do produto da tabela visual
                Integer idProduto = (Integer) produtoTabela.getValueAt(row, 0);

                // Solicita ao serviço a exclusão do produto com o ID
                String respostaController = ProdutoController.excluir(idProduto);

                // verifica se deu certo a exclusao
                if (respostaController == null) {
                    // pesquisa novamente para exibir os dados modificados
                    pesquisar();
                } else {
                    // Exibe a mensagem de erro ao usuário
                    JOptionPane.showMessageDialog(
                            rootPane,
                            respostaController
                                    + "\n Procure o administrador do sistema!",
                            "Falha na Exclusão",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }// GEN-LAST:event_btnDeletarActionPerformed

    // PESQUISAR PRODUTO
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
    }// GEN-LAST:event_btnPesquisarActionPerformed

    // ALTERA UM PRODUTO
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAlterarActionPerformed

        // obtem a linha da tabela
        int row = produtoTabela.getSelectedRow();

        // obtem o id dessa linha
        Integer idProduto = (Integer) produtoTabela.getValueAt(row, 0);

        // chama o controller para obter o produto do id selecionado (nova instancia de
        // produto)
        Produto produto = ProdutoController.obter(idProduto);

        // verifica se produto é válido
        if (produto != null) {
            // verifica se a tela ja existe
            if (produtoCadastroAlteracao == null) {
                // se não existir faz uma tela
                produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
            }
            // seta o produto da tela de cadastro alteracao com o cliente obtido
            produtoCadastroAlteracao.setProduto(produto);

            // Configura a tela de cadastro/alteracao como uma tela de alteracao
            produtoCadastroAlteracao.setModoEdicao(true);

            // coloca a tela com cabecario e titulo de alteracao de produto
            produtoCadastroAlteracao.setCabecario("Alteração do Produto: "
                    + produto.getNome());
            // produtoCadastroAlteracao.setTitle("PDV Vendas / Consulta de Produto /
            // Alteração de Produto");

            // mostro a tela no painel principal
            this.getParent().add(produtoCadastroAlteracao);// ESTAAAAA DANDO ERRRRROOOOOOO VER COM PROFESSOR
            produtoCadastroAlteracao.setVisible(true);

            // coloco ela na frente de todas
            produtoCadastroAlteracao.toFront();

            // coloco as informacoes do produto na tela
            produtoCadastroAlteracao.carregarDadosTela();

            // redimensiona tela para tamanho do painel
            try {
                produtoCadastroAlteracao.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
            }

            // retira o painel superior
            ((BasicInternalFrameUI) produtoCadastroAlteracao.getUI()).setNorthPane(null);
        } else {
            // informa ao usuário que não foi possível abrir o cliente para edição
            JOptionPane.showMessageDialog(rootPane,
                    "Não foi possível localizar este produto para edição. "
                            + "\n Procure o administrador do sistema!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_btnAlterarActionPerformed

    // INTERFACE INICIA
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
        // Muda a cor do cabecalho da tabela
        produtoTabela.getTableHeader().setBackground(new Color(017, 128, 216));
        produtoTabela.getTableHeader().setForeground(Color.white);

        // Muda a cor da fonte da tabela
        produtoTabela.setForeground(Color.black);

        // Altera o tamanha da fonte do cabecalho do form
        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }// GEN-LAST:event_formInternalFrameOpened

    // ==============================================================================
    // NAO MEXER
    // ==============================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JTable produtoTabela;
    private javax.swing.JTextField txtProdutoNome;
    // End of variables declaration//GEN-END:variables
}
