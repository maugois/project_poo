package entities;

import enums.TipoTransacao;

import java.time.LocalDateTime;

public class Transacao {
    private LocalDateTime data;
    private TipoTransacao tipo;
    private double valor;

    public Transacao(LocalDateTime data, TipoTransacao tipo, double valor) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }
}
