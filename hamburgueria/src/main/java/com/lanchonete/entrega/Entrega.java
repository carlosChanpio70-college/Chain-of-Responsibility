package com.lanchonete.entrega;

import com.lanchonete.pedido.Pedido;

/**
 * Interface que representa uma estratégia de entrega.
 * Faz parte do padrão Strategy como o "Strategy".
 */
public interface Entrega {

    /**
     * Processa o pedido de acordo com a estratégia de entrega.
     *
     * @param p pedido a ser processado
     */
    void processar(Pedido p);
}
