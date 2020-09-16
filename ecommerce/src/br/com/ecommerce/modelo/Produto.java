package br.com.ecommerce.modelo;

public class Produto {
    private int id;
    private String descricao;
    private float valorCompra;
    private float valorVenda;
    private int qtde;
    private String tipo;
    
    public Produto() {}
    
    public Produto(int id, String descricao, float valorCompra, float valorVenda, int qtde, String tipo) {
    	this.id = id;
    	this.descricao = descricao;
    	this.valorCompra = valorCompra;
    	this.valorVenda = valorVenda;
    	this.qtde = qtde;
    	this.tipo = tipo;
    }
    
    public void entrarEstoque(int q) {
        qtde+=q;
    }

    public void saidaEstoque(int q) {
        qtde-=q;
    }


    public float cederDesconto(float porcentagem) {
        return valorVenda - valorVenda * (porcentagem/100);
    }


    public void ajustarValores(float porcentagem) {
        valorCompra = valorCompra + valorCompra * (porcentagem/100);
        valorVenda = valorVenda + valorVenda * (porcentagem/100);
    }
    
    public String getEstoque() {
        if (qtde<=5) {
            return "Baixo";
        }else if (qtde>10) {
            return "Alto";
        }else {
            return "Medio";
        }
    }
    public float getPromocao() {
        return valorVenda*(float)0.9;
    }
    
    public float getTotalCompra() {
        return qtde * valorCompra;
    }
    
    public float getTotalVenda() {
        return qtde * valorVenda;
    }
    
    public void setAll(int i, String d, float vc, float vv, int q, String t) {
        id = i;
        descricao=d;
        valorCompra=vc;
        valorVenda=vv;
        qtde=q;
        tipo=t;
    }
    
    public String getAll() {
        return 
                "ID...........: " + id + "\n" +
                "Descrição....: " + descricao + "\n" +
                "Valor Compra.: " + valorCompra + "\n" +
                "Valor Venda..: " + valorVenda + "\n" +
                "Qtde.........: " + qtde + "\n" +
                "Tipo.........: " + tipo;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValorCompra() {
        return valorCompra;
    }
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
	
}
