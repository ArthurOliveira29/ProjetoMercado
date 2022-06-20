package Main;

import java.util.Calendar;

public class Estoque extends Localização {
    private String nome;
    private double preco;
    private Calendar validade;
    private int idProduto;
    private double quantidade;
    private boolean disponibilidade;
    
    public Estoque(String nome, double preco, Calendar validade, int idProduto, double quantidade, boolean disponibilidade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.disponibilidade = disponibilidade;
    }
    
    public boolean checaValidade(){
        Calendar dataDaVerificacao = Calendar.getInstance();
        return this.validade.before(dataDaVerificacao.getTime());
    }
    
    public boolean checaDisponibilidade(){
      
        return this.disponibilidade;
    
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValidade(Calendar validade) {
        this.validade = validade;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Calendar getValidade() {
        return validade;
    }

    public int getIdProduto() {
        return idProduto;
    }
    
    public double getQuantidade() {
        return quantidade;
    }  
    
    public boolean getDisponibilidade() {
        return disponibilidade;
    } 
}
