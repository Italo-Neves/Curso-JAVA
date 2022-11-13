package ex05;

public class Cd extends Produto{
    public Cd(int _codbarra, Double _preco){
        super( _codbarra, _preco);  
    }
    String estilo;
    String artista;
    Double duracao;

    public String getEstilo() {
        return estilo;
    }

    public String getArtista() {
        return artista;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    public Cd(String estilo, String artista, Double duracao, int CodBarra, Double preco) {
        super(CodBarra, preco);
        this.estilo = estilo;
        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Cd{" + "estilo=" + estilo + ", artista=" + artista + ", duracao=" + duracao + '}';
    }


}
