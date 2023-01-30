package dev.fujioka.pedrobarros.Consumer;
import dev.fujioka.pedrobarros.model.Cliente;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ClienteCPFConsumer {

    @JmsListener(destination = "Cliente_queue")
    public void receiveMessage(Cliente cliente) {
        System.out.println("Mensagem da fila Cliente:" + cliente.getCpf());
    }
}
