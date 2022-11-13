
package ex05;
public class Produto {
    
    int CodBarra;
    Double preco;

    public int getCodBarra() {
        return CodBarra;
    }

    public Double getPreco() {
        return preco;
    }

    public void setCodBarra(int CodBarra) {
        this.CodBarra = CodBarra;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto(int CodBarra, Double preco) {
        this.CodBarra = CodBarra;
        this.preco = preco;
    }
 
    
}
