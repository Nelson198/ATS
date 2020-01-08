package utils;

/**
 * Interface relativa à classificação de clientes / veículos.
 * 
 */

public interface Classificacao {
    
    /**
     * Método que devolve a classificação.
     * @return int Representa a classificação.
     */
    int getClassificacao();
    
    /**
     * Método que altera o valor do campo classificação.
     * @param classificacao utils.Classificacao nova.
     */
    void setClassificacao(int classificacao);
}
