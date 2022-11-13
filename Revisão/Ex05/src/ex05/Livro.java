package ex05;

public class Livro extends Produto{
    public Livro(int _codbarra, Double _preco){
        super( _codbarra, _preco);  
    }
    public String titulo;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Livro(String titulo, int CodBarra, Double preco) {
        super(CodBarra, preco);
        this.titulo = titulo;
    }
    
    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + '}';
    }

}
