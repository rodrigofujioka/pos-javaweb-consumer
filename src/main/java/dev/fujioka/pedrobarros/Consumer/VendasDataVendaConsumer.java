package dev.fujioka.pedrobarros.Consumer;

import dev.fujioka.pedrobarros.model.Vendas;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class VendasDataVendaConsumer {

    @JmsListener(destination = "Vendas_queue")
    public void receiveMessage(Vendas vendas) {
        System.out.println("Mensagem da fila Vendas:" + vendas.getDatavenda());
    }
}
