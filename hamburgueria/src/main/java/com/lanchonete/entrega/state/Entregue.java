package com.lanchonete.entrega.state;

import com.lanchonete.observer.Observer;
import com.lanchonete.pedido.Pedido;

public class Entregue implements EstadoPedido, Observer {
    @Override
    public void preparar(Pedido p) {
        System.out.println("❌ Não é possível: pedido já foi entregue.");
    }

    @Override
    public void colocarEmRota(Pedido p) {
        System.out.println("❌ Não é possível: pedido já foi entregue.");
    }

    @Override
    public void entregar(Pedido p) {
        System.out.println("✅ Pedido já foi entregue.");
    }

    @Override
    public String getDescricao() {
        return "Entregue";
    }

    @Override
    public void update(Pedido p) {
        System.out.println("📍 [Entregue] Pedido atualizado: " + p.getEstadoDescricao());
    }
}