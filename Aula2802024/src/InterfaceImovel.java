//Tds os atributos de uma interface são por natureza static ou final.
public interface InterfaceImovel {
    //String tamanho; -> Não posso fazer isso, pq não tenho construtor na inface.
    //Posso ter constantes.
    String tamanho = "50m/2"; //é uma constante.
    //Assinaturas:
    int definirMetroQuadrado(int x);
    //Default: padrão. Comportamento em comum.
    default void emitirPlanta(String dadosPalnta){
        System.out.println("Emitindo planta:"+dadosPalnta);
    }
}
