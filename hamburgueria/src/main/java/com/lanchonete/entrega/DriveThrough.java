package com.lanchonete.entrega;

import com.lanchonete.pedido.Pedido;

/**
 * Estratégia de entrega via Drive-Through.
 */
public class DriveThrough implements Entrega {

    @Override
    public void processar(Pedido p) {
        System.out.printf(
            "[DRIVE-THROUGH] Pedido pronto para retirada na janela! Total: R$ %.2f%n",
            p.calcularTotal()
        );
        System.out.println("[DRIVE-THROUGH] Itens: " + p.descricao());
    }
}
