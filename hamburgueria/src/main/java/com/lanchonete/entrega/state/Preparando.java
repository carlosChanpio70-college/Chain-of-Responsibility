package com.lanchonete.entrega.state;

import com.lanchonete.observer.Observer;
import com.lanchonete.pedido.Pedido;

public class Preparando implements EstadoPedido, Observer {
    @Override
    public void preparar(Pedido p) {
        System.out.println("✅ Pedido já está em preparação.");
    }

    @Override
    public void colocarEmRota(Pedido p) {
        System.out.println("🚀 Pedido saindo para entrega...");
        p.setEstado(new EmRota());
        p.notifyObservers();
    }

    @Override
    public void entregar(Pedido p) {
        System.out.println("❌ Não é possível entregar: pedido ainda em preparação.");
    }

    @Override
    public String getDescricao() {
        return "Preparando";
    }

    @Override
    public void update(Pedido p) {
        System.out.println("📍 [Preparando] Pedido atualizado: " + p.getEstadoDescricao());
    }
}