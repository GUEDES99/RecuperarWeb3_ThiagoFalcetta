import java.util.ArrayList;

public class Acervo {
    
    private static  ArrayList<EmprestimoDeLivros> listaLivros = new ArrayList<>();

    public static ArrayList<EmprestimoDeLivros> getListaLivros() {
        return listaLivros;
    }

    //Adiciona um objeto na lista
    static public void adicionar(EmprestimoDeLivros l){
        listaLivros.add(l);
    }

    //Lista os dados de todos os objetos da lista 
    static public String Listar(){
        String saida = "";
        int i = 1;
        for(EmprestimoDeLivros l : listaLivros) {
            saida += "\n====== LIVRO Nº" + (i++) + "=====\n";
            saida += l.imprimir() + "\n";
        }

        return saida;
    }

    //Pesquisa por gêreno do livro
    static public int pesquisar(String genero) {
        int qtd = 0;

        for(EmprestimoDeLivros l : listaLivros) {
            if(l.getGenero() .equalsIgnoreCase(genero)) {
                qtd++;
            }
        }

        return qtd;
    }

    //Pesquisar por faixa de preço
    static public int pesquisar(double vInicial, double vFinal) {
        int qtd = 0;

        for(EmprestimoDeLivros l : listaLivros) {
            if(l.getPreco() >= vInicial && l.getPreco() <= vFinal){
                qtd++;
            }
        }

        return qtd;
    }

    //Remover um livro pelo titulo
    static public boolean emprestar(String titulo) {
        for(EmprestimoDeLivros l : listaLivros){
            if(l.getTitulo() .equalsIgnoreCase(titulo)){
                listaLivros.remove(l);
                return true;
            }
        }
        return false;
    }

    //Total do acervo
    static double calcularTotalAcervo(){
        double total = 0;

        for(EmprestimoDeLivros l : listaLivros){
            total += l.getPreco();
        }

        return total;
    }

}
