package dev.fujioka.pedrobarros.Consumer;

import dev.fujioka.pedrobarros.model.Produto;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ProdutoDescricaoConsumer {

    @JmsListener(destination = "Produto_queue")
    public void receiveMessage(Produto produto) {
        System.out.println("Mensagem da fila Produto:" + produto.getDescricao());
    }
}
